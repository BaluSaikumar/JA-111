package com.Question2;

public class CheckWheather {
	
	static void checkWheather(boolean isSnowing, boolean isRaining, double temperature) {
		
		if(isSnowing==true || isRaining==true || temperature<50.0) {
			
			System.out.println("Let’s stay home.");
			
		}
		
		else {
			
			System.out.println("Let’s go out!");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		checkWheather(false, true, 70.0);
		
	}

}
