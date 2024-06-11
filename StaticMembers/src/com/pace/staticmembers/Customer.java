package com.pace.staticmembers;

public class Customer {
	private int id;
	private String name;
	private float billAmt;
	public static final String companyName = "Amazon";
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Non Static Block");
	}
		
	public Customer(int id, String name, float billAmt) {
		super();
		this.id = id;
		this.name = name;
		this.billAmt = billAmt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(float billAmt) {
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", "
				+ "billAmt=" + billAmt + "]";
	}
	
	
	

}
