package com.Conditional_Statement;

public class Elseif {
	
	String myHeroname = "My Father";
	
	public void namecheck() {
		
		if(myHeroname.equals("Mother")) {
			System.out.println("You thought about mom");
		}
		else if (myHeroname.equals("Sister")) {
			System.out.println("you thought about sister");
		}
		else if (myHeroname.equalsIgnoreCase("myfather")) {
			System.out.println("You thougt about my father");
		}
		else {
			System.out.println("Sorry I can't find");
		}
	}

	public static void main(String[] args) {
		
		Elseif check = new Elseif();
		check.namecheck();
	}

}
