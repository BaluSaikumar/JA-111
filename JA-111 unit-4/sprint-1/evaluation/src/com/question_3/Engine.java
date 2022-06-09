package com.question_3;

public class Engine {
	
	private int rmp;
	private int Power;
	private String manufacturer;
	private Boolean hasTurbo;
	
	public Engine() {
		super();
	}

	public int getRmp() {
		return rmp;
	}

	public void setRmp(int rmp) {
		this.rmp = rmp;
	}

	public int getPower() {
		return Power;
	}

	public void setPower(int power) {
		Power = power;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Boolean getHasTurbo() {
		
		if(true) {
			return hasTurbo;
		}
		return hasTurbo;
	}

	public void setHasTurbo(Boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}

	public Engine(int rmp, int power, String manufacturer, Boolean hasTurbo) {
		super();
		this.rmp = rmp;
		Power = power;
		this.manufacturer = manufacturer;
		this.hasTurbo = hasTurbo;
	}
	
	

}
