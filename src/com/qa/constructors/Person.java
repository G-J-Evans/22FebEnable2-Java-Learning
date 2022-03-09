package com.qa.constructors;

public class Person {
	
	public String name;
	public int age;
	public int shoeSize;
	
	// This is the default constructor
	public Person() {}	
	
	// This is also a constructor we can tell because there is no return type (void, string etc)
	public Person(String name, int age, int shoeSize) {
		this.name = name;
		this.age = age;
		this.shoeSize = shoeSize;		
	}
	
}
