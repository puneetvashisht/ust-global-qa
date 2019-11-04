package com.ust.oopsdemo;

public abstract class Vehicle {
	
	int speed;
	Engine engine;
	
	
	
	
	public Vehicle(int speed, Engine engine) {
		super();
		this.speed = speed;
		this.engine = engine;
	}




	public abstract void start();
	

}
