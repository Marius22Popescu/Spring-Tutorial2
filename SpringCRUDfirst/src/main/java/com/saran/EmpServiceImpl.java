package com.saran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpDAO empDAO;
	
	public void saveEmp(Employee emp) {
		empDAO.saveEmp(emp);
		
	}

}
