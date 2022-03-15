package com.qa.oop.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	
	private List<Person> listOfPeople = new ArrayList<>();
	
	public PersonManager() {
	}

	public void addPerson(Person person) {
		listOfPeople.add(person);
		}
	
	public void searchPersonName(String firstName, String lastName) {
			
		for (int i = 0; i < listOfPeople.size(); i++) {
			if(listOfPeople.get(i).getFirstName().equals(firstName) &&
					listOfPeople.get(i).getLastName().equals(lastName)) {
				System.out.println(listOfPeople.get(i));
				return;
			}
		} 
		System.out.println("Your name did not match!");
		
	}
	
	public void printPeopleList() {
		for (int i = 0; i < listOfPeople.size(); i++) {
			System.out.println(listOfPeople.get(i));
		}
	}
}
