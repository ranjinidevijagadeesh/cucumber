package com.ranjini;

import java.util.Set;

public class LinkedHashSet_Collection {
	
	public static void main(String [] args) {
		
		Set<Object> r = new java.util.LinkedHashSet<>();
	r.add(10);
	r.add("Laptop");
	r.add('A');
	r.add(null);
	System.out.println(r);
	
	int size = r.size();
	System.out.println(size);
	boolean contains = r.contains(14.5);
	System.out.println(contains);
//	r.clear();
//	System.out.println(r);
	
	Set<Object> r1 = new java.util.LinkedHashSet<>();
	r1.add(5);
	r1.add("Mouse");
	r1.add('B');
	r1.add(null);
	System.out.println(r1);
	
	r.addAll(r1);
	System.out.println(r);
	r.retainAll(r1);
	System.out.println(r);
	r.removeAll(r1);
	System.out.println(r);
	}
}
