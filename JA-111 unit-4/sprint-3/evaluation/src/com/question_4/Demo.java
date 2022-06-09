package com.question_4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Customer customer = new Customer();
		
		
		
		try {
			
			
			boolean b = false;
			
			while(!b) {
				
				System.out.println("Enter the username: ");
				
				String userName = sc.next();
			
			if(Pattern.matches("[a-z]{3}[a-z]{5}", userName)){
				
				customer.setUserName(userName);
				
				b = true;
				
			}
			else {
				
				System.out.println("username is incorrect");
				
			}
			
			}
			
			b=false;
			
			while(!b) {
				
				System.out.println("Enter the password: ");
				
				String password = sc.next();
			
			if(Pattern.matches("[a-z]{3}[0-9]{5}", password)){
				
				customer.setPassword(password);
				
				b = true;
				
			}
			else {
				
				System.out.println("password is incorrect");
				
			}
			}
			
			b=false;
			
			while(!b) {
				
				System.out.println("Enter the mobile number: ");
				
				String mobileNumber = sc.next();
			
			if(Pattern.matches("[6-9]{1}[0-9]{9}", mobileNumber)){
				
				customer.setMobileNumber(mobileNumber);
				
				b = true;
				
			}
			else {
				
				System.out.println("mobile number is incorrect");
				
			}
			}
			
			b=false;
			
			while(!b) {
				
				System.out.println("Enter the email: ");
				
				String email = sc.next();
			
			if(Pattern.matches("[a-z]{8}", email)){
				
				customer.setEmail(email+"@gmail.com");
				
				b = true;
				
			}
			else {
				
				System.out.println("email is incorrect: ");
				
			}
			}
			
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		
		System.out.println(customer);
		
	}


}
