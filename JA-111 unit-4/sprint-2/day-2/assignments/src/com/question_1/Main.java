package com.question_1;

import java.util.Scanner;

public class Main {
	
	public static Employee getEmployeeDetails(int employeeId,String employeeName,double salary){
		
		Employee emp1 = new Employee(employeeId,employeeName,salary);
		
		return emp1;
				
	}

	public static int getPFPercentage(int pfpercentage) {
		
		return pfpercentage;
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter employee details:");
		
		System.out.println("enter employee id: ");
		
		int employeeId = sc.nextInt();
		
		System.out.println("enter employee name");
		
		String employeeName = sc.next();
		
		System.out.println("enter employee salary");
		
		double salary = sc.nextDouble();
		
		System.out.println("enter pf percentage");
		
		int pfPercentage = sc.nextInt();
		
		Employee e = getEmployeeDetails(employeeId, employeeName, salary);
		
		int pf = getPFPercentage(pfPercentage);
		
		e.calculateNetSalary(pf);
		
		System.out.println(e);
		
		
		
	}

}
