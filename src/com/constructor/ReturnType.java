package com.constructor;

public class ReturnType {
	
	
 public  Integer collectAmount = 100;
 
 public Integer collect() {
	 
	 System.out.println("Hi there collect amount is "+collectAmount);
	 return collectAmount;
	 
 }
 
 
 
 public static void main(String[] args) {
	 
	 ReturnType returntype = new ReturnType();
	 
	 Integer collected = returntype.collect();
	 
	 System.out.println("Hi I got the amount "+collected);
	 
 }
 

}


