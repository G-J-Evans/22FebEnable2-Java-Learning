package com.qa.arraylist.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Exercises {

	public Exercises() {
		
	}
	
	public void exer() {
		
		List<String> newArrayList = new ArrayList<>();
		
		newArrayList.add("b");
		newArrayList.add("e");
		newArrayList.add("z");
		newArrayList.add("g");
		newArrayList.add("f'");
		newArrayList.add("B");
		newArrayList.add("E");
		newArrayList.add("Z");
		newArrayList.add("G");
		newArrayList.add("F'");
		
		System.out.println("Raw data");
		System.out.println(newArrayList);
		
		System.out.println();
		
//		for (int i = 0; i < newArrayList.size(); i++) {
//			System.out.println(newArrayList.get(i));
//		}
//		
//		System.out.println();
//		
//		for (String i : newArrayList) {
//			System.out.println(i);
//		}
//		
//		System.out.println();
//		
//		newArrayList.get(2);
//		
//		System.out.println(newArrayList);
//		System.out.println();
//		
//		newArrayList.set(4, "I'm not the best element any more");
//		
//		System.out.println(newArrayList);
//		System.out.println();
//		
//		newArrayList.remove(3);
//		
//		System.out.println(newArrayList);
//		System.out.println();
//		
		Collections.sort(newArrayList);
		
		System.out.println("Sorted");
		System.out.println(newArrayList);
		System.out.println();
		
		Collections.reverse(newArrayList);
		
		System.out.println("Reversed");
		System.out.println(newArrayList);
		System.out.println();
		
		Collections.swap(newArrayList, 1, 3);
		
		System.out.println("Swapped elements 1 and 3");
		System.out.println(newArrayList);
		System.out.println();
		
	}
	
}
