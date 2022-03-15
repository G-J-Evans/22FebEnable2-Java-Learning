package com.qa.scanner.person;

public class Runner {

	public static void main(String[] args) {
	
		Person anoush = new Person("Anoush", "Lowton", 60, "Jobjob");
		Person denzil = new Person("Denzel", "Eggerue", 45, "title");
		Person jonah = new Person(null, null, 0, null);
		
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
