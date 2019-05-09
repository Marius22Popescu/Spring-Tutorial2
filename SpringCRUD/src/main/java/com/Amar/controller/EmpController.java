package com.Amar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Amar.dao.EmpRepository;
import com.Amar.model.Employee;

@Controller
public class EmpController {
	@Autowired
	private EmpRepository empRepo;
	
	@RequestMapping(value="/addNewEmp", method=RequestMethod.POST)
//	@PostMapping("/") u can use it instead of method= method request
	public String newEmployee(Employee emp) {
	empRepo.save(emp);
	return "redirect:/listEmp";
	}
	
	@RequestMapping(value="/listEmp", method=RequestMethod.GET)
//	@GetMapping("/listEmp")
	public ModelAndView listAllEmps() {
	List<Employee> list=(List<Employee>) empRepo.findAll();
	return new ModelAndView("allEmps", "emps", list);
	}
	
	@RequestMapping(value="/addNewEmp", method=RequestMethod.GET)
	public ModelAndView addNewEmp() {
		Employee e1= new Employee();
	return new ModelAndView("newEmp", "form", e1);
	}
	
	
	
	
	
	
	
	

}
