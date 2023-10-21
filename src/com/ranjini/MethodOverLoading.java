package com.ranjini;

public class MethodOverLoading {

	public void studentDetails(String name) {
		System.out.println("Student Name:" + name);
	}
	public void studentDetails(String dept, char sec, long number) {
		System.out.println("Student Department:" + dept);
		System.out.println("Student Section:" + sec);
		System.out.println("Student Number:" + number);
	}	
	public void studentDetails(int m1, int m2, int m3, int m4, int m5) {
		System.out.println("Student Mark:" +m1+","+m2+","+m3+","+m4+","+m5);
	}
	public void studentDetails(long rollno) {
		System.out.println("Student Rollno:" + rollno);
	}
	
	public static void main (String [] args) {
		
	 MethodOverLoading s = new MethodOverLoading();
	 s.studentDetails("Ranjini");
	 s.studentDetails("MBA", 'A', 9677092746l);
	 s.studentDetails(60,70,80,90,50);
	 s.studentDetails(4568);
	 
	}
}
