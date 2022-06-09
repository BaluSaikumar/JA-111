package com.Cric;

public class CricScore {
	
	static void cricScores(int num1s, int num2s, int num3s, int num4s, int num6s) {
		
		System.out.println("the batsman score is :" + (num1s*1 + num2s*2 + num3s*3 + num4s*4 + num6s*6));
		
	}
	
	public static void main(String[] args) {
		
		cricScores(0, 0, 0, 6, 6);
		
	}

}
