package com.saran.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Emp {
	@ApiModelProperty(position=1,required=true,value="1001")
   private int empId;
	@ApiModelProperty(position=2,required=true,value="Amaar")
   private String empName;
   
 
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}

}
