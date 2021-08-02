package com.test.java.assgmts.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.test.java.assgmts.model.Employee;

public class CountOfEmpEachDep {

	public static void main(String[] args) {
		List<Employee> listofEmployee = new ArrayList();
		listofEmployee.add(new Employee("kiranb","kiran", "b", 300000.0, "IT"));
		listofEmployee.add(new Employee("kiranb","rajesh", "r", 400000.0, "Seles"));
		listofEmployee.add(new Employee("kiranb","krishna", "s", 200000.0, "Finace"));
		listofEmployee.add(new Employee("kiranb","ramu", "k", 600000.0, "Seles"));
		listofEmployee.add(new Employee("kiranb","kiran", "rt", 300000.0, "IT"));

		
		  Map<String, List<Employee>> byDept = listofEmployee.stream()
		  .collect(Collectors.groupingBy(Employee::getDeparment));
		  
		  byDept.entrySet().forEach(System.out::println);
		  
		System.out.println("=============================================");
		  byDept.forEach((x, y) -> System.out.println("Deparment:" +x +"   " + ((List <
		 Employee > ) y).stream().map(m -> m.getFirstname()+" "+m.getLastname())
		 .collect(Collectors.joining(","))));
		  
		  
		  
		 
		 

		
	}
}
