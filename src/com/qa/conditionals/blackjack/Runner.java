package com.qa.conditionals.blackjack;

public class Runner {
	
	public static void main(String[] args) {
		
		Blackjack play1 = new Blackjack(10, 21);
		Blackjack play2 = new Blackjack(20, 18);
		Blackjack play3 = new Blackjack(1, 22);
		Blackjack play4 = new Blackjack(22, 23);
		
		int result1 = play1.blackjack();
		int result2 = play2.blackjack();
		int result3 = play3.blackjack();
		int result4 = play4.blackjack();
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
