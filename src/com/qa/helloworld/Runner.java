package com.qa.helloworld;

public class Runner {

	public static void main(String[] args) {
		// Object Creator
		HelloWorld myObj = new HelloWorld();
		// Fields		
		String helloWorld = "Hello World";
		String result = myObj.concatText("Hello", "World");
		// 1st Hello World
		System.out.println(myObj.concatText("Hello", "World"));
		// 2nd Hello World
		System.out.println(result);
		// 3rd Hello World
		myObj.helloWorld();
		// 4th Hello World
		myObj.printMessage(helloWorld);
		// 5th Hello World
		System.out.println("Hello World");
	}
}