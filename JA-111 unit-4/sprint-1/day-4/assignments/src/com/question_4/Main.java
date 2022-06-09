package com.question_4;

public class Main {
	
	
	void number(int num) {
		
		if(num%2==1) {
			
			System.out.println("the given number is odd " + num);
			
		}
		
		else if(num%2==0) {
			
			int x = (10-(num%10))+num;
			
			System.out.println(x);
			
		}
		
		else {
			
			System.out.println("Error");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		main.number(3);
		
		main.number(22);
		
		main.number(-5);
		
	}

}
