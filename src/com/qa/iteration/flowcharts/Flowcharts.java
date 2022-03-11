package com.qa.iteration.flowcharts;

public class Flowcharts {

	public Flowcharts() {
		
	}
	
	public void flowchart(){
		
		for (int A = 100; A <= 200; A++) {
			System.out.println(A + " is the value of variable A");
		}
		
	}
	
	public void flowchart2() {
		String evenOrNot;

		
		for (int A = 100; A <= 200;) {
			if (A % 2 == 0) {
				evenOrNot = "*";
			} else {
				evenOrNot = "-";;
			}
			System.out.println(A + " is " + evenOrNot);
			A++;
		}
	}
	
	public void flowchart3() {
		for (int a = 1; a <= 10; a++) {
			for(int b = 1; b <= 10; b++) {
				System.out.println("This is the " + b + "th time for " + a);
			}
		}
		
	}
	
	public void flowchart5() {
		for (int a = 1; a <= 10; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.println("This is the " + b + "th time for " + a);				
			}
		}
			
		
	}
}
