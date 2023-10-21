package com.ranjini;

public class Scanner {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("Enter the Company First Name:");
		String next = s.next();
		System.out.println(next);
		
		System.out.println("Enter the Company Last Name:");
		String next2 = s.next();
		System.out.println(next2);
		
		System.out.println("Enter the Mobile Numer:");
		long nextLong = s.nextLong();
		System.out.println(nextLong);
		
		System.out.println("Enter the Order Number:");
		int nextInt = s.nextInt();
		System.out.println(nextInt);
		
		System.out.println("Enter the Item Name:");
		String string = s.next().toString();
		System.out.println(string);
		
		System.out.println("Enter the Section:");
		char nextcharAt = s.next().charAt(0);
		System.out.println (nextcharAt);
		
		System.out.println("Enter the Date:");
		byte nextByte = s.nextByte();
		System.out.println(nextByte);
		
		System.out.println("Enter the Month:");
		short nextShort = s.nextShort();
		System.out.println(nextShort);
		
		System.out.println("Enter the Time:");
		double nextDouble = s.nextDouble();
		System.out.println(nextDouble);
		
		System.out.println("Enter the Price:");
		float nextFloat = s.nextFloat();
		System.out.println(nextFloat);
		
		System.out.println("Enter the Taste is Good:");
		boolean nextBoolean = s.nextBoolean();
		System.out.println(nextBoolean);
	}

}