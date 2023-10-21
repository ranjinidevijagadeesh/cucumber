package com.ranjini;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Collection {
	
	public static void main(String [] args) {
		
		List<String> l = new ArrayList<>();
		
	l.add("Laptop");
	l.add("Mobile");
	l.add("Tab");
	System.out.println(l);
	
	int size = l.size();
	System.out.println(size);
	String string = l.get(0);
	System.out.println(string);
	int indexof = l.indexOf("Mobile");
	System.out.println(indexof);
	boolean contains = l.contains("Tab");
	System.out.println(contains);
		
	l.set(2, "TV");
	System.out.println(l);
//	l.remove(1);
//	System.out.println(l);
//	l.clear();
//	System.out.println(l);
	
	List<String> s = new ArrayList<>();
	
	s.add("Charger");
	s.add("Cable");
	s.add("Keyboard");
	System.out.println(s);
	s.addAll(l);
	System.out.println(s);
	s.retainAll(l);
	System.out.println(s);
	s.removeAll(l);
	System.out.println(s);
	
	}
}