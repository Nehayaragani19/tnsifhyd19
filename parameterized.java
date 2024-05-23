package com.javaprograms.constructors;

public class parameterized {
	private String doors;
	private String engine;
	private String driver;
	private int speed;

	public parameterized(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
 
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}else {
			return "car is not running";
		}
	}

}

	

