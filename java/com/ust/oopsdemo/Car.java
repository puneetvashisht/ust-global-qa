package com.ust.oopsdemo;

public class Car extends Vehicle {

	
	
	public Car(int speed, Engine engine) {
		super(speed, engine);
	}

	@Override
	public void start() {
		this.engine.start();
		System.out.println(this.engine);
		System.out.println("Starting car...");
		System.out.println(this.speed);
		
	}

}
