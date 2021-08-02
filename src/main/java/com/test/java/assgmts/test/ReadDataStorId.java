package com.test.java.assgmts.test;

import java.util.Scanner;

public class ReadDataStorId {

	public static void main(String[] args) {
		getStoreId();
		
	}

	private static void getStoreId() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter store id");
		
		String storeId=scanner.nextLine();
		if(storeId.length()<4) {
			storeId=StringUtils.leftPad(" "+storeId,4,"0");
			
		}
		
		System.out.println(storeId);

	}
}
