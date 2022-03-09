package com.qa.constructors;

public class Runner {
	
	public static void main(String[] args) {
		
		// Use of the default constructor will return default values for all variables
		Person p = new Person();
		System.out.println("Name: " + p.name);
		System.out.println("Age: " + p.age);
		System.out.println("Shoesize: " + p.shoeSize);
		
		System.out.println();
		
		// Creation of a new object of class Person
		Person harry = new Person("Harry", 55, 11);
		// Printing the new object
		System.out.println("Name: " + harry.name);
		System.out.println("Age: " + harry.age);
		System.out.println("Shoesize: " + harry.shoeSize);
		
		System.out.println();
		
		// Another object created and printed
		Person jimmy = new Person("Jimmy", 42, 7);
		System.out.println("Name: " + jimmy.name);
		System.out.println("Age: " + jimmy.age);
		System.out.println("Shoesize: " + jimmy.shoeSize);
	}
	
}
