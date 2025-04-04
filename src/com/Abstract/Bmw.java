package com.Abstract;

public class Bmw extends Car {
	
	@Override
	public void engine() {
		System.out.println("The BMW car engine");
	}
	
	@Override
	public void secret() {
		System.out.println("The BMW car secret");		
	}
	
	public static void main(String[] args) {
		Car car = new Bmw();
		car.engine();
		car.secret();
	}
}
