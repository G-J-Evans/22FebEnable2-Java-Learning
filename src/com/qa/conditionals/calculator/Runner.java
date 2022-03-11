package com.qa.conditionals.calculator;

public class Runner{
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		int a = 3;
		int b = 2;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int result = calc.add(a, b);
		System.out.println("a + b = " + result);
		
		int result2 = calc.sub(a, b);
		System.out.println("a - b = " + result2);
		
		int result3 = calc.mul(a, b);
		System.out.println("a x b = " + result3);
		
		float result4 = calc.div(a, b);
		System.out.println("a / b = " + result4);
		
	}
	
}