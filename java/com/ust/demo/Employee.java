package com.ust.demo;

public class Employee{
	
	private int id;
	private String name;
	Address address;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>0 && id < 9999){
			this.id = id;
		}
		
	}
	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Employee() {

	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	
	
	
	

}
