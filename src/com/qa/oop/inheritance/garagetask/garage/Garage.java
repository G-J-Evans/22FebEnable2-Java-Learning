package com.qa.oop.inheritance.garagetask.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.oop.inheritance.garagetask.vehicles.Vehicle;

public class Garage {

	private List<Vehicle> garageInventory = new ArrayList<>();

	public Garage() {
	}

	public void addVehicle(Vehicle vehicle) {
		garageInventory.add(vehicle);
	}

//	public void removeVehicle(String id) {
//		for (int i = 0; i < garageInventory.size(); i++) {
//			if(garageInventory.get(i).getId().equals(id)) {
//				garageInventory.remove(i);
//				return;
//			}
//		} 
//		
//	}

	public void removeVehicle(String id) {
		for (Vehicle vehicle : garageInventory) {
			if (vehicle.getId().equals(id)) {
				garageInventory.remove(vehicle);
				return;
			}
		}
	}

	public void garageBillAll() {
		System.out.println("--- Bill for garage ---");
		System.out.println();
		for (int i = 0; i < garageInventory.size(); i++) {
			System.out.println("ID: " + garageInventory.get(i).getId());
			System.out.println("Bill: £" + garageInventory.get(i).bill(0) + " and labour");
			System.out.println();

		}
	}

	public int fixBill(Vehicle vehicle, int timeSpentFixing) {
		return vehicle.bill(timeSpentFixing);
	}
	
	public void emptyGarage() {
		garageInventory.clear();
	}

	public void removeVehicleType(String typeOfVehicle) {
		
		List<Vehicle> leavingVehicles = new ArrayList<>();
		
		for (Vehicle vehicle : garageInventory) {
			if (vehicle.getClass().getSimpleName().equalsIgnoreCase(typeOfVehicle)) {
				leavingVehicles.add(vehicle);
			}
		}
		garageInventory.removeAll(leavingVehicles);
	}
	
}
