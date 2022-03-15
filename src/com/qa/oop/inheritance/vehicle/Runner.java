package com.qa.oop.inheritance.vehicle;

public class Runner {
	
	public static void main(String[] args) {
		
		Plane plane = new Plane("T764", 200000, 42, 600, 4);
		Motorbike motorbike = new Motorbike("75B 2HY", 30000, 2, 130, 80);
		Car car = new Car("784S D34", 40000, 4, 100, 3);
		Car car2 = new Car("78S D34", 5000, 4, 60, 3);
	
		Garage garage = new Garage();
		
		garage.addVehicle(plane);
		garage.addVehicle(motorbike);
		garage.addVehicle(car);
		garage.addVehicle(car2);
		
		garage.garageBillAll();
//		
//		garage.removeVehicle("T764");
//		garage.garageBillAll();
//		
		garage.removeVehicleType("Car");
		
		garage.garageBillAll();
	}
}
