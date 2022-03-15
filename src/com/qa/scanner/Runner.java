package com.qa.scanner;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		
		// --- Scanners ---
		// Scanner reads from System.in
		// Scanner creation
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter a number: ");
		
		// Ask for next integer entered to console
		Integer numberOne = scanner.nextInt();

		System.out.println("Enter another number: ");
		
		Integer numberTwo = scanner.nextInt();
		
		// --- ALWAYS CLOSE scanners ---
		scanner.close();
		
		
		System.out.println();
		System.out.print("Your numbers added together are: ");
		System.out.println(numberOne + numberTwo);
		
		
		boolean flag = true;
		
		while(flag) {
			Scanner scanner2 = new Scanner(System.in);
			
			
			System.out.println("Enter a number: ");
			
			// Ask for next integer entered to console
			Integer numberThree = scanner2.nextInt();

			System.out.println("Enter another number: ");
			
			Integer numberFour = scanner2.nextInt();
			
			System.out.println();
			System.out.print("Your numbers added together are: ");
			System.out.println(numberFour + numberThree);
			
			System.out.println();
			System.out.println("Would you like to continue? (y/n)");
			
			scanner2.nextLine(); // Consumes spare new line characters (enters)(\n)
			
			String choice = scanner2.nextLine();
			
			if (choice.equalsIgnoreCase("y")) {
				continue;
			} else if(choice.equalsIgnoreCase("n")) {
				System.out.println("Application stopping...");
				flag = false;
				continue;
			} else {
				System.out.println("You entered invalid input");
			}
			scanner2.close();
		}
		
		
		
		
	}
}
