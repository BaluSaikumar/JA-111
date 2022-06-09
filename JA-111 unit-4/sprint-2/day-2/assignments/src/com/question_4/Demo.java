package com.question_4;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter how many student objects do you want:");
		
		int num = sc.nextInt();
		
		Student[] students = new Student[num];
		
		for(int i = 0; i<num; i++) {
			
			System.out.println("enter the student roll number: ");
			
			int roll = sc.nextInt();
			
			System.out.println("enter the name of the student: ");
			
			String name = sc.next();
			
			System.out.println("enter the address of the student: ");
			
			String address = sc.next();
			
			System.out.println("enter the marks of the student: ");
			
			int marks = sc.nextInt();
			
			Student student = new Student(roll, name, address, marks);
			
			students[i] = student;
			
		}
		
		int totalMarks = 0;
		
		for(Student student : students) {
			
			System.out.println(student);
			
			totalMarks += student.getMarks();
			
		}
		
		System.out.println("===== the average of all students marks is =====");
		
		int averageMarks = totalMarks/num;
		
		System.out.println(averageMarks);
		
	}

}
