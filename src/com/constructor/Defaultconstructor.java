package com.constructor;

public class Defaultconstructor {
	
	Integer age;
	String name;
	int rollno;
	
	//Here we not mention any constructor
	
	public static void main (String[] arge) {
	
		Defaultconstructor defaultone = new Defaultconstructor();
		
		System.out.println(defaultone.age);
		System.out.println(defaultone.rollno);	
	
	}
}
