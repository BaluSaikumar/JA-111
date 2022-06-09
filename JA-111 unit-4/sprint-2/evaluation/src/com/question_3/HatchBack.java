package com.question_3;

public class HatchBack extends Car{
	
	final int farePerKm =15;

	public HatchBack(int numberOfPassenger, int numberOfKms) {
		super(numberOfPassenger, numberOfKms);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HatchBack [farePerKm=" + farePerKm + ", getFarePerKm()=" + getFarePerKm() + ", getNumberOfPassenger()="
				+ getNumberOfPassenger() + ", getNumberOfKms()=" + getNumberOfKms() + "]";
	}

	public int getFarePerKm() {
		return farePerKm;
	}

	public HatchBack() {
		super();
		// TODO Auto-generated constructor stub
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

	

}
