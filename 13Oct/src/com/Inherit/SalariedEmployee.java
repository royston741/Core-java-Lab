/*
 	Program : Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee
 	  		  and functionality. Create a test class.
 	@Author : Royston
 	@Date :13 Oct  		  	
 */

package com.Inherit;

//Create SalariedEmployee class
public class SalariedEmployee extends Employee {

	// no argument constructor
	public SalariedEmployee() {
		super();
	}

	// parameterized constructor
	public SalariedEmployee(int empId, String empName) {
		super(empId, empName);
	}

	@Override
	public void calculateEmpSalary(int numOfMonths) {
		// initialize empSalary
		this.empSalary = numOfMonths * 10_000;
	}
}
