/*
 Program : Create a custom exception (Name cannot be null). The user will enter student details 
 			, it will throw an exception if the name or id id null
 @Author : Royston
 @Date : 13 Oct			
 */

package com.CustomException;

// Create student class
public class Student {

	// create checkStudent method
	static void checkStudent(String stdName, int stdId) throws CustomException {
		// if student name is null or student id is 0
		if (stdName == null || stdId == 0) {
			// throw exception
			throw new CustomException(stdName, stdId);
		}
		// if student details are provided
		else {
			// print details
			System.out.println("Student name is : " + stdName);
			System.out.println("Student Id is : " + stdId);
		}
	}

	// call main method
	public static void main(String[] args) throws CustomException {
		// student variables
		String stdName = "Roy";
		int stdId = 1;

		// calling check student method
		checkStudent(stdName, stdId);

	}

}
