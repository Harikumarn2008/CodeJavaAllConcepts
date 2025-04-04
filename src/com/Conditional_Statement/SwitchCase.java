package com.Conditional_Statement;

public class SwitchCase {
	
	String heroName = "Captain America";
	
	
	public void heroNameCheck() {
		switch(heroName){
		case ("Iron Man"):
			System.out.println("You thought about Iron man");
		case ("Supre Man"):
			System.out.println("You thought about Super man");
			
		case ("Captain America"):
			System.out.println("You thought about Super man");
		default:
			System.out.println("Sorry can't find the hero name");
		}
	}

	
public static void main(String[] args) {
		
	SwitchCase check = new SwitchCase();
		check.heroNameCheck();
	}
}
