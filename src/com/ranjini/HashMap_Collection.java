package com.ranjini;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Collection {
	
	public static void main(String [] args) {
		
		Map<Character, Float> s = new java.util.HashMap<>();
		s.put('A', 0.5f);
		s.put('B', null);
		s.put('C', null);
		s.put(null, 0.6f);
		System.out.println(s);
		
		int size = s.size();
		System.out.println(size);
		
		Float float1 = s.get('B');
		System.out.println(float1);
		
		Set<Character> keySet = s.keySet();
		System.out.println(keySet);
		
		Collection<Float> values = s.values();
		System.out.println(values);
		
		boolean containsKey = s.containsKey('D');
		System.out.println(containsKey);
		
		boolean containsValue = s.containsValue(0.5f);
		System.out.println(containsValue);
		
		Set<Entry<Character, Float>> entrySet = s.entrySet();
		System.out.println(entrySet);
	}
}
