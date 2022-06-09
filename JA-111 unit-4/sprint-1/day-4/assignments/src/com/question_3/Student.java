package com.question_3;

public class Student {
	
	private int roll;
	
	private String name;
	
	private String address;
	
	private String collegeName;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String address, String collegeName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = collegeName;
	}
	
	

	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = "NIT";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", collegeName=" + collegeName
				+ "]";
	}

	public static Student getStudent(boolean isFromNIT) {
		
		if(isFromNIT==true) {
			
			Student student = new Student(21, "saikumar", "venugopalapuram");
			
			return student;
			
		}
		
		else {
			
			Student student = new Student(21, "rocky", "venugopalapuram", "VITS");
			
			return student;
			
		}
		
	}
	
	

}
