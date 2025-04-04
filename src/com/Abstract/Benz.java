package com.Abstract;

public class Benz extends Car implements First, Second {
	
	@Override
	public void engine() {
		System.out.println("The Benz car engine");
	}
	
	
	@Override
	public void secret() {
		System.out.println("The Benz car secret");		
	}
	
	public static void main(String[] args) {
		Car car = new Benz();
		car.engine();
		car.secret();
		First first = new Benz();
		first.method1();
		first.method2();
		
		
	}

	@Override
	public void methods() {
		System.out.println("The interface methods");
		
	}

	@Override
	public void method1() {
		System.out.println("The interface method1");
		
	}

	@Override
	public void method2() {
		System.out.println("The interface method2");
		
	}

}
