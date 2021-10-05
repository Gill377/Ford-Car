package gul.gill;

public class Car {
	String model;
	String color;
	int speed;
	String specs;
	
	public Car() {
		
		model= "gm";
		
	}
	
	public void start() {
		speed= 100;
	}
	
	public void speedup() {
		speed= speed + 10;
	}
	
	public void slowdown() {
		speed= speed -20;
	}
}