package com.ranjini;

import java.util.Set;

public class HashSet_Collection {
	
	public static void main(String [] args) {
		
			Set<Object> s = new java.util.HashSet<>();
		s.add(14.5);
		s.add("Ranjni");
		s.add('A');
		s.add(null);
		s.add(null);
		System.out.println(s);
		
		int size = s.size();
		System.out.println(size);
		boolean contains = s.contains(14.5);
		System.out.println(contains);
		
//		s.clear();
//		System.out.println(s);
		
		Set<Object> s1 = new java.util.HashSet<>();
		s1.add(18.5);
		s1.add("Maran");
		s1.add('B');
		s1.add(null);
		System.out.println(s1);
		
		s.addAll(s1);
		System.out.println(s);
		s.retainAll(s1);
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		
	}
}
