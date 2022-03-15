package com.qa.oop.inheritance;

public class Dog extends Animal{
	
	private String breed;
	private boolean isPanting;
	
	public Dog(int age, int numOfLegs, String colour, String breed, boolean isPanting) {
		
//  --- Either this line --- Shorter using the super
//		super(age, numOfLegs, colour);
		
//  --- Or all three of these lines --- Longer but more flexible
		this.setAge(age);
		this.setNumOfLegs(numOfLegs);
		this.setColour(colour);
//  --- Neither is best practice
		
//  --- Is always required as these are fields of this class ---
		this.breed = breed;
		this.isPanting = isPanting;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isPanting() {
		return isPanting;
	}

	public void setPanting(boolean isPanting) {
		this.isPanting = isPanting;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Wooof!");
	}

	@Override
	public String toString() {
		return "Dog [Breed: " + breed + ", Panting: " + isPanting + ", Age: " + getAge() + ", NumOfLegs: "
				+ getNumOfLegs() + ", Colour: " + getColour() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + "]" ;
	}
	
}
