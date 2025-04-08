package com.collectionconcepts;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetConcepts {
	
	/* Tree set is a class
	 * not allow duplicate
	 * print ascending order
	 * null not allowed
	 */
	
	public static void main(String[] args) {
		
		TreeSet<Integer> tree_set = new TreeSet<Integer>();
		
		tree_set.add(10);
		tree_set.add(100);
		tree_set.add(45);
		tree_set.add(3);
		
		System.out.println("Element are sorter by ascending order "+ tree_set);
		
		System.out.println(tree_set.headSet(45)); //print below the 45 value
		System.out.println(tree_set.tailSet(45));// print 45 & above the 45 
		System.out.println(tree_set.subSet(10, 100)); // print 10 & in between  10-100		
		
		//comparator
		System.out.println("Comparator return null if thesorting is default order is"
				+ " " + tree_set.comparator());
		
		//will return immediate higher value
		System.out.println("higher value "+tree_set.higher(10)); 
		
		//will return immediate lower value
		System.out.println("lower value "+tree_set.lower(10)); 
		
		//poll
		System.out.println("Poll first  "+tree_set.pollFirst()); 
		System.out.println("Poll first  "+tree_set.pollLast()); 	
		System.out.println("After Poll  "+tree_set );
		System.out.println("descending order  "+tree_set.descendingSet() );
		
		Iterator<Integer> integer = tree_set.iterator();
		
		while(integer.hasNext()) {
			System.out.println(integer.next());
		}
		
		System.out.println("------------------------");
		Iterator<Integer> descending_Iterator = tree_set.descendingIterator();
		
		while(descending_Iterator.hasNext()) {
			System.out.println(descending_Iterator.next());
		}
	}
}
