package com.qa.scanner.calculator;

import java.util.Scanner;

public class Calculator {

	Scanner scanner = new Scanner(System.in);
	
	public Calculator() {
	}

	public void add() {
		System.out.println("What number would you like to start with?");
		Integer a = scanner.nextInt();
		System.out.println("And the second?");
		Integer b = scanner.nextInt();

		System.out.println("Answer: " + (a + b));
		System.out.println();
	}

	public void sub() {
		System.out.println("What number would you like to start with?");
		Integer a = scanner.nextInt();
		System.out.println("And the number to minus from the first?");
		Integer b = scanner.nextInt();

		System.out.println("Answer: " + (a - b));
		System.out.println();
	}

	public void mul() {
		System.out.println("What number would you like to start with?");
		Integer a = scanner.nextInt();
		System.out.println("And the number to multiply by?");
		Integer b = scanner.nextInt();

		System.out.println("Answer: " + (a * b));
		System.out.println();
	}

	public void div() {
		System.out.println("What number would you like to start with?");
		Integer a = scanner.nextInt();
		System.out.println("And the number to divide by?");
		Integer b = scanner.nextInt();

		float c = (float) a / (float) b;

		if (a <= b) {
			System.out.println("Answer: " + c);
			System.out.println();

		} else {
			System.out.println("The numerator is larger than the denomiator");
			System.out.println("Answer: " + c);
			System.out.println();
		}
	}
}
