package com.question_4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of students you want to add");
		
		int number   = sc.nextInt();
		
		int count = 0;
		
		for(int i = 0; i<number; i++) {
			
			System.out.println("Enter the roll number");
			
			int roll = sc.nextInt();
			
			System.out.println("Enter the name");
			
			String name = sc.next();
			
			System.out.println("Enter the marks");
			
			int marks = sc.nextInt();
			
			Student s = new Student(roll, name, marks);
			
			System.out.println("Student Details: " + (i+1));
			
			System.out.println("Student Roll Number: " + s.getRollNumber());
			
			System.out.println("Student Name: " + s.getStudentName());
			
			System.out.println("Student Marks: " + s.getMarks());
			
			System.out.println("-------------------------");
			
			
			
		}
		
	}

}
