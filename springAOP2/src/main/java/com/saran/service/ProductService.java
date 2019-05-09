package com.saran.service;

public class ProductService {
	private int prdId;
	private String prdName;
	
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	
public void printThrowsExceptions() {
	throw new IllegalArgumentException();
}
@Override
public String toString() {
	return "ProductService [prdId=" + prdId + ", prdName=" + prdName + "]";
}
	
	
}
