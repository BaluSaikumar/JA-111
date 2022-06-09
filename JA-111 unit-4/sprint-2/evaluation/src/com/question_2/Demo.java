package com.question_2;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students you need to create:");
		
		int num = sc.nextInt();
		
		Student[] students = new Student[num];
		
		for(int i = 0; i<num; i++) {
			
			System.out.println("Enter the student roll number: ");
			
			int roll = sc.nextInt();
			
			System.out.println("Enter the student name: ");
			
			String name = sc.next();
			
			System.out.println("Enter the student address: ");
			
			String address = sc.next();
			
			System.out.println("Enter the student marks: ");
			
			int marks = sc.nextInt();
			
			students[i] = new Student(roll, name, address, marks);
			
		}
		
		int sum = 0;
		
		for(Student student:students) {
			
			System.out.println("================================");
			
			System.out.println("student roll number is: " + student.getRoll());
			
			System.out.println("student name is: " + student.getName());
			
			System.out.println("student address is: " + student.getAddress());
			
			System.out.println("student marks is: " + student.getMarks());
			
			System.out.println("=================================");
			
			sum += student.getMarks();
		}
		
		System.out.println("Average marks of the students is:" + (sum/num));
		
	}

}
