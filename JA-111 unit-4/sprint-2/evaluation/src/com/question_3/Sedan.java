package com.question_3;

public class Sedan extends Car{
	
	final int farePerKm =20;
	
	public Sedan() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Sedan(int numberOfPassenger, int numberOfKms) {
		super(numberOfPassenger, numberOfKms);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Sedan [farePerKm=" + farePerKm + ", getNumberOfPassenger()=" + getNumberOfPassenger()
				+ ", getNumberOfKms()=" + getNumberOfKms() + ", getFarePerKm()=" + getFarePerKm() + "]";
	}


	@Override
	public int getNumberOfPassenger() {
		// TODO Auto-generated method stub
		return super.getNumberOfPassenger();
	}


	@Override
	public void setNumberOfPassenger(int numberOfPassenger) {
		// TODO Auto-generated method stub
		super.setNumberOfPassenger(numberOfPassenger);
	}


	@Override
	public int getNumberOfKms() {
		// TODO Auto-generated method stub
		return super.getNumberOfKms();
	}


	@Override
	public void setNumberOfKms(int numberOfKms) {
		// TODO Auto-generated method stub
		super.setNumberOfKms(numberOfKms);
	}


	public int getFarePerKm() {
		return farePerKm;
	}

}
