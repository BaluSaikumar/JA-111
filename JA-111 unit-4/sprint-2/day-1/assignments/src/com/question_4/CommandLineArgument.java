package com.question_4;

public class CommandLineArgument {
	
	public static void main(String[] args) {
		
		if(args.length==1) {
			
			int x = Integer.parseInt(args[0]);
			
			int sum = 1;
			
			for(int i = 1; i<=x; i++) {
				
				sum = sum * i;
				
			}
			
			System.out.println(sum);
			
		}
		
		else if(args.length==2) {
			
			int x = Integer.parseInt(args[0]);
			
			int y = Integer.parseInt(args[1]);
			
			int z = Math.abs(x-y);
			
			int sum = 1;
			
			for(int i = 1; i<=z; i++) {
				
				sum = sum * i;
				
			}
			
			System.out.println(sum);
			
		}
		
		else {
			
			System.out.println("Error");
			
		}
		
	}

}
