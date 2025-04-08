package com.collectionconcepts;

import java.util.LinkedHashSet;

public class LinkedHashSetConcepts {
	
	/* Insertion order maintain
	 * duplicate value not allowed  
	 *  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> linked_Hash  = new LinkedHashSet<String>();
		
		linked_Hash.add("muthu");
		linked_Hash.add("kumaran");
		linked_Hash.add("QA");
		linked_Hash.add("testing");
		linked_Hash.add("UT");
		
		System.out.println(linked_Hash);

	}

}
