package com.constructor;

public class NoArgConstructor {
	
	String name;
	int employeeID;
	
	
	NoArgConstructor(){
		name = "muthu";
		employeeID = 368;
				
		System.out.println(name+" id is "+employeeID);
	}

	public static void main(String[] args) {
		
		NoArgConstructor noArgConstructor = new NoArgConstructor();
		

	}

}
