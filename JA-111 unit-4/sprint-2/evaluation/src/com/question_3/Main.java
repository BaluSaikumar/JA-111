package com.question_3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of passengers: ");
		
		int numberOfPassenger = sc.nextInt();
		
		System.out.println("Enter number of kms: ");
		
		int numberOfKms = sc.nextInt();

		OLA myOla = new OLA();
		
		Car car = new Sedan();
		
		Sedan sedan = (Sedan)car;
		
		sedan.setNumberOfKms(numberOfKms);
		
		sedan.setNumberOfPassenger(numberOfPassenger);
		
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		
		System.out.println(myCar);
		
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is: "+ res);
		
	}

}
