package com.question_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime extends InvalidDateFormat{
	
	public void validDoB(String dOB) throws InvalidDateFormat{
		
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate ld = LocalDate.now();
		
		
		try {
		LocalDate dob = LocalDate.parse(dOB,dtf);
		Period d = Period.between(dob,ld);
		if(d.getYears()>0) {
			
			System.out.println(d.getYears());
			
		}
		
		else if(d.getYears()<=0) {
			
			System.out.println("Date should not be in Future");
			
		}
		
		else {
			
			InvalidDateFormat idf = new InvalidDateFormat("InvalidDateFormat");
			
			throw idf;
			
		}
		}catch(InvalidDateFormat e) {
			
			e.getMessage();
			
		}
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) throws InvalidDateFormat {
		
		DateAndTime time = new DateAndTime();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the date of birth in the format dd/MM/yyyy ");
		
		String dOB = sc.next();
		
		try {
			time.validDoB(dOB);
		} catch (InvalidDateFormat e) {
			
			e.getMessage();
		}
		
		finally {
			System.out.println("end of main");
		}
		
		System.out.println("end of main");
		
	}

}
