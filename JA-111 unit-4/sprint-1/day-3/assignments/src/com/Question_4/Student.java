package com.Question_4;

public class Student {
	
	int roll;
	
	String name;
	
	int marks;
	
	
	void displayStudentDetails() {
		
		System.out.println("Roll is :" + roll);
		
		System.out.println("Name is :" + name);
		
		System.out.println("Marks is :" + marks);
		
	}
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.roll = 21;
		
		student1.name = "rocky";
		
		student1.marks = 99;
		
		student1.displayStudentDetails();
		
		System.out.println("========================");
		
		Student student2 = student1;
		
		student2.roll = 33;
		
		student2.name = "motu";
		
		student2.marks = 35;
		
		student2.displayStudentDetails();
		
		student1 = null;
		
		student2 = null;
		
		
	}

}
