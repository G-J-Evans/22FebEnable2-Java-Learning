package com.qa.oop.inheritance.garagetask.vehicles;

public abstract class Vehicle {

	private String id;
	private int value;
	private int maxSpeed;
	private int length;

	public Vehicle() {
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	abstract void noise();

	public abstract int bill(int time);

}
