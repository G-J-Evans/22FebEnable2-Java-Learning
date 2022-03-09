package com.qa.scope;

public class Runner {

	public static void main(String[] args) {
		Scope myObj = new Scope();
		myObj.methodOne();
		// The below two lines call different methods, 
		// (we can tell because the input parameters are different)
		myObj.methodTwo("hello");
		myObj.methodTwo();
	}
	
}
