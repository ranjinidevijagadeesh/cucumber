package com.ranjini;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Collection {
	
	public static void main(String[] args) {
		
		List<Integer> i = new LinkedList<>();
	i.add(5);
	i.add(10);
	i.add(15);
	System.out.println(i);
	
	int size = i.size();
	System.out.println(size);
	int string = i.get(0);
	System.out.println(string);
	int indexof = i.indexOf(10);
	System.out.println(indexof);
	boolean contains = i.contains(10);
	System.out.println(contains);
	i.set(2, 20);
	System.out.println(i);
//	i.remove(0);
//	System.out.println(i);
//	i.clear();
//	System.out.println(i);
	
	List<Integer> j = new LinkedList<>();
	
	j.add(30);
	j.add(40);
	j.add(50);
	System.out.println(j);
	j.addAll(i);
	System.out.println(j);
	j.retainAll(i);
	System.out.println(j);
	j.removeAll(i);
	System.out.println(j);	
	}
}