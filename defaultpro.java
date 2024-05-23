package com.javaprograms.constructors;

public class defaultpro{
	private int marks;
	private String name;
	private String branch;
	

public defaultpro() {
	marks=100;
	name="neha";
	branch="IT"; 
	
	
}
public String run() {
	if(marks>90 && name.equals("neha") && branch.equals("IT")){
		return "student is sri indu college";
		
	}
	else {
		    return "student is not sri indu college";
	}
}}