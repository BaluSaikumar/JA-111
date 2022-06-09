package com.question_3;

public class Main {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.setModel("Harrier");
		
		car1.setCompanyName("Tata");
		
		car1.setColor("black");
		
		car1.setEngine( new Engine(10000, 110, "tata", true));
		
		System.out.println("Car Model :" + car1.getModel());
		
		System.out.println("Car companyName :" + car1.getCompanyName());
		
		System.out.println("Car color :" + car1.getColor());
		
		System.out.println("Car RPM :" + car1.getEngine().getRmp());
		
		System.out.println("Car power :" + car1.getEngine().getPower());
		
		System.out.println("Car Engine Manufacture :" + car1.getEngine().getManufacturer());
		
		System.out.println("Car Has Turbo :" + car1.getEngine().getHasTurbo());
		
		
		System.out.println("====================================================");
		
		
		Car car = new Car("Harrier", "Tata", "black", new Engine(10000, 110, "tata", true));
		
		System.out.println("Car Model :" + car.getModel());
		
		System.out.println("Car companyName :" + car.getCompanyName());
		
		System.out.println("Car color :" + car.getColor());
		
		System.out.println("Car RPM :" + car.getEngine().getRmp());
		
		System.out.println("Car power :" + car.getEngine().getPower());
		
		System.out.println("Car Engine Manufacture :" + car.getEngine().getManufacturer());
		
		System.out.println("Car Has Turbo :" + car.getEngine().getHasTurbo());
		
		
	}

}

//Car Model : Harrier
//Car companyName : Tata
//Car color : black
//Car RPM : 10000
//Car power : 110
//Car Engine Manufacture : tata
//Car Has Turbo : true
