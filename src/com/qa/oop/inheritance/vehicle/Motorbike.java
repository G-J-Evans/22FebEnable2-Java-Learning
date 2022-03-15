package com.qa.oop.inheritance.vehicle;

public class Motorbike extends Vehicle{
	
	private int widthOfBike;
	
	public Motorbike(String id, int value, int length, int maxSpeed, int widthOfBike) {
		this.setId(id);
		this.setValue(value);
		this.setLength(length);
		this.setMaxSpeed(maxSpeed);
		this.widthOfBike = widthOfBike;
	}

	public int getWidthOfBike() {
		return widthOfBike;
	}

	public void setWidthOfBike(int widthOfBike) {
		this.widthOfBike = widthOfBike;
	}

	@Override
	void noise() {
		System.out.println("Wooosh");
		
	}

	@Override
	int bill(int time) {
		return (getValue()/8)+(time*20);
	}

}
