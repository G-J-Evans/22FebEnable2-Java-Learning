package com.qa.oop.inheritance.vehicle;

public class Car extends Vehicle{
	
	private int numberOfMirrors;
	
	public Car(String id, int value, int length, int maxSpeed, int numberOfMirrors) {
		this.setId(id);
		this.setValue(value);
		this.setLength(length);
		this.setMaxSpeed(maxSpeed);
		this.numberOfMirrors = numberOfMirrors;
	}

	@Override
	void noise() {
		System.out.println("honk honk");
	}

	@Override
	public int bill(int time) {
		return (getValue()/10)+(time*20);
	}

	public int getNumberOfMirrors() {
		return numberOfMirrors;
	}

	public void setNumberOfMirrors(int numberOfMirrors) {
		this.numberOfMirrors = numberOfMirrors;
	}
	
	}
