package com.question_3;

public class Main {
	
	public int prime(int num) {
		
		int count = 0;
		
		for(int i = 1; i<=num; i++) {
			
			if(num%i==0) {
				
				count++;
				
			}
			
			
			
		}
		
		if(count==2) {
			return 1;
		}
		
		else {
			return 2;
		}
		
		
		
		
		
	}
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray) {
		
		int arr2[] = new int[10];
		
		int count = 0;
		
		for(int i = 0; i<inputArray.length; i++) {
			
			if(prime(inputArray[i])==1) {
				
				arr2[count] = inputArray[i];
				
				count+=1;
			}
			

			
		}
		return arr2;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		int[] arr = {10,12,50,14,15};
		
		int[] x = main.findAndReturnPrimeNumbers(arr);
		
		int sum = 0;
		
		for(int item : x) {
			
			if(item>0) {
				
				System.out.println(item);
				
			}
			
			sum = sum + item;
		}
		
		if(sum == 0) {
			
			System.out.println("Prime number not found in the supplied Array");
			
		}
		
	}

}
