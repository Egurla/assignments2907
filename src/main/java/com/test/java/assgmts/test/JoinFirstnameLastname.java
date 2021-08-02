package com.test.java.assgmts.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.test.java.assgmts.model.Emp;
import com.test.java.assgmts.model.Employee;

public class JoinFirstnameLastname {

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

		// where fullName = firstname + lastname.
		String fullname = listofEmployee.stream().map(dto -> dto.getFirstname() + " " + dto.getLastname()).findFirst()
				.get();
		System.out.println(fullname);

		// all the employees with pipe (|)
		String listofemployeeNames = listofEmployee.stream().map(dto -> dto.getFirstname() + " " + dto.getLastname())
				.collect(Collectors.joining("|"));
		
		System.out.println( "------------------");

		Map<String, List<Employee>> byDept = listofEmployee.stream()
				.collect(Collectors.groupingBy(Employee::getDeparment));
		// Collectors.toMap(Employee::getDeparment, ));
		// byDept.forEach(System.out::println);

		// byDept.forEach((k, v) -> System.out.println("Dept:" + k + " "
		// + ((List<Employee>) v).stream().map(m ->
		// m.getFirstname()).collect(Collectors.joining(","))));

		byDept.forEach((k, v) -> System.out
				.println("Dept :" + k + "   " + v.stream().map(m -> m.getFirstname()).collect(Collectors.toList())));
		
		
		System.out.println("CASE_INSENSITIVE_ORDER -----------------------------");

		Predicate<Employee> firstname = fname -> fname.getFirstname().equals("Kumar".CASE_INSENSITIVE_ORDER);
		Predicate<Employee> lastname = lname -> lname.getLastname().equals("S".CASE_INSENSITIVE_ORDER);
		Predicate<Employee> predicate = firstname.or(lastname);
		//boolean anymatchwithFL = listofEmployee.stream().anyMatch(predicate);

		byDept.forEach((k, v) -> System.out.println("Dept matching :" + k + "  "
				+ ((List<Employee>) v).stream().filter(predicate).collect(Collectors.toList())));

		/*
		 * byDept.forEach( (k, v) -> System.out.println("Dept:" + k + "  " +
		 * ((List<Employee>) v).stream().allMatch(predicate)));
		 */
		
		System.out.println("find max id by using Optional----------");

		Optional<Employee> emp = listofEmployee.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getEid)));
		System.out.println(emp.get());

		
		System.out.println("employees which doesn't belong to that department-----------------------------------");
		System.out.println("Pleasre enter dept name ");

		String dept = new Scanner(System.in).nextLine();
		List<Employee> newEmpList = Stream.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10)
				.filter(e -> !e.getDeparment().equalsIgnoreCase(dept)).collect(Collectors.toList());
		System.out.println(newEmpList);
		
		System.out.println("sorting employee by fname-----------------------------------------------------");
		
		
		
		
		listofEmployee.sort((Employee emp1, Employee emp2)->emp1.getFirstname().compareTo(emp2.getFirstname()));
		System.out.println(listofemployeeNames);
		
		
		System.out.println("---------------------------");
		
		List<Integer> idslist=Stream.of(101,102,108,105).collect(Collectors.toList());
		List<Employee> neewEmp=listofEmployee.stream().filter(e->idslist.contains(e.getEid())).collect(Collectors.toList());
		neewEmp.forEach(System.out::println);
				
	}
}
