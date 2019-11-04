package com.ust.oopsdemo;

public class TestVehicle {

	public static void main(String[] args) {
		Engine carEngine = new RegularEngine(1000);
		Car car = new Car(20, carEngine);
		car.start();
		
		
		Engine planeEngine = new SuperEngine(10000, 2345);
		Plane plane = new Plane(1000, 10000, planeEngine);
		plane.start();
		
//		ArrayList<?>

	}

}
