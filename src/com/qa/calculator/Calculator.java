package com.qa.calculator;

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
		int c = a * b;
		return c;
	}
	
	public float div(int a, int b) {
		float c = (float)a / (float)b;
		return c;
	}
}
