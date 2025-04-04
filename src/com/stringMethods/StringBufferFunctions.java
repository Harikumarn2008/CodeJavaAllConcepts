package com.stringMethods;

public class StringBufferFunctions {

	public static void main(String[] args) {
		String name = "QA";
		System.out.println("String is immutable");
		System.out.println("Appending name with original name " +name.concat("Testing"));
		System.out.println("Oriniganl name is "+name);
		
		System.out.println("---------------------------");
		
		System.out.println("String buffer is mutable");
		StringBuffer name1 = new StringBuffer("QA");
		System.out.println("Appending name with origanl name " + name1.append("Testing"));
		System.out.println("Oriniganl name is "+name1);
		
		//String buffer methods
		
		StringBuffer name2 = new StringBuffer("Muthukumaran");
		System.out.println(name2.reverse());
		//replace
		System.out.println(name2.replace(0, 3, "a"));
		
		//delete
		System.out.println(name2.delete(0, 3));
		
		StringBuffer name3 = new StringBuffer("Kumaran");
		System.out.println(name3.insert(0, "Muthu"));
		
		System.out.println(name2.capacity());
		//like string we have charAt, Substring, length method as well
		
		

	}

}
