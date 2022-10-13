/*
 	Program : Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee
 	  		  and functionality. Create a test class.
 	@Author : Royston
 	@Date :13 Oct  		  	
 */

package com.Inherit;

// Create HourlyEmployee class
public class HourlyEmployee extends Employee {

	// no argument constructor
	public HourlyEmployee() {
		super();
	}

	// parameterized constructor
	public HourlyEmployee(int empId, String empName) {
		super(empId, empName);
	}

	@Override
	public void calculateEmpSalary(int numOfHours) {
		// initialize empSalary
		this.empSalary = numOfHours * 100;
	}
}
