package com.question_2;

public class Demo {

	

	public Demo() {
		
		System.out.println("in zero argument constructor");
		
	}
	
	public Demo(int i) {
		
		System.out.println("the value of i is: "+ i);
		
	}
	
	public Demo(String s) {
		
		System.out.println("the name is: " + s);
		
		float f = 5.5f;
		
		
	}
	
	public Demo(float f) {
		
		System.out.println("the float number is: " + f);
		
	}
	
	public static void main(String[] args) {
		
		Demo demo = new Demo("saikumar");
		
		Demo f = new Demo(5.5f);
		
	}

}
