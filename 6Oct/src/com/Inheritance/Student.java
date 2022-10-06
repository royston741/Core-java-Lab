/*
 	Program : Create a Class student which is inherited by college and school student .
 	 		  Override the method calculate average marks.	
 	@Author : Royston
 	@date : 6 Oct
 */
package com.Inheritance;

// creating student class
public class Student {
	// properties of student
	private int stdId;
	private String stdName;
	private int stdAge;
	protected int avgMarks;

	// no arguments constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Creating parameterized constructor
	public Student(int stdId, String stdName, int stdAge) {
		super();
		// initialize variables
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAge = stdAge;
	}

	// getter for stdId
	public int getStdId() {
		// return stdId
		return stdId;
	}

	// setter for stdId
	public void setStdId(int stdId) {
		// set stdId
		this.stdId = stdId;
	}

	// getter for stdName
	public String getStdName() {
		// return stdName
		return stdName;
	}

	// setter for stdName
	public void setStdName(String stdName) {
		// set stdName
		this.stdName = stdName;
	}

	// getter for stdAge
	public int getStdAge() {
		// return stdAge
		return stdAge;
	}

	// setter for stdAge
	public void setStdAge(int stdAge) {
		// seet stdAge
		this.stdAge = stdAge;
	}

	// getter avgMarks
	public int getAvgMarks() {
		// return avgMarks
		return avgMarks;
	}

	// calculate avg marks
	public void calcAvg(int... marks) {
		this.avgMarks = 0;
	}
}
