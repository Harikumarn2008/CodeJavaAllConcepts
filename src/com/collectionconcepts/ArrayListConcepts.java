package com.collectionconcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcepts {
	
	public static void arrayListExample() {
		List <String> arrayList = new ArrayList <String>();
		
		arrayList.add("Testing");
		arrayList.add("Dev");
		arrayList.add("test"); // it will allow duplicate value
		arrayList.add("test");
		System.out.println(arrayList);
		System.out.println(arrayList.get(2)); // it will print 2nd index value
		System.out.println(arrayList.indexOf("test")); //it will print first value from the list
		System.out.println(arrayList.lastIndexOf("test")); //it will print last value from the list
		
		
		List <String> anotherList = new ArrayList<String>();
		
		anotherList.addAll(arrayList); // add value from one list to another list
		
		System.out.println(anotherList);
		
		anotherList.clear(); //remove all value from list
		System.out.println(anotherList);
		
		arrayList.remove("Dev");
		System.out.println(arrayList); //remove particular value using value
		
		arrayList.remove(0);   //remove particular value using index
		System.out.println(arrayList);
		
		arrayList.add(null); // we can add null value in list
		System.out.println(arrayList);
		
		arrayList.set(0, "testing");
		System.out.println(arrayList); // replace the one value to another value
		
		System.out.println(arrayList.isEmpty()); //will check whether list is empty or not
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		arrayListExample();
		
	}

}
