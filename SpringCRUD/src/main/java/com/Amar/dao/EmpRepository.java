package com.Amar.dao;

import org.springframework.data.repository.CrudRepository;

import com.Amar.model.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer> {
	
	
}
