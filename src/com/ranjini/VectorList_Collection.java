package com.ranjini;
import java.util.List;
import java.util.Vector;

public class VectorList_Collection {
public static void main(String[] args) {
		
		List<Character> r = new Vector<>();
	r.add('A');
	r.add('B');
	r.add('C');
	System.out.println(r);
	
	int size = r.size();
	System.out.println(size);
	char string = r.get(0);
	System.out.println(string);
	int indexof = r.indexOf('C');
	System.out.println(indexof);
	boolean contains = r.contains('B');
	System.out.println(contains);
		
	r.set(2, 'D');
	System.out.println(r);
//	r.remove(2);
//	System.out.println(r);
//	r.clear();
//	System.out.println(r);
	
		List<Character> s = new Vector<>();	
	s.add('E');
	s.add('F');
	s.add('G');
	System.out.println(s);
	s.addAll(r);
	System.out.println(s);
	s.retainAll(r);
	System.out.println(s);
	s.removeAll(r);
	System.out.println(s);
	}
}