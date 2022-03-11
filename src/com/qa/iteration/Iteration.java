package com.qa.iteration;

public class Iteration {

	public static void main(String[] args) {
		
		// --- For loop ---
		// for(initialisation; condition; iterator) {loop code}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		boolean flag = true;
		int count = 0;
				
		// --- While loop ---	
		// Might not run at all
		// while(condition) {loop code}
		while(flag) {
			System.out.println("I'm looping!");
			count++;
			
			if (count >= 10) {
				flag = false;
			}
		}
		
		// --- Do while loop ---
		// Checks condition after 1st loop, (will always run at least once)
		do {
			System.out.println("I'm looping!");
			count++;
			
			if (count >= 10) {
				flag = false;
			}
		} while(flag);
		
		
		
	}
	
}
