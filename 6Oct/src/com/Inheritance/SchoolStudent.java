/*
 	Program : Create a Class student which is inherited by college and school student .
 	 		  Override the method calculate average marks.	
 	@Author : Royston
 	@date : 6 Oct
 */

package com.Inheritance;

//creating school student class inheriting student class
public class SchoolStudent extends Student {
	// no argument constructor
	public SchoolStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public SchoolStudent(int stdId, String stdName, int stdAge) {
		super(stdId, stdName, stdAge);
		// TODO Auto-generated constructor stub
	}

	// calculate avg marks
	@Override
	public void calcAvg(int... s) {
		this.avgMarks = (s[0] + s[1] + s[2]) / 3;
	}
}
