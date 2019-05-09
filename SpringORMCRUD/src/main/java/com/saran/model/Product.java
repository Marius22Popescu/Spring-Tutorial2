package com.saran.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_crud2")
public class Product {
	@Id //@GeneratedValue
	@Column(name="product_id")
	private int prId;
	
	@Column(name="product_name")
	private String prdName;
	
	@Column(name="product_price")
	private int productPrice;
	
	@Override
	public String toString() {
		return "Product [prId=" + prId + ", productName=" + prdName + ", productPrice=" + productPrice + "]";
	}
	
	
	public int getPrId() {
		return prId;
	}
	public void setPrId(int prId) {
		this.prId = prId;
	}
	public String getProductName() {
		return prdName;
	}
	public void setProductName(String productName) {
		this.prdName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
}
