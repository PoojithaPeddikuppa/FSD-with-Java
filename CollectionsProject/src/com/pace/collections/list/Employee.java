package com.pace.collections.list;

public class Employee {
	int id;
	String name;
	Float salary;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(int id,String name,float salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

}
