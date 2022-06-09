package com.question_1;

public class Main {
	
	public static void main(String[] args) {
		
		Student student = new Student(21, "rocky", 30, 300);
		
		System.out.println("roll number is: " + student.getRoll());
		
		System.out.println("name is: " + student.getName());
		
		System.out.println("age is: " + student.getAge());
		
		System.out.println("marks is: " + student.getMarks());
		
		
		System.out.println("=============USING ZERO ARGUMENT CONSTRUCTOR=============");
		
		Student student2 = new Student();
		
		student2.setRoll(20);
		
		student2.setName("saikumar");
		
		student2.setAge(30);
		
		student2.setMarks(100);
		
		System.out.println("roll number is: " + student2.getRoll());
		
		System.out.println("name is: " + student2.getName());
		
		System.out.println("age is: " + student2.getAge());
		
		System.out.println("marks is: " + student2.getMarks());
		

		
		
		
		
		
		
		
		
	}

}
