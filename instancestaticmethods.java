package com.javaprograms.sample;

public class instancestaticmethods {
	 String a="neha";
	static int b=9;
	static int c=4;
	int d=8;
	String method() {//instance method access instance variables
		return a;
	}
		int method1() {//instance method access static variables
			return b;
		}
		static int method2() {//static method access static variable
			return c;
		}
     // static int method3(){//static method cannot access instance variable  return d;//instance variable
		
	

}
 