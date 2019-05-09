package com.saran.batch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import com.saran.batch.model.Employee;

public class EmpItemProcessor implements ItemProcessor<Employee,Employee> {

    private static final Logger log = LoggerFactory.getLogger(EmpItemProcessor.class);

    @Override
    public Employee process(final Employee emp) throws Exception {
        final int eno = emp.getEno();
        final String ename = emp.getEname().toUpperCase();
        final int esal = emp.getEsal();
        final Employee transformedPerson = new Employee(eno,ename,esal);

        log.info("Converting (" +emp + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }

}