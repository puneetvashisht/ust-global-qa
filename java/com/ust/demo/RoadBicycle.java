package com.ust.demo;

public class RoadBicycle extends Bicycle implements IBicycle {

	
	
	
	public RoadBicycle(int speed) {
		super(speed);
	}

	@Override
	public void speedUp() {
		this.speed+=1;
		
	}

	@Override
	public String toString() {
		return "RoadBicycle [speed=" + speed + "]";
	}
	
	@Override
	public void startBicycle() {
		System.out.println("start road bicycle");
		
	}

	
}
