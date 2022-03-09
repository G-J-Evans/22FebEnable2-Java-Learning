package com.qa.results;

public class Runner {
	
	public static void main(String[] args) {
		
		Results harry = new Results("Harry", 100, 110, 130);
		
		harry.results();
		System.out.println();
		harry.percentageMark();
		
	}

}
