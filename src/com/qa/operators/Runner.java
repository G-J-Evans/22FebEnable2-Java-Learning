package com.qa.operators;

public class Runner {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		System.out.println("int a =" + a);
		System.out.println("int b =" + b);
		System.out.println("Addition: a + b = " + (a + b));
		System.out.println("Minus: a - b = " + (a - b));
		System.out.println("Multiplication: a * b = " + (a * b));
		// Will only return the whole number of times b goes into at, (floored rounding to 
		System.out.println("Division without float: a / b = " + (a / b));
		// Need to cast the integers as floats to get a decimal answer
		System.out.println("Devision with float: a / b = " + ((float)a / (float)b));
		
		// Modulus
		System.out.println("Modulus: a % b = " + (a % b));
		System.out.println("Modulus: b % a = " + (b % a));
		
		
		// Unary
		System.out.println(++a); //Increment first, then print
		System.out.println(a++); //Print first, then increment
		
		// Not operator - !
		boolean flag = false;
		System.out.println(!flag);
		
		
	}
	
}
