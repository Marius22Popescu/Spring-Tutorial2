package com.saran;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Profile("Dev")
@Configuration
public class DevelopmentDBConfig implements DatabaseConfig{
	@Bean
	public DataSource createDataSource() {
		System.out.println("Development DB Environment");
		DriverManagerDataSource dSource = new DriverManagerDataSource();
		dSource.setUrl("jdbc:mysql://localhost:3306/shoppingCartDB?serverTimezone=UTC");
		dSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dSource.setUsername("root"); dSource.setPassword("M442333244m");
		return dSource;
	}
}
