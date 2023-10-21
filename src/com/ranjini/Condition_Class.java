package com.ranjini;

public class Condition_Class {
	
	public static void main(String[] args) {
		int i = 99;
		if(i<=55) {
			System.out.println("PASS");
		}
		else if (i>=50 && i<=60) {
			System.out.println("E GRADE");
		}
		else if (i>=61 && i<=70) {
			System.out.println("D GRADE");
		}
		else if (i>=71 && i<=80) {
			System.out.println("C GRADE");
		}
		else if (i>=81 && i<=90) {
			System.out.println("B GRADE");
		}
		else if (i>=91 && i<=100) {
			System.out.println("A GRADE");
		}
		else {
			System.out.println("INVALID NUMBER");
		}
	}
}
