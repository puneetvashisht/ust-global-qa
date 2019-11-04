package com.ust.oopsdemo;

public abstract class Vehicle implements Comparable<Vehicle>{
	
	int speed;
	Engine engine;
	
	
	
	
	public Vehicle(int speed, Engine engine) {
		super();
		this.speed = speed;
		this.engine = engine;
	}




	public abstract void start();
	
	@Override
	public int compareTo(Vehicle vehicle){
		return this.speed - vehicle.speed;
	}
	

}
