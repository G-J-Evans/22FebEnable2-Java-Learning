package com.qa.conditionals.results;

public class Runner {
	
	public static void main(String[] args) {
		
		Results harry = new Results("Harry" ,70 , 80, 110);
		
		harry.results();
		System.out.println();
		harry.percentageMark();
		
	}
}