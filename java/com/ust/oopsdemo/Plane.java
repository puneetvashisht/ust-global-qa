package com.ust.oopsdemo;

public class Plane extends Vehicle {

	int altitude;
	
	public Plane(int speed, int altitude, Engine engine) {
		super(speed, engine);
		this.altitude = altitude;
	}

	@Override
	public void start() {
		this.engine.start();
		System.out.println(this.engine);
		System.out.println("Starting plane...");
		System.out.println(this.speed);
		System.out.println(this.altitude);
		
	}

}
