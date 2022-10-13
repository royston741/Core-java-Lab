/*
 	Program : Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee
 	  		  and functionality. Create a test class.
 	@Author : Royston
 	@Date :13 Oct  		  	
 */

package com.Inherit;

// Create employee class
public class Employee {
	// properties of empolyee
	private int empId;
	private String empName;
	protected int empSalary;

	// no argument constructor
	public Employee() {
		super();
	}

	// parameterized constructor
	public Employee(int empId, String empName) {
		super();
		// initialized variables
		this.empId = empId;
		this.empName = empName;
	}

	// get empId
	public int getEmpId() {
		// return empId
		return empId;
	}

	// set empId
	public void setEmpId(int empId) {
		// initialize empId
		this.empId = empId;
	}

	// get empName
	public String getEmpName() {
		// return empName
		return empName;
	}

	// set empName
	public void setEmpName(String empName) {
		// initialize empName
		this.empName = empName;
	}

	// get empSalary
	public int getEmpSalary() {
		// return empSalary
		return empSalary;
	}

	// calculate empSalary
	public void calculateEmpSalary(int timeDuration) {
		// initialize empSalary
		this.empSalary = 0;
	}

}
