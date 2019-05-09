package com.saran.batch.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.saran.batch.listener.JobCompletionNotificationListener;
import com.saran.batch.model.Employee;
 
import com.saran.batch.processor.EmpItemProcessor;
 

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public DataSource dataSource;

    @Bean
    public FlatFileItemReader<Employee> reader() {
        FlatFileItemReader<Employee> reader = new FlatFileItemReader<Employee>();
        reader.setResource(new ClassPathResource("inputData.csv"));
        reader.setLineMapper(new DefaultLineMapper<Employee>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(new String[] {"eno","ename","esal" });
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<Employee>() {{
                setTargetType(Employee.class);
            }});
        }});
        return reader;
    }

    @Bean
    public EmpItemProcessor processor() {
        return new EmpItemProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<Employee> writer() {
        JdbcBatchItemWriter<Employee> writer = new JdbcBatchItemWriter<Employee>();
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Employee>());
        writer.setSql("INSERT INTO emp (eno,ename,esal) VALUES (:eno, :ename,:esal)");
        writer.setDataSource(dataSource);
        return writer;
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1())
                .end()
                .build();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<Employee, Employee> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }
}