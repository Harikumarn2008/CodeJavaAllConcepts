package com.collectionconcepts;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> string = new HashSet<String>();
		
		string.add("z");
		string.add("t");
		string.add("Z");
		string.add(null);
		string.add("a");
		string.add("A");
		string.add("A");//it won't allow duplicate value
		
		System.out.println(string);
		System.out.println(string.contains("A"));		
		string.remove("A");
		System.out.println(string);
		
		Iterator<String> iterator = string.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
