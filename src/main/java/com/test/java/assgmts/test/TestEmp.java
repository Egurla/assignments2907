package com.test.java.assgmts.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.test.java.assgmts.model.Emp;

public class TestEmp {

	public static void main(String[] args) {
		Emp[] employees = {

				new Emp(101, "kumar", "ch", "IT"), new Emp(102, "kirshna", "k", "finance"),
				new Emp(104, "kumar", "ch", "sales"), new Emp(103, "shiva", "rs", "finance"),
				new Emp(108, "rajesh", "ra", "sales"), new Emp(109, "sarah", "sa", "IT"),
				new Emp(105, "gopi", "g", "IT"), new Emp(106, "kumar", "ch", "sales"),
				new Emp(107, "naveen", "na", "IT"), new Emp(110, "kumar", "ch", "IT") };

		List<Emp> listOfEmp = Arrays.asList(employees);
		
		System.out.println(listOfEmp.get(8).getDepartment());
		Iterator<Emp> itr=listOfEmp.iterator();
		while(itr.hasNext()) {
			Emp e=itr.next();
			System.out.println();
		}
	}
}
