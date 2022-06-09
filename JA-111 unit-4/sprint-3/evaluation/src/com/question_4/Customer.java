package com.question_4;

public class Customer {
	
	private String userName;
	
	private String password;
	
	private String mobileNumber;
	
	private String email;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String userName, String password, String mobileNumber, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [userName=" + userName + ", password=" + password + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + "]";
	}
	
	

}
