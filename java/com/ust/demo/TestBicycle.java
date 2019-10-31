package com.ust.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBicycle {

	@Test
	public void test() {
		int input = 10;
		Bicycle bicycle = new RoadBicycle(input);
		System.out.println(bicycle);
		bicycle.speedUp();
		System.out.println(bicycle);
		assertSame(11, bicycle.speed);
	}
	@Test
	public void testRoadBicycleBrakeDown() {
		int input = 10;
		Bicycle bicycle = new RoadBicycle(input);
		System.out.println(bicycle);
		bicycle.brakeDown();
		System.out.println(bicycle);
		assertSame(9, bicycle.speed);
	}
	
	@Test
	public void testMountainBicycleBrakeDown() {
		int input = 10;
		Bicycle bicycle = new MountainBicycle(input);
		System.out.println(bicycle);
		bicycle.brakeDown();
		System.out.println(bicycle);
		assertSame(9, bicycle.speed);
	}
	
	@Test
	public void testMotorCycleBrakeDown() {
		int input = 10;
		Bicycle bicycle = new MotorCycle(input, 1000, 0);
		System.out.println(bicycle);
		bicycle.brakeDown();
		System.out.println(bicycle);
		assertSame(5, bicycle.speed);
	}
	@Test
	public void testMountainBicycle(){
		int input = 10;
		Bicycle bicycle = new MountainBicycle(input);
		System.out.println(bicycle);
		bicycle.speedUp();
		System.out.println(bicycle);
		assertSame(12, bicycle.speed);
	}
	@Test
	public void testMotorCycle(){
		int input = 10;
		Bicycle bicycle = new MotorCycle(10, 1000, 0);
		System.out.println(bicycle);
		bicycle.speedUp();
		System.out.println(bicycle);
		assertSame(15, bicycle.speed);
	}

}
