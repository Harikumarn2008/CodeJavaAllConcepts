package com.constructor;

public class ConsOverload {
	
	String draw;
	
	public ConsOverload() {
		System.out.println("Draw object is created");
	}

	public ConsOverload(String type) {
		this.draw = type;
		System.out.println("Drawing "+draw);
	}
	
	
	public static void main(String[] args) {
		
		ConsOverload over = new ConsOverload();
		ConsOverload over1 = new ConsOverload("Circle");
	}
}
