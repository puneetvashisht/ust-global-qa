package com.ust.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ust.Employee;

public class SetsDemo {

	public static void main(String[] args) {
		//HashSet : Unordered
		//LinkedHashSet: Ordered by Insertion order
		//TreeSet: Sorted
//		Set<Employee> employees = new LinkedHashSet<>();
		List<Employee> employees = new ArrayList<>();
		
		Employee emp1 = new Employee(12, "Ravi", 33333.33);
		Employee emp2 = new Employee(13, "Priya", 22222.22);
		
		
		
		employees.add(emp1);
		employees.add(emp2);
		Employee emp3 = new Employee(11, "Ravi", 44444.33);
		employees.add(emp3);
		
		
//		boolean result = employees.contains(emp3);
//		System.out.println(result);
		
		
		
		Collections.sort(employees, new SalaryComparator());
		
		
		System.out.println(employees);
		
//		fruits.add("apple");
//		fruits.add("apple");
		
//		System.out.println(fruits);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
