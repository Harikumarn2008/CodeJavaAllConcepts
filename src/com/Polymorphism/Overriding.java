package com.Polymorphism;

public class Overriding extends Son {
	
	//static method can't be override
	
	public void marriage() {
		System.out.println("My marriage my wishes");
	}
	
	public static void main (String [] Args) {
		Son son = new Overriding(); //ParenClass ref = new ChildCass();
		son.properties();
		son.marriage();
		
		
	}

}
