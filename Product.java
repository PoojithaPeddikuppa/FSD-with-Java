package com.mycom.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//mark class as an Entity 
@Entity
//declaring this class name and Table name
@Table(name="details")

public class Product {
//Defining book id as primary key
	@Id
	@Column
	private int productid;
	@Column
	private String productname; 	
	@Column
	
	private int price;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}