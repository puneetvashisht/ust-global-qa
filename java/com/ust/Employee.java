package com.ust;

public class Employee{
	
	public Employee(int id, String name, double s){
		this(id, name);
//		this.id = id;
//		this.name = name;
		salary = s;
	}
	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
//	byte b = (byte)128;
	int id;
	String name;
	double salary = 33333.33;
	
	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public void incrementSalary(int newAmount){
		this.salary = this.salary + newAmount;
	}
//	public String toString() {
//	    return "Employee" + this.id;
//	}

	

}
