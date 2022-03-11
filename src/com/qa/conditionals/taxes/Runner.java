package com.qa.conditionals.taxes;

public class Runner {

	public static void main(String[] args) {
		
		Taxes harry = new Taxes("Harry", 34000);
		
		System.out.println(harry.percentSalaryTax());
		
		
	}

}
