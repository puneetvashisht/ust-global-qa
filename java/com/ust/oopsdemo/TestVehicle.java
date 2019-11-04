package com.ust.oopsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class TestVehicle {

	public static void main(String[] args) {
		Engine carEngine = new RegularEngine(1000);
		Car car = new Car(20, carEngine);
		car.start();
		
		
		Engine planeEngine = new SuperEngine(10000, 2345);
		Plane plane = new Plane(1000, 10000, planeEngine);
		plane.start();
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(plane);
		vehicles.add(car);
		
		int maxSpeed = 0;
		
		for(Vehicle v : vehicles){
			if(maxSpeed < v.speed){
				maxSpeed = v.speed;
			}
			v.start();
		}
		
		System.out.println("Maximum speed is :" + maxSpeed);
		
		Collections.sort(vehicles);
		
		for(Vehicle v : vehicles){
			v.start();
		}

	}

}
