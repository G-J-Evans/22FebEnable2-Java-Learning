package com.qa.strings;

public class Runner {

	public static void main(String[] args) {
		
		String myString = new String("Message");
		String anotherString = "Message";
		String thirdString = new String(myString);
		String fourthString = "Message";
		
		if (anotherString == myString){
			System.out.println("They equal");
		}
		
		if (thirdString == myString){
			System.out.println("They equal");
		}
		
		if (anotherString == fourthString){
			System.out.println("They equal");
		}
		
		// --- Equals for strings ---
		if (anotherString.equals(fourthString)){
			System.out.println("They equal");
		}
		
		
		
		// --- String Manipulation ---  
		
		// Substring - extracts strings from within other strings.
		// Starting index is inclusive, end index is exclusive.
		thirdString.substring(1,3);
		
		// Turns string to all UPPER case
		thirdString.toUpperCase();
		
		// Turns string to all lower case
		thirdString.toLowerCase();
		
		// Get the character at a specific index
		thirdString.charAt(1);                       // In this case index 1
		System.out.println(thirdString.charAt(1)); 
		
		// Get the position/index of a string in a string  -- by default only the first occurrence
		thirdString.indexOf("es"); // Allows input of (String, index to start searching from)
		
		// Starts with
		thirdString.startsWith("M");
		System.out.println(thirdString.startsWith("M"));
		
		// Replace
		System.out.println(thirdString.replace("M.?.s", "MES"));
		
	}
}
