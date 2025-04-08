package com.collectionconcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListConcepts {
	
	/*Arraylist will print(maintain) in insertion order. 
	 * It will allow duplicate value.

<> it is called generics
Arrary list is not synchronized 
Array list is not thread safe
*/
	
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
		
		//iterate
		
		
		for (String string: arrayList) {
			System.out.println("usign for each "+string);
		}
		
		System.out.println("-----------------------");
		
		  for (int i=0; i<arrayList.size(); i++) {
			System.out.println("using for loop "+arrayList.get(i));
	     	}
		  System.out.println("-----------------------");
		  
		  // we can achieve forward and reverse order using list iterator
		  ListIterator<String> lkis_iterator = arrayList.listIterator();
		  
		  while(lkis_iterator.hasNext()) {
			  System.out.println(lkis_iterator.next());  // print forward order
		  }
		  System.out.println("-----------------------");
		  while(lkis_iterator.hasPrevious()) {
			  System.out.println(lkis_iterator.previous()); // print reverse order
		  }
		  System.out.println("-----------------------");
		  // we can achieve forward order using list iterator
		Iterator<String> iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		arrayListExample();
		
	}

}
