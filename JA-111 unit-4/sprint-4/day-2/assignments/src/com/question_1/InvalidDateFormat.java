package com.question_1;

public class InvalidDateFormat extends Exception{
	
	public InvalidDateFormat() {
		
		
		
	}
	
	public InvalidDateFormat(String message) {
		
		super(message);
		
		System.out.println(message);
		
	}

}
