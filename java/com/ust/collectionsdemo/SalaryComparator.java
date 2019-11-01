package com.ust.collectionsdemo;

import java.util.Comparator;

import com.ust.Employee;

public class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int)(o1.getSalary() - o2.getSalary());
	}

}
