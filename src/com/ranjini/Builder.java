package com.ranjini;

public class Builder {

	
public static void main(String [] args) throws InterruptedException{
		
		StringBuilder s = new StringBuilder ("Ranjini");
		System.out.println(System.identityHashCode(s));
		
		StringBuilder s1 = new StringBuilder ("Ranjini");
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(s1.append(s)));
	}

}
