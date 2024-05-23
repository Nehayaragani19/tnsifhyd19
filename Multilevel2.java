package com.javaprograms.inheritance;

public class Multilevel2 extends Multilevel1 {
	String vechicle() {
		return  "car,bike";
	} 
	public static void main(String[] args) {
		Multilevel2 m=new Multilevel2();
		System.out.println(m.vechicle());
		
		
	}

}
