package com.ust.demo;

public class MotorCycle extends Bicycle {
	
	int enginePower;
	int currentGear;

	public MotorCycle(int speed, int enginePower, int currentGear) {
		super(speed);
		this.enginePower = enginePower;
		this.currentGear = currentGear;
	}

	@Override
	public void speedUp() {
		this.speed+=5;
		
	}

	@Override
	public void brakeDown() {
		this.speed-=5;
		
	}
	
	public void changeGear(int gear){
		System.out.println("Changing gear to " + gear);
		this.currentGear = gear;
	}

	@Override
	public String toString() {
		return "MotorCycle [enginePower=" + enginePower + ", currentGear=" + currentGear + ", speed=" + speed + "]";
	}

	@Override
	public void startBicycle() {
		System.out.println("start motor bicycle");
		
	}
	
	

}
