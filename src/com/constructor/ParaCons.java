package com.constructor;

public class ParaCons {
	
	
	String animal_name;
	String animal_type;
	
	ParaCons(String name, String type){
		
		animal_name = name;
		animal_type = type;
	}
	
	public void typeanimal() {
		System.out.println("Animal name is "+animal_name+" and it's type is "+animal_type);
	}
	
	
	public static void main(String[] args) {
		
		ParaCons para = new ParaCons("Duck", "Omnivores");
		para.typeanimal();
		ParaCons para1 = new ParaCons("Karadi", "Omnivores");
		para1.typeanimal();
		
		
	}

}
