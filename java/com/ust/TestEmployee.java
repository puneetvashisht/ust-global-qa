package com.ust;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee(12, "Ravi", 33333.33);
		System.out.println(emp);
		
		Employee emp2 = new Employee(13, "Priya");
		System.out.println(emp2);
		
		emp2.incrementSalary(11111);
		System.out.println(emp2);

	}

}
