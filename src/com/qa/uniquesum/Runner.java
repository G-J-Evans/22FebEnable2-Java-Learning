package com.qa.uniquesum;

public class Runner {

	public static void main(String[] args) {
		Uniquesum input1 = new Uniquesum(1, 2, 3);
		Uniquesum input2 = new Uniquesum(3, 3, 3);
		Uniquesum input3 = new Uniquesum(1, 1, 2);
		
		int result1 = input1.uniquesum();
		int result2 = input2.uniquesum();
		int result3 = input3.uniquesum();
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
