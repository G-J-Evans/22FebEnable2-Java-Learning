package com.qa.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		// --- Array Lists ---
		// Need to import packages first (lines 3 and 4)
		// Syntax below
		List<String> listOfStrings = new ArrayList<>();
		
		listOfStrings.add("Hello");
		listOfStrings.add("There");
		
		
		// How we get values of the array list
		listOfStrings.get(1);
		System.out.println(listOfStrings.get(1));
		
		// Change a value at a specified index in the array list
		listOfStrings.set(0,  "hi");
		System.out.println(listOfStrings.get(0));
		
		
		System.out.println(listOfStrings);
		// Remove element and change list length
		listOfStrings.remove(1);
		System.out.println(listOfStrings);
		
		// Get the length of the array list
		listOfStrings.size();
		System.out.println("The lenght is: " + listOfStrings.size());
		
		// Clears the array list (remove all values)
		listOfStrings.clear();
		System.out.println(listOfStrings);
	}
	
	
}
