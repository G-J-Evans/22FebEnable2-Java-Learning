package com.qa.oop.inheritance.garagetask.vehicles;

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
	public int bill(int timeSpentFixing) {
		return (getValue()/4)+(timeSpentFixing*20);
	}

	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

}
