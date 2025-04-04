package com.Polymorphism;

public class Overload {
	
	
	public void personalDetails(int age) {
		System.out.println("My age is "+age);
		}
	
	public void personalDetails(String name) {
		System.out.println("My name is "+name);
		}
	
	 public static void main(String[] aegs) {
		 
		 Overload overload = new Overload();
		 overload.personalDetails(26);
		 overload.personalDetails("Muthu");
		 }
	
	
	/*
	public void wayofTalk(Parent styleofTalk) {
		System.out.println("Polite, humble");
		}
	
   public void wayofTalk(Partner styleofTalk) {
		System.out.println("Love, remantic");
		}

   public void wayofTalk(Boss styleofTalk) {
		System.out.println("nothing, personal");
		}
   
   public static void main(String[] aegs) {
	   Overload overload = new Overload();  
	   Parent  parent  = new Parent();
	   overload.wayofTalk(parent);
	   Boss boss = new Boss();
	   overload.wayofTalk(boss);
	   Partner partner = new Partner();
	   overload.wayofTalk(partner);
	   
   }*/

	
	
}
