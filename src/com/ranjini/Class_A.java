package com.ranjini;

public class Class_A implements Abstraction{
	@Override
	public void studentName() {
		System.out.println("Maran");
	}
	@Override
	public void studentDepartment() {
		System.out.println("BE");
	}
	@Override
	public void studentSection() {
		System.out.println("B");
	}
	@Override
	public void studentNumber() {
		System.out.println("9952541074");
	}
	@Override
	public void studentMark() {
		System.out.println("60,70,80,90,50");
	}
	@Override
	public void studentRollno() {
		System.out.println("6789");
	}
	public static void main (String [] args) {
		 Class_A a = new Class_A();
		 a.studentName();
		 a.studentDepartment();
		 a.studentSection();
		 a.studentNumber();
		 a.studentMark();
		 a.studentRollno();
		}
}
