package com.qa.iteration.coins;

public class Coins {

	double cost;
	double payment;
	
	public Coins(double cost, double payment) {
		this.cost = cost;
		this.payment = payment;
			
	}
	
	public void change() {
		double change = payment - cost;
		int twentyPound = 0;
		int tenPound = 0;
		int fivePound = 0;
		int onePound = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;
		
		
		while(change >= 20) {
			change -= 20;
			twentyPound++;
		}
		System.out.println(twentyPound);
		
		while(change >= 10) {
			change -= 10;
			tenPound++;
		}
		System.out.println(tenPound);
		
		while(change >= 5) {
			change -= 5;
			fivePound++;
		}
		System.out.println(fivePound);
		
		while(change >= 1) {
			change -= 1;
			onePound++;
		}
		System.out.println(onePound);
		
		while(change >= 0.5) {
			change -= 0.5;
			fiftyPence++;
		}
		System.out.println(fiftyPence);
		
		while(change >= 0.2) {
			change -= 0.2;
			twentyPence++;
		}
		System.out.println(twentyPence);
		
		while(change >= 0.1) {
			change -= 0.1;
			tenPence++;
		}
		System.out.println(tenPence);
		
		while(change >= 0.05) {
			change -= 0.05;
			fivePence++;
		}
		System.out.println(fivePence);
		
		while(change >= 0.019) {
			change -= 0.019;
			twoPence++;
		}
		System.out.println(twoPence);
		
		while(change >= 0.009) {
			change -= 0.009;
			onePence++;
		}
		System.out.println(onePence);
		System.out.println();
		System.out.println("your cost is " + cost);
		System.out.println("Your change is");
		
		if (twentyPound != 0) {
			System.out.println(twentyPound + " Twenties");
		}
		if (tenPound != 0) {
			System.out.println(tenPound + " Tens");
		}
		if (fivePound != 0) {
			System.out.println(fivePound + " Fives");
		}
		if (onePound != 0) {
			System.out.println(onePound + " One pounds");
		}
		if (fiftyPence != 0) {
			System.out.println(fiftyPence + " fifty pence peices");
		}
		if (twentyPence != 0) {
			System.out.println(twentyPence + " twenty pence peices");
		}
		if (tenPence != 0) {
			System.out.println(tenPence + " ten pence peices");
		}
		if (fivePence != 0) {
			System.out.println(fivePence + " five pence peices");
		}
		if (twoPence != 0) {
			System.out.println(twoPence + " two pence peices");
		}
		if (onePence != 0) {
			System.out.println(onePence + " one pence peices");
		}
		System.out.println();
		
	}

}
