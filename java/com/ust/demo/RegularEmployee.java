package com.ust.demo;

public class RegularEmployee extends Employee{
	double salary;

	public RegularEmployee(int id, String name, double salary, Address address) {
		super(id, name, address);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", getName()=" + getName() + ", getId()=" + getId() + "]";
	}


	
	
}
