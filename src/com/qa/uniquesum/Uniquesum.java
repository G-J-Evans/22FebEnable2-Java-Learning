package com.qa.uniquesum;

public class Uniquesum {

	public int a;
	public int b;
	public int c;
	
	public Uniquesum(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int uniquesum() {
		int d = 0;
		if (a != b && a != c) {
			d += a;
		}
		if (b != a && b != c) {
			d += b;
		}
		if (c != a && c != b) {
			d += c;
		}
		return d;
	}
	
	public int uniquesum2() {
		int d;
		if (a != b) {   // if a =/= b 
			d = a + b;	// then add them together
		} else {        
			d = a;		// or don't add them
		}
		if (a != c) {	// if a =/= c 
			d += c;		// then add c to number
		}
		if (b == c) {	// if b = c
			d -= c;		// we've double counted it so remove.
		}
		return d;
	}	
	
}
