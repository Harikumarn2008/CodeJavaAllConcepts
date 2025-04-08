package com.collectionconcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(4);
		list.add(24);
		list.add(44);
		
		System.out.println(list);
		
		list.addFirst(33);
		System.out.println("after adding first value "+list);
		list.addLast(933);
		System.out.println("after adding las value "+list);
		
		System.out.println("get value using index "+list.get(2));
		
		//get first value
		System.out.println("get first value using index "+list.get(0));
	
		System.out.println("get first value "+list.getFirst());
		
		//get last value
		System.out.println("get last value "+list.getLast());
		
		//remove first value
		System.out.println("remove first value  "+list.removeFirst());
		System.out.println(list);
		
		//remove last value
		System.out.println("remove last value  "+list.removeLast());		
		System.out.println(list);
		
		//poll is using to remove the element from list
		System.out.println("remove first value  "+list.pollFirst());
		System.out.println(list);
		
		//poll is using to remove the element from list
		System.out.println("remove first value  "+list.pollLast());
		System.out.println(list);
		
		list.add(1);
		list.add(4);
		list.add(24);
		list.add(44);
		System.out.println(list);
		
		//remove first occurrence 
		list.removeFirstOccurrence(24);
		System.out.println(list);
		
		//remove last occurrence
		list.removeLastOccurrence(4);
		System.out.println(list);
		
		System.out.println("----------------------------");
		
		
		for (int a : list) {
			System.out.println("Iterator value "+a);
		}
		System.out.println("----------------------------");
		
		Iterator<Integer> list_value = list.iterator();
		while(list_value.hasNext()) {
			System.out.println("Using iterator "+list_value.next());
		}
				
				
				
	}

}
