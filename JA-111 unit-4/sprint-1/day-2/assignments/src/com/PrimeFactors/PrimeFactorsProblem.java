package com.PrimeFactors;

public class PrimeFactorsProblem {
	
	static void primeFactors(int num) {
		
		if(num<2 || num>100) {
			
			System.out.println("Invalid number");
			
		}
		else {
			
			for(int i = 1; i<=num; i++) {
				
				if(num%i==0) {
					System.out.println(i);
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		primeFactors(100);
		
	}
	
	

}
