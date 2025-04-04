package com.Conditional_Statement;

public class IfandElse {
	
	
	boolean isCupEmpty = true; //boolean default value is false
	
	public static void main(String[] args) {
		IfandElse coffe = new IfandElse();
		
		
		if(coffe.isCupEmpty){
			System.out.println("Fill the cup");
		}
		else {
			System.out.println("Dirnk the coffe");
		}
		
	}

}
