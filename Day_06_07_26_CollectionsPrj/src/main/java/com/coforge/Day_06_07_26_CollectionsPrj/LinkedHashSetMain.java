package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class LinkedHashSetMain {

	public static void main(String[] args) {
		
		LinkedHashSet<Employee> employeeSet = new LinkedHashSet<Employee>();

		employeeSet.add(new Employee("Amit", 101, "Hyderabad", "IT", 65000));
		employeeSet.add(new Employee("Priya", 102, "Bangalore", "HR", 55000));
		employeeSet.add(new Employee("Rahul", 103, "Chennai", "Finance", 70000));
		employeeSet.add(new Employee("Amit", 104, "Pune", "IT", 65000));
		employeeSet.add(new Employee("Sneha", 105, "Delhi", "Sales", 60000));

		employeeSet.add(new Employee("Priya", 106, "Mumbai", "Marketing", 55000));
		employeeSet.add(new Employee("Karan", 107, "Hyderabad", "Finance", 85000));
		employeeSet.add(new Employee("Meera", 108, "Bangalore", "IT", 92000));
		employeeSet.add(new Employee("Rahul", 109, "Pune", "HR", 70000));
		employeeSet.add(new Employee("Sneha", 110, "Chennai", "Sales", 60000));

		employeeSet.add(new Employee("Rohit", 111, "Delhi", "IT", 98000));
		employeeSet.add(new Employee("Divya", 112, "Hyderabad", "Marketing", 61000));
		employeeSet.add(new Employee("Karan", 113, "Mumbai", "Finance", 85000));
		employeeSet.add(new Employee("Meera", 114, "Bangalore", "HR", 92000));
		employeeSet.add(new Employee("Rohit", 115, "Pune", "IT", 98000));

		employeeSet.add(new Employee("Divya", 116, "Chennai", "Marketing", 61000));
		employeeSet.add(new Employee("Amit", 117, "Hyderabad", "Sales", 65000));
		employeeSet.add(new Employee("Priya", 118, "Delhi", "Finance", 55000));
		employeeSet.add(new Employee("Rahul", 119, "Mumbai", "IT", 70000));
		employeeSet.add(new Employee("Sneha", 120, "Bangalore", "Sales", 60000));
		
		for(Employee emp:employeeSet)
			System.out.println(emp);
		
		//we can't directly apply sort method,either set need to be converted to 
		//list or to a treeset
		
		List<Employee> empList=new ArrayList(employeeSet);
		
		Collections.sort(empList);
		System.out.println("---------------------");
		for(Employee e:empList)
			System.out.println(e);
		
		//complete all operations of hashset and linkedhashset
		
		
	}
}
