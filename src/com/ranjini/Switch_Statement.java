package com.ranjini;
public class Switch_Statement {
	public static void main(String[] args) {
		int i = 5;{
		System.out.println(i--);}
		switch (i) {
		case 1:
			System.out.println("SCHOOL");
			break;
		case 2:
			System.out.println("ATTENDANCE");
			break;
		case 3:
			System.out.println("LEAVE DETAILS");
			break;
		case 4:
			System.out.println("REPORT CARD");
			break;}
		{
			int a = 1;{
		System.out.println(++a);}
		switch (a) {
		case 1:
			System.out.println("GRADE A");
			break;
		case 2:
			System.out.println("GRADE B");
			break;
		case 3:
			System.out.println("MARK");
			break;
		case 4:
			System.out.println("MARK LIST");
			break;
		case 5:
			System.out.println("MARKSHEET");
			break;
		default:
			System.out.println("INVALID NUMBER");
			break;
		case 7:
			System.out.println("GRADE C");
			break;
			}
		}
}
}