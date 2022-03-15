package com.qa.oop.inheritance.garagetask.vehicles;

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
	public int bill(int timeSpentFixing) {
		return (getValue()/10)+(timeSpentFixing*20);
	}

	public int getNumberOfMirrors() {
		return numberOfMirrors;
	}

	public void setNumberOfMirrors(int numberOfMirrors) {
		this.numberOfMirrors = numberOfMirrors;
	}
	
	}
