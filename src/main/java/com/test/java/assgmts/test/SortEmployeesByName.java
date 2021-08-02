package com.test.java.assgmts.test;

import java.util.ArrayList;
import java.util.List;

import com.test.java.assgmts.model.Employee;

public class SortEmployeesByName {

	
	public static void main(String[] args) {

		Employee e1 = new Employee("101", "chinna", "c", 100000.0, "IT");
		Employee e3 = new Employee("102", "akil", "j", 300000.0, "Finance");
		Employee e2 = new Employee("103", "rojs", "n", 800000.0, "hr");
		Employee e4 = new Employee("108", "kiran", "k", 900000.0, "Finance");
		Employee e5 = new Employee("106", "kirisna", "l", 300000.0, "Finance");
		Employee e6 = new Employee("103", "kiran", "a", 200000.0, "IT");
		Employee e7 = new Employee("103", "rakesh", "k", 300000.0, "hr");
		Employee e8 = new Employee("103", "ramesh", "p", 100000.0, "Finance");
		Employee e9 = new Employee("109", "vamshi", "q", 900000.0, "markeng");
		Employee e10 = new Employee("111", "raja", "e", 2300000.0, "IT");
		List<Employee> listofEmployee = new ArrayList();
		listofEmployee.add(e1);
		listofEmployee.add(e2);
		listofEmployee.add(e3);
		listofEmployee.add(e4);

		listofEmployee.add(e5);
		listofEmployee.add(e6);
		listofEmployee.add(e7);
		listofEmployee.add(e8);
		listofEmployee.add(e9);
		listofEmployee.add(e10);
		
		listofEmployee.sort((Employee emp1, Employee emp2)->emp1.getFirstname().compareTo(emp2.getFirstname()));
		System.out.println(listofEmployee);
	}
}
