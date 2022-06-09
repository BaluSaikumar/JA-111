package com.question_1;

import java.util.Scanner;

public class Main {
	
	
	
	public static String reverseString(String input) {
		
		String given = "";
		
		char[] revString = new char[input.length()];
		
		for(int i = 0; i<input.length(); i++) {
			
			revString[i] = input.charAt(i);
			
		}
		
		for(int i = revString.length-1; i>=0; i--) {
			
			given = given + revString[i];
			
		}
		
		
		
		
		
		
		
		return given;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse");
		
		String originalString = sc.next();
		
		String result  = reverseString(originalString);
		
		System.out.println("original String is: " + originalString);
		
		System.out.println("Reversed string is: " + result);
		
		
		
	}

}
