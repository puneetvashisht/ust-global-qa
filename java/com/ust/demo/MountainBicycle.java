package com.ust.demo;

public class MountainBicycle extends Bicycle implements  IBicycle{

	public MountainBicycle(int speed) {
		super(speed);
	}

	@Override
	public void speedUp() {
		this.speed+=2;

	}


	@Override
	public String toString() {
		return "MountainBicycle [speed=" + speed + "]";
	}

	
	@Override
	public void startBicycle() {
		System.out.println("start motor bicycle");
		
	}
	
	
	

}
