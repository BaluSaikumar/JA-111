package com.SumOfNaturalNumbers;

public class _2ndLogic {
	
	static void sumNatural(int num) {
		
		int sum = 0;
		
		for(int i = 1; i<=num; i++) {
			
			sum = sum + i;
			
		}
		
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
		sumNatural(5);
		
	}

}
