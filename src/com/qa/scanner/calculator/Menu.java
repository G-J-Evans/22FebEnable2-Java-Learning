package com.qa.scanner.calculator;

import java.util.Scanner;

public class Menu {
	
	public Menu() {}
	
	public void calculatorRunMenu() {
		
		Calculator calc = new Calculator();
		Scanner scanner = new Scanner(System.in);

		boolean flag = true;

		System.out.println("--- Calculator ---");
		
		while (flag) {

			
			System.out.println("What opperation would you like to do? (add/subtract/multiply/divide)");
			
			String opperation = scanner.next();			
			
			if(opperation.equalsIgnoreCase("add")) {
				calc.add();
			} else if (opperation.equalsIgnoreCase("subtract")) {
				calc.sub();
			} else if (opperation.equalsIgnoreCase("multipily")) {
				calc.mul();
			} else if (opperation.equalsIgnoreCase("divide")) {
				calc.div();
			} else {
				System.out.println("Your input wasn't a recoginsed opperator");
				System.out.println();
			}
			
			System.out.println("Would you like to do another opperation? (y/n)");
			
			scanner.nextLine();
			
			String choice = scanner.next();

			if (choice.equalsIgnoreCase("y")) {
				System.out.println();
				System.out.println("--- Next Opperation ---");
				System.out.println();
				continue;
			} else if(choice.equalsIgnoreCase("n")) {
				System.out.println("Application stopping...");
				System.out.println();
				flag = false;
				continue;
			} else {
				System.out.println("You entered invalid input");
				System.out.println();
			}

			flag = false;
		}
		scanner.close();
	}

}
