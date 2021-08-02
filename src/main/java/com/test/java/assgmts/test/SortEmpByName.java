package com.test.java.assgmts.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.test.java.assgmts.model.Emp;

public class SortEmpByName {
	public static void main(String[] args) {
		Emp[] employees = {

				new Emp(101, "kumar", "ch", "IT"), new Emp(102, "kirshna", "k", "finance"),
				new Emp(104, "kumar", "ch", "sales"), new Emp(103, "shiva", "rs", "finance"),
				new Emp(108, "rajesh", "ra", "sales"), new Emp(109, "sarah", "sa", "IT"),
				new Emp(105, "gopi", "g", "finance"), new Emp(106, "kumar", "ch", "sales"),
				new Emp(107, "naveen", "na", "finance"), new Emp(110, "kumar", "ch", "IT") };

		List<Emp> listOfEmp = Arrays.asList(employees);

		//listOfEmp.forEach(System.out::println);

		listOfEmp.stream().sorted(Comparator.comparing(Emp::getFirstname)).forEach(System.out::println);

		/*
		 * Function<Emp, String> byFirstName = Emp::getFirstname;
		 * 
		 * Comparator<Emp> sortFirst = Comparator.comparing(byFirstName);
		 * listOfEmp.stream() .sorted(Comparator.comparing(byFirstName))
		 * .forEach(System.out::println);
		 */
		
		/*
		 * Emp maxId=Collections.max(listOfEmp);
		 * System.out.println("max eid is "+maxId.getEid());
		 */
		    
		    Optional<Emp> maxEmpId = 
		    		listOfEmp.stream()
		            .collect(Collectors.maxBy(Comparator.comparing(Emp::getEid)));
		    System.out.println("max empId ------------");
		    System.out.println(maxEmpId.isPresent()? maxEmpId.get(): "not applicable");
		}
}
