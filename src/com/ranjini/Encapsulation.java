package com.ranjini;

public class Encapsulation {

	public void studentName() {
		System.out.println("student Name: Ranjini");
	}
	public void studentName1() {
		System.out.println("student Name1: Jegadesh");
	}
	public void mobileNumber() {
		System.out.println("mobile Number: 9677092746");
	}	
	public void mailId() {
		System.out.println("mail Id: ranjini@gmail.com");	
	}
	public void courseName() {
		System.out.println("course Name: B.Sc");
	}
	public void department() {
		System.out.println("department: Computer Science");
	}
	public void section() {
		System.out.println("section: B");
	}
	public void studentsStrength() {
		System.out.println("students Strength: 60");
	}
	public void rollNumber() {
		System.out.println("roll Number: 35");
	}
		public static void main(String[] args) {
			Encapsulation e = new Encapsulation();
			e.studentName();
			e.studentName1();
			e.mobileNumber();
			e.mailId();
			e.courseName();
			e.department();
			e.section();
			e.studentsStrength();
			e.rollNumber();
		}
	}