package com.ExceptionHandling;

public class ExceptionHand {
	
	static String name;
	
	public static void print() {
		
		
		try {
			System.out.println(name.length());
		} 
		catch (Exception e) {
			e.printStackTrace(); //it will print the exception name we can uncommand this line
			System.out.println("String is null please give some value");
		}
		
	}

	public static void main(String[] args) {
		print();
		

	}

}
