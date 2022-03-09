package com.qa.blackjack;

public class Blackjack {
	
	public int a;
	public int b;
	
	public Blackjack(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public int blackjack() {
		if (a > 21 && b > 21) {
			return 0;
		} else if ((a >= b && a <= 21) || b > 21) {
			return a;
		} else {
			return b;
		}
	}

}
