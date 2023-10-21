package com.ranjini;

public class String_Class {
	
	public static void main(String [] args) {
		
		String s = "Hello Java";
		String s1 = "Hello JAVA";
		
		int length = s.length();
		System.out.println(length);
		boolean equals = s.equals(s1);
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s);
		System.out.println(equalsIgnoreCase);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		boolean startsWith = s.startsWith("Hello");
		System.out.println(startsWith);
		boolean endsWith = s.endsWith("a");
		System.out.println(endsWith);
		boolean contains = s.contains("e");
		System.out.println(contains);
		int indexOf = s.indexOf("a");
		System.out.println(indexOf);
		char charAt = s.charAt(8);
		System.out.println(charAt);
		String replace = s.replace("Hello", "Hai");
		System.out.println(replace);
		String substring = s.substring(7);
		System.out.println(substring);
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		String[] split = s.split(" ");
		for (String	string : split) {
			System.out.println(string);
		}
		String str = "  Hello Java  ";
		System.out.println(str);
		System.out.println(str.trim());
		
		String substring2 = s.substring(2,5);
		System.out.println(substring2);
	}

}