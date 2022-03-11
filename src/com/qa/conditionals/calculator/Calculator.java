package com.qa.conditionals.calculator;

public class Calculator {
	
	public Calculator() {}
	
	public int add(int a, int b) {
		int c = a + b;
		return c;
		
	}
	
	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}
	
	public int mul(int a, int b) {
		return a * b;
		
	}
	
	public float div(int a, int b) {
		if (a <= b) {
			float c = (float)a / (float)b;
			return c;
			
		} else {
			System.out.println("The numerator is larger than the denomiator");
			float c = (float)a / (float)b;
			return c;
		}
	}
}
