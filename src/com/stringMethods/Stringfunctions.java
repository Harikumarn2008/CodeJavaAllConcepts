package com.stringMethods;

public class Stringfunctions {
	
	public static void main(String[] args) {
		
		String name = " Testiang QaA ";
		
		//return char value for particular index
		System.out.println(name.charAt(4)); //we need to give index value
		
		//return string length
		System.out.println(name.length()); 
		
		//checks the equality of the string with the given object
		System.out.println(name.equals("test")); //return false if it is not equal
		
		//checks the equality of the string with the given object without case sensitivity
		System.out.println(name.equalsIgnoreCase("Test")); //return false if it is not equal
		
		//check if string is empty or no
		System.out.println(name.isEmpty()); //return boolean value
		
		//return true or false based on the given value is present or not
		System.out.println(name.contains("A")); // it consider case sensitivity 
		
		//take a particular portion of the string  method overloading
		System.out.println(name.substring(1)); //return string value
		
		//take a particular portion of the string begin and end method overloading
		System.out.println(name.substring(0,4)); //print Hari
				
		//appends the string to the given string		
		System.out.println(name.concat(" Automation"));
		
		//replace the existing char with given char
		System.out.println(name.replace("a", "A"));
		System.out.println(name.replace("QaA", "King"));
		
		//find the portion of the character in String
		System.out.println(name.indexOf("a"));
		
		//find the character specified from the index portion
		System.out.println(name.indexOf("a", 6));
		
		//find the character specified from the index portion
		System.out.println(name.indexOf('a', 6));
		
		//find the character specified from the index portion
		System.out.println(name.indexOf("Test", 3));
		
		//remove the space from before and after but it won't remove in between space
		System.out.println(name.trim());
		
		//convert given data type into string
		System.out.println(String.valueOf(1));
		
		String uppercase = "ABCD";
		System.out.println(uppercase.toLowerCase());
		String lowercase = "abcd";
		System.out.println(lowercase.toUpperCase());
		
		//return the joined string with given delimiter
		System.out.println(String.join("-", "Learn", "Automation"));
		System.out.println(String.join("/", "20", "11", "1998"));
		
		//split
		String fullname = "Am, I, manual tester";
		String [] splitname = fullname.split("a");
		for	(String finalname: splitname) {
			System.out.println(finalname);
		}
		
		
		
		
		
		
	}

}
