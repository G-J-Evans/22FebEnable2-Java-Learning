package com.qa.scope;

public class Scope {
	
	// This is class level scope (instance scope)
	public String message = "Class Level Hello";
	// Class level scope is overridden by more local scopes
	
	
	public void methodOne() {
		
		// This is local scope (method scope)
		String anotherMessage = "Method/local scope Hello";
		// Will print local scope message inside method
		System.out.println(anotherMessage);
		
		// Will print class level scope outside of method
		System.out.println(message);
		// This is local scope (method scope)
		String message = "Method/local scope Hello";
		// Prints local scope as it has now overridden class scope variable
		System.out.println(message);
	}

	public void methodTwo(String message) {
		// Prints input for method (this is considered method/local scope)
		System.out.println(message);
	}
	
	// Method overloading - This methodTwo is the same name as above, 
	// however it's allowed because the parameters (inside the brackets) are different
	public void methodTwo() {
		System.out.println(message);
	}
	
}
