package com.qa.oop.inheritance.vehicle;

public class Plane extends Vehicle{
	
	private int numberOfEngines;
	
	public Plane(String id, int value, int length, int maxSpeed, int numberOfEngines) {
		this.setId(id);
		this.setValue(value);
		this.setLength(length);
		this.setMaxSpeed(maxSpeed);
		this.numberOfEngines = numberOfEngines;
	}

	@Override
	void noise() {
		System.out.println("I'm a ghost");	
	}

	@Override
	int bill(int time) {
		return (getValue()/4)+(time*20);
	}

	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

}
