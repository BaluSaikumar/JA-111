package com.question_1;

public class Student {
	
	private int roll;
	
	private String name;
	
	private int age;
	
	private int marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int age, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getAge() {
			
		if(age>18 && age<60) {
			
			return age;
			
		}
		
		else {
			
			return "this is invalid age";
			
		}
		
	}

	public void setAge(int age) {
		
		this.age = age;
		
		
	}

	public Object getMarks() {
		
		if(marks>0 && marks<500) {
			
			return marks;
			
		}
		
		else {
			
			return "marks is out of range";
			
		}
		
	}

	public void setMarks(int marks) {
		
		this.marks = marks;
		
	}
	
	

}
