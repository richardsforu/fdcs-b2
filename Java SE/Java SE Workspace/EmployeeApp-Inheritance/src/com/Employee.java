package com;

public abstract class Employee {

	private int empId;
	private String empName;
	private double salary;

	private final int MAX_SALARY = 6345734;

	public final void copyRights() {
		System.out.println("-- Employee class copyRights");
	}

	public void acceptData() {
		// MAX_SALARY=3497394; // Invalid
		System.out.println("-- Employee class acceptData");
	}

	public abstract void processSalary(); 
	
	public void display() {
		System.out.println("Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("---------------------");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
