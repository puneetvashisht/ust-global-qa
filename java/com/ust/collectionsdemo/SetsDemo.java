package com.ust.collectionsdemo;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.ust.Employee;

public class SetsDemo {

	public static void main(String[] args) {
		//HashSet : Unordered
		//LinkedHashSet: Ordered by Insertion order
		//TreeSet: Sorted
		Set<Employee> employees = new TreeSet<>(new LastNameComparator());
//		List<Employee> employees = new ArrayList<>();

		Employee emp1 = new Employee(12, "Ravi" , "Kumar" , 33333.33);
		Employee emp2 = new Employee(13, "Priya" , "Negi", 22222.22);
		
		
		
		employees.add(emp1);
		employees.add(emp2);
		Employee emp3 = new Employee(11, "Ravi" , "Devgan" , 44444.33);
		employees.add(emp3);
		
		
//		boolean result = employees.contains(emp3);
//		System.out.println(result);
		
		
		
//		Collections.sort(employees, new LastNameComparator());
		
		
		System.out.println(employees);
		
//		fruits.add("apple");
//		fruits.add("apple");
		
//		System.out.println(fruits);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
