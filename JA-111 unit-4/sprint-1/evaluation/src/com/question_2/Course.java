package com.question_2;

import java.util.Scanner;

public class Course {
	
	int courseId;
	
	String courseName;
	
	int courseFee;
	
	void displayCourseDetails() {
		
		System.out.println("course id: "+courseId);
		
		System.out.println("course name: "+courseName);
		
		System.out.println("course fees: "+courseFee);
		
	}
	
	static void authenticate(String username, String password) {
		
		if(username == "Admin" && password == "1234") {
			
			Course c = new Course();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter course ID");
			
			int id = sc.nextInt();
			
			System.out.println("Enter course name");
			
			String name = sc.next();
			
			System.out.println("Enter course fees");
			
			int fees = sc.nextInt();
			
			c.courseId = id;
			
			c.courseName = name;
			
			c.courseFee = fees;
			
			c.displayCourseDetails();
			
			
		}
		
		else {
			
			System.out.println("Invalid Username or password");
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		authenticate("Admin", "1234");
		
		System.out.println("------------------");
		
		authenticate("Admi", "123");
		
	}

}
