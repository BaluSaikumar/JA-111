package com.question_1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of the array:");
		
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.println("Enter the number: ");
			
			int number = sc.nextInt();
			
			arr[i] = number;
			
		}
		
//		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the index of the array which you want to access: ");
		
		try {
			
			int index = sc.nextInt();
			
			System.out.println(arr[index]);
			
		} 
		
		catch (InputMismatchException ime) {
			
			System.out.println(ime.getMessage());
			System.out.println(ime);
			
		}
		
		catch (NumberFormatException nfe) {
			
			System.out.println(nfe.getMessage());
			System.out.println(nfe);
			
		}
		
		
		catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(e);
			
		}
		
		
		
		
		
	}

}
