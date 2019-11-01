package com.ust;

public class Employee implements Comparable<Employee>{
	
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
	
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
//		return this.name.compareTo(o.name);
//		if(this.id>o.id){
//			return 1;
//		}
//		else if(this.id<o.id){
//			return -1;
//		}
	}

	
	
	

}
