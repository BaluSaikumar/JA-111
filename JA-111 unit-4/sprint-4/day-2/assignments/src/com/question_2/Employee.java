package com.question_2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employee {
	
	public void employeeBonus(String doj) throws InvalidAge {
		
		LocalDate ld = LocalDate.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate dj = LocalDate.parse(doj, dtf);
		
		Period p = Period.between(dj,ld);
		
		if(p.getYears()<1 && p.getYears()>0) {
			
			System.out.println("5000");
			
		}
		
		else if(p.getYears()<2 && p.getYears()>0) {
			
			System.out.println("8000");
			
		}
		
		else if(p.getYears()>2){
			
			System.out.println("10000");
			
		}
		
		else if(p.getYears()<0) {
			
			InvalidAge ia = new InvalidAge("Age should not be in the future");
			
			throw ia;
			
		}
		
		else {
			
			InvalidAge ia1 = new InvalidAge("Please pass the date in the correct format");
			
			throw ia1;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		System.out.println("enter the joining date in the format dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		String doj = sc.next();
		
		try {
			employee.employeeBonus(doj);
		} catch (InvalidAge e) {
			
			e.getMessage();
			
			System.out.println(e);
		}
		
	}

}
