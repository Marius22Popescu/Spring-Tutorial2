package com.saran.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saran.model.Emp;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
public class EmpController {
	
	public static final String ID="id";
	@ApiOperation(value="welcome",nickname="saran")
	@ApiResponses(value={
			@ApiResponse(code=500,message="internal server error"),
			@ApiResponse(code=200,message="successful retrieval",
			response=Emp.class,responseContainer="List")
			
	})
	@GetMapping("/emp/saran")
	public List<Emp> display(@ApiParam(value="empId",required=true,
			defaultValue="1001")
	@PathVariable(ID) final String uId){
		List<Emp> emps=new ArrayList<>();
		emps.add(new Emp());
		return emps;
		
		
	}

}
