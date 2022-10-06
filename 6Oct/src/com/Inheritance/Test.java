/*
 	Program : Create a Class student which is inherited by college and school student .
 	 		  Override the method calculate average marks.	
 	@Author : Royston
 	@date : 6 Oct
 */

package com.Inheritance;

// Creating Test class
public class Test {

	// calling main method
	public static void main(String[] args) {

		// Creating college student
		CollegeStudent clgS = new CollegeStudent(1, "Royston", 21);
		// calculate avg marks
		clgS.calcAvg(70, 75, 80, 85, 74);
		// print details
		System.out.println("------ College Student -------");
		System.out.println("Student Id is : " + clgS.getStdId());
		System.out.println("Student name is : " + clgS.getStdName());
		System.out.println("Student age is : " + clgS.getStdAge());
		System.out.println("Student average marks is : " + clgS.getAvgMarks());

		// Creating college student
		SchoolStudent schS = new SchoolStudent(1, "Tom", 13);
		// calculate avg marks
		schS.calcAvg(70, 75, 80);
		// print details
		System.out.println("------ School Student -------");
		System.out.println("Student Id is : " + schS.getStdId());
		System.out.println("Student name is : " + schS.getStdName());
		System.out.println("Student age is : " + schS.getStdAge());
		System.out.println("Student average marks is : " + schS.getAvgMarks());
	}

}
