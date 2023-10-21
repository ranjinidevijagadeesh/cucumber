package com.ranjini;

public class StudentDetails extends Constructor {

	public StudentDetails() {
		System.out.println();	
		}
	public StudentDetails(String Name) {
		System.out.println(Name);	
			}
	public StudentDetails(int Marks) {
		System.out.println(Marks);	
		}
	public StudentDetails(float Percentage) {
		System.out.println(Percentage);	
		}
	public StudentDetails(char Section) {
		System.out.println(Section);	
}
	public static void main(String [] args) {
		StudentDetails s = new StudentDetails();
		StudentDetails s1 = new StudentDetails("Ranjini");
		StudentDetails s2 = new StudentDetails(1140);
		StudentDetails s3 = new StudentDetails(92.5f);
		StudentDetails s4 = new StudentDetails('B');
	}
}
