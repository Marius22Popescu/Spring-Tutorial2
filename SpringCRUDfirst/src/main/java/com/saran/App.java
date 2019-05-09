package com.saran;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService service = (EmpService) ctx.getBean("empService");
		Employee emp = new Employee();
		emp.setEmpName("Amaar");
		service.saveEmp(emp);
		ctx.close();
}
}
