package com.qa.helloworld;

public class HelloWorld {
	//accessmodifier static/not ReturnType methodName
	public void helloWorld() {
		// Datatype variableName = value;
		String helloWorld = "Hello World";
		System.out.println(helloWorld);
	}
	
	public void printMessage(String message) {
	 System.out.println(message);
	}	
	
	public String concatText(String x,String y) {
		return x + " " + y;
	}
}