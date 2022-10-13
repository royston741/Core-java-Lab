/*
 	Program : Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee
 	  		  and functionality. Create a test class.
 	@Author : Royston
 	@Date :13 Oct  		  	
 */
package com.Inherit;

// Create Test class
public class Test {

	// calling main method
	public static void main(String[] args) {
		// Create hourly employee
		System.out.println("----------- Hourly Employee ----------");
		HourlyEmployee emp1 = new HourlyEmployee(1, "Ram");
		// calling calculateEmp and passing number of hours
		emp1.calculateEmpSalary(9);
		// print employee details
		System.out.println("Employee Id is : " + emp1.getEmpId());
		System.out.println("Employee Name is : " + emp1.getEmpName());
		System.out.println("Employee Salary in a day is : " + emp1.getEmpSalary() + "Rs");

		// Create Salaried employee
		System.out.println("\n----------- Salaried Employee ----------");
		SalariedEmployee emp2 = new SalariedEmployee(2, "Sham");
		// calling calculateEmp and passing number of months
		emp2.calculateEmpSalary(1);
		// print employee details
		System.out.println("Employee Id is : " + emp2.getEmpId());
		System.out.println("Employee Name is : " + emp2.getEmpName());
		System.out.println("Employee Salary in a month is : " + emp2.getEmpSalary() + "Rs");

	}

}
