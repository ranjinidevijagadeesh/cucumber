package com.ranjini;

import java.util.Set;

public class TreeSet_Collection {
	
public static void main(String [] args) {
		
		Set<Character> i = new java.util.TreeSet<>();
	i.add('A');
	i.add('B');
	i.add('C');
	System.out.println(i);
	
	int size = i.size();
	System.out.println(size);
	boolean contains = i.contains('B');
	System.out.println(contains);
//	i.clear();
//	System.out.println(i);
	
	Set<Character> i1 = new java.util.TreeSet<>();
	i1.add('E');
	i1.add('D');
	i1.add('F');
	System.out.println(i1);
	
	i.addAll(i1);
	System.out.println(i);
	i.retainAll(i1);
	System.out.println(i);
	i.removeAll(i1);
	System.out.println(i);
	
	}
}
