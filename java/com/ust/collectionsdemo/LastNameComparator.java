package com.ust.collectionsdemo;

import java.util.Comparator;

import com.ust.Employee;

public class LastNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}

}
