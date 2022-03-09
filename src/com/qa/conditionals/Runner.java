package com.qa.conditionals;

public class Runner {

	public static void main(String[] args) {
		
		int num = 2;
		int num2 = 5;
				
		if (num < 20) {
			System.out.println("Smaller than 20");
		} else {
			System.out.println("Not smaller than 20");
		}
		
		// && = AND , || = OR , ! = NOT
		if (num2 == 5 && num2 <= 10) {
			System.out.println("Number is both 5 and less than 10");
		} else {
			System.out.println("Number is either not 10 or not less than 10");
		}
		
		if (!(num2 == 5 && num2 <= 10)) {
			System.out.println("Number is either not 10 or not less than 10");
		} else {
			System.out.println("Number is both 5 and less than 10");
		}
		
		// Switch case
		
		switch(num) {
			case 1:
				System.out.println("Number is 1");
				break;
			case 2:
				System.out.println("Number is 2");
				break;
			case 3:
				System.out.println("Number is 3");
				break;
			default:
				System.out.println("Default case");
				break;
		}
			
	}
	
}
