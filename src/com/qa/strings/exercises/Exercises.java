package com.qa.strings.exercises;

public class Exercises {
	
	private String string;
	private String string2;
	
	public Exercises(String input, String input2) {
		this.string = input;		
		this.string2 = input2;
	}
	
	public void exerciseOne() {
		
		String first = "yesterday it was raining";
		String second = "today it is sunny";
		
		String total = first + ", " + second;
		
		total = total.toUpperCase();
		
		System.out.println(total);
		
		System.out.println(total.substring(25));
		
		System.out.println();
		
	}
	
//	public boolean onlySpacesCheck() {
//		int a = 1;
//		for (int i = 0; i < string.length(); i++) {
//			if(string.substring(i,i+1) == " ") {
//				a++;
//			}
//		}
//		if (a == string.length()) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
	public int exerciseTwoOne() {
		System.out.println("Start of ExerciseTwoOne");
		System.out.println();
		System.out.println("Input: " + string);
		System.out.println("String length is " + string.length());
		System.out.println();
		
		
		int wordCount = 1;
		int spacesCount = 0;
		
		// Count the spaces
		for (int i = 0; i < string.length(); i++) {
			if (string.substring(i,i+1).equals(" ")) {
				spacesCount++;
			}
		}
		
		// Return 0 if spaces = string length
		if (spacesCount == string.length()) {
			System.out.println("Number of words: 0");
			System.out.println("Your input is only spaces");
			System.out.println();
			return 0;
		}
		
		// Work out words not including duplicate spaces
		for (int i = 0; i < string.length(); i++) {
			if (i == 0 && string.substring(i,i+1).equals(" ")) {
				continue;
		} else if (string.substring(i,i+1).equals(" ") && string.substring(i-1,i).equals(" ")) {
				continue;
		} else if (string.substring(i,i+1).equals(" ")) {
				wordCount++;
			} 
		}
		System.out.println("Number of words: " + wordCount);
	    System.out.println();
		return wordCount;
		
			
	}
	
	public void exerciseTwoTwo() {
		System.out.println("Start of ExerciseTwoTwo");
		System.out.println();
		System.out.println("Input: " + string);
		System.out.println("String length is " + string.length());
		System.out.println();
			
		for (int i = 0; i < string.length(); i++) {
			if (i == 0 && string.substring(i,i+1).equals(" ")) {
				continue;
			} else if (string.substring(i,i+1).equals(" ") && string.substring(i-1,i).equals(" ")) {
				continue;
			} else {
				if (string.substring(i,i+1).equals(" ")) {
					System.out.println();
				} else {
					System.out.print(string.substring(i,i+1));
				} 
			}
		}
		System.out.println();
		System.out.println();
	}
	
	public void exerciseTwoThree() {
		System.out.println("Start of ExerciseTwoThree");
		System.out.println();
		System.out.println("Input: " + string);
		System.out.println("String length is " + string.length());
		System.out.println();
		
		for (int i = string.length(); i > 0; i--) {
			int j = i;
			
//			System.out.println("The value of i is; " + i);
			if (i == string.length() && string.substring(i-1,i).equals(" ")) {
//				System.out.println("End character was a space");
				continue;
			} else if (string.substring(i-1,i).equals(" ") && string.substring(i,i+1).equals(" ")) {
//				System.out.println("Duplicate spaces were here");
				continue;
			} else {
				String wordToPrint = "";
//				System.out.println("We got to here");
				
				for (j = i; ;j--) {
					if (j == 0) {
						System.out.println(wordToPrint);
						break;
					}
					if (string.substring(j-1,j).equals(" ")) {
						System.out.println(wordToPrint);
						break;
					} else {
						wordToPrint = string.substring(j-1,j) + wordToPrint;
					}
//					System.out.println("The value of j is: " + j);
				}
				i = j;
			}
//			System.out.println("The value of i is: " + i);
		}
		System.out.println();
	}
	
	public boolean exerciseTwoFour() {
		System.out.println("Start of ExerciseTwoFour");
		System.out.println();
		System.out.println("Find: " + string2);
		System.out.println("Inside of: " + string);
		System.out.println("String length is " + string.length());
		System.out.println();
		
		
		
		
		
		return true;
	}
	
}
