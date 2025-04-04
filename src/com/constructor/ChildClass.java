package com.constructor;

public class ChildClass extends ParentClass {
	
	
	public ChildClass() {
		//super(); we don't want to declare the super() keyword it will consider as super by default while using extends
		System.out.println("child constructor");
	}

	
	public static void main(String[] args){
		
		ChildClass child = new ChildClass();
	}
}
