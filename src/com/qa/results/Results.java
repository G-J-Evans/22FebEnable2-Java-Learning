package com.qa.results;

public class Results {
	
	public static int passPercentage = 60;
	public String studentName;
	public int chemMark;
	public int phyMark;
	public int bioMark;
	public int totalMark;
	public float percentageMark;
	
	
	public Results(String studentName, int chemMark, int phyMark, int bioMark) {
		this.studentName = studentName;
		this.chemMark = chemMark;
		this.phyMark = phyMark;
		this.bioMark = bioMark;
		this.totalMark = chemMark + phyMark + bioMark;
	}
	
	public void results() {
		System.out.println("Student " + studentName + " obtained the following;");
		System.out.println("Mark in Chemestry: " + chemMark + "/150");
		System.out.println("Mark in Physics:   " + phyMark + "/150");
		System.out.println("Mark in Biology:   " + bioMark + "/150");
		System.out.println("Total Mark:        " + totalMark + "/450");
		
	}
	
	public void percentageMark() {
		this.percentageMark = (float)this.totalMark / (float)4.5;
		System.out.println("Student " + studentName + " obtained the following;");
		System.out.println(String.format("%.2f", percentageMark) + "% overall");
		
		if (percentageMark < passPercentage){
			System.out.println("You have failed based on overall percentage");			
		}

		if ((float)chemMark / 150 < (float)passPercentage / 100) {
			System.out.println("You have failed Chemestry");
		}
		
		if ((float)phyMark / 150 < (float)passPercentage / 100) {
			System.out.println("You have failed Physics");
		}
		
		if ((float)bioMark / 150 < (float)passPercentage / 100) {
			System.out.println("You have failed Biology");
		}
	}
}
