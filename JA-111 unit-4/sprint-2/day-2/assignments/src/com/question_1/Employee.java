package com.question_1;

public class Employee {
	
	private int employeeId;
	
	private String employeeName;
	
	private double salary;
	
	private double netSalary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", netSalary=" + netSalary + "]";
	}
	
	public void calculateNetSalary(int pfpercentage) {
		
		double pfSalary = (pfpercentage*getSalary())/100;
		
		netSalary = getSalary()-pfSalary;
		
		setNetSalary(netSalary);
		
		System.out.println(netSalary);
	}
			

}
