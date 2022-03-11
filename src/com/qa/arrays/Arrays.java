package com.qa.arrays;

public class Arrays {

	
	public void method() {
		// --- Single Dimensional Array ---
		int[] numArray;                               // Blank array
		int[] anotherNumArray = {10, 23, 45, 76, 87}; // Array has data in it and length 5
		int[] finalArray = new int[5];				  // Creates empty array with a fixed length 5
	
		
		// --- Multidimensional Array ---
		int[][] multiArray;                                       // Blank multidimensional array
		int[][] anotherMultiArray = {{23, 34, 45},{4, 6, 8},{3}}; // This is an array of length 3, with 3 arrays in 
		int[][] finalMultiArray = new int[3][2];                  // This array can store 3 arrays each with 2 values
		
//		finalArray[0] = 10;	
//		finalArray[1] = 20;
//		finalArray[2] = 30;
//		finalArray[3] = 40;
//		finalArray[4] = 50;
		
		for(int i = 0; i < finalArray.length; i++) {
			finalArray[i] = (10 * i);
		}
		
		for(int i = 0; i < finalArray.length; i++) {
			System.out.println(finalArray[i]);
		}
		System.out.println();
		// --- For each loop ---
		// Same as the loop above
		for(int x : finalArray) {
			System.out.println(x);
		}
		System.out.println();
		
		for (int i = 0; i < anotherMultiArray.length; i++) {
			for (int j = 0; j < anotherMultiArray[i].length; j++) {
				System.out.println(anotherMultiArray[i][j]);
			}
			System.out.println();
		}


		
	}
}
