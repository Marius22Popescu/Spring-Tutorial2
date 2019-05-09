package com.saran;

import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmpDAOImpl implements EmpDAO{
	
	
	public void saveEmp(Employee emp) {
		System.out.println("Employee " +emp.getEmpName()+"saved");
	}
}
