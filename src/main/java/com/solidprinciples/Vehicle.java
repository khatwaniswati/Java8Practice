package com.solidprinciples;

import java.util.ArrayList;
import java.util.List;

//Liskov Substitution
public class Vehicle {

	public void startEngine() throws Exception {

	}

}

class Car extends Vehicle {

	@Override
	public void startEngine() {

	}

}

class Cycle extends Vehicle {

	@Override
	public void startEngine() throws Exception {
		throw new Exception("Engine Missing");
	}

}

class VehicleMonitor {

	public void startVehicles() {
		List<Vehicle> vehicles = new ArrayList<>();
		Vehicle car = new Car();
		Vehicle cycle = new Cycle();
		vehicles.add(car);
		vehicles.add(cycle);
		vehicles.forEach(vehicle -> {
			try {
				vehicle.startEngine();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}

//Improve inheritance tree
//Vehicle -> VehicleWithEngine, VehicleWithoutEngine