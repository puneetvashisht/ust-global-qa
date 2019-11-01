package com.ust.collectionsdemo;

import java.util.HashMap;
import java.util.Map;

import com.ust.Employee;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer, Employee> employeeMap = new HashMap<>();
		Employee emp1 = new Employee(12, "Ravi" , "Kumar" , 33333.33);
		Employee emp2 = new Employee(13, "Priya" , "Negi", 22222.22);
		Employee emp3 = new Employee(11, "Ravi" , "Devgan" , 44444.33);
		
		employeeMap.put(12, emp1);
		employeeMap.put(11, emp3);
		employeeMap.put(13, emp2);
		
		System.out.println(employeeMap.keySet());
		
		
		
		
		
	}

}
