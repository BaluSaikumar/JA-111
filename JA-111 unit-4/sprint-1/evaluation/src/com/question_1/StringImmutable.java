package com.question_1;

public class StringImmutable {
	
	public static void main(String[] args) {
		
		String name = "saikumar";
		
		name.concat("rocky");
		
		System.out.println(name);
		
		String newName = name.concat("rocky");
		
		System.out.println(newName);
		
	}

}
