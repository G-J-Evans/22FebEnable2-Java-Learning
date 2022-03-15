package com.qa.scanner.person;

public class Person {
	
	public static int count; 
	
	private String firstName;
	private String lastName;
	private int age;
	private String jobTitle;
	
	public Person(String firstName, String lastName, int age, String jobTitle) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		count++;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Person [firstName: " + firstName + ", lastName: " + lastName + ", age: " + age + ", job title: " + jobTitle + "]";
	}
	
}
