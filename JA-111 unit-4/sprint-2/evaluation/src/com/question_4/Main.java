package com.question_4;

public class Main {
	
	public static Person generatePerson(Person person) {
		
		if(person==new Student()) {
			
			Person person2 = new Student();
			
			Student student = (Student)person2;
			
			student.name = "saikumar";
			
			student.gender = "male";
			
			student.studentId = 100;
			
			student.courseEnrolled = "ja-111";
			
			student.courseFee = 10000;
			
			student.address.city = "nellore";
			
			student.address.state = "andhra pradesh";
			
			student.address.pincode = "524121";
			
			return student;
			
		}
		
		else {
			
			Person person2 = new Instructor();
			
			Instructor instructor = (Instructor)person2;
			
			instructor.name = "sathya";
			
			instructor.gender = "male";
			
			instructor.instructorId = 21;
			
			instructor.salary = 30000;
			
			instructor.address.city = "nellore";
			
			instructor.address.state = "andhra pradesh";
			
			instructor.address.pincode = "524121";
			
			return instructor;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Person newStudent = generatePerson(new Student());

		Person newInstructor = generatePerson(new Instructor());

		System.out.println(newStudent);
		
		System.out.println(newInstructor);
		
	}

}
