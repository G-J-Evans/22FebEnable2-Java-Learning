package com.qa.oop.encapsulation;

public class Runner {

	public static void main(String[] args) {
	
		Person anoush = new Person("Anoush", "Lowton", "Jobjob");
		Person denzil = new Person("Denzel", "Eggerue", "title");
		Person jonah = new Person(null, null, null);
		
//		System.out.println(denzil.getFirstName());
		
		PersonManager pm = new PersonManager();
		pm.addPerson(anoush);
		pm.addPerson(denzil);
		pm.addPerson(jonah);
		
		pm.searchPersonName("Anoush", "Lowton");
		System.out.println();
		pm.printPeopleList();
	}
}
