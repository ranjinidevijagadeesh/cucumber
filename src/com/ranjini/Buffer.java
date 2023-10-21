package com.ranjini;

public class Buffer {
	
	public static void main(String [] args) throws InterruptedException{
		
		StringBuffer s = new StringBuffer ("Ranjini");
		System.out.println(System.identityHashCode(s));
		Thread.sleep(3000);
		
		StringBuffer s1 = new StringBuffer ("Ranjini");
		System.out.println(System.identityHashCode(s1));
		Thread.sleep(4000);
		
		System.out.println(System.identityHashCode(s1.append(s)));
	}

}
