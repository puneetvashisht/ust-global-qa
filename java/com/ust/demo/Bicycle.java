package com.ust.demo;

public abstract class Bicycle implements IBicycle {
	
	int speed;

	public Bicycle(){
		
	}
	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}
	
 
	
	
	public void brakeDown() {
		this.speed--;
		
	}
	

}
