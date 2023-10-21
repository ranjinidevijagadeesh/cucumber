package com.ranjini;

	import java.util.Collection;
	import java.util.Hashtable;
	import java.util.Map.Entry;
	import java.util.Set;

	public class HashTable_Collection {
		
		public static void main(String [] args) {
			
			Hashtable<Integer, String> m = new java.util.Hashtable<>();
			
			m.put(1, "Jegadesh");
			m.put(2, "Ranjini");
			m.put(3, "Maran");
			System.out.println(m);
			
			int size = m.size();
			System.out.println(size);
			
			String get = m.get(2);
			System.out.println(get);
			
			Set<Integer> keySet = m.keySet();
			System.out.println(keySet);
			
			Collection<String> values = m.values();
			System.out.println(values);
			
			boolean containsKey = m.containsKey(2);
			System.out.println(containsKey);
			
			boolean containsValue = m.containsValue("Raja");
			System.out.println(containsValue);
			
			Set<Entry<Integer, String>> entrySet = m.entrySet();
			System.out.println(entrySet);
		}
	}
