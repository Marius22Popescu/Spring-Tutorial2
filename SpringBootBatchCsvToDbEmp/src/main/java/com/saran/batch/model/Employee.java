package com.saran.batch.model;

public class Employee {
	
	private int eno;
	public int getEno() {
		return eno;
	}
	public Employee() {}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + "]";
	}
	public Employee(int eno, String ename, int esal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	private String ename;
	private int esal;

}
