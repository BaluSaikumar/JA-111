package com.question_3;

public class OLA {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
			
			Car car = new HatchBack();
			
			HatchBack back = (HatchBack)car;
			
			return back;
			
		}
		
		else {
			
			Car car = new Sedan();
			
			Sedan sedan = (Sedan)car;
			
			return sedan;
			
		}
		
	}
	
	public int calculateBill(Car car) {
		
		if(car==new Sedan()) {
			
			int totalFare = new Sedan().getNumberOfPassenger()*new Sedan().getFarePerKm();
			
			return totalFare;
			
		}
		
		else {
			
			int totalFare = car.getNumberOfPassenger()*new HatchBack().getFarePerKm();
			
			return totalFare;
			
		}
	}

}
