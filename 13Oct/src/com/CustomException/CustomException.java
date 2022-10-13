/*
 Program : Create a custom exception (Name cannot be null). The user will enter student details 
 			, it will throw an exception if the name or id id null
 @Author : Royston
 @Date : 13 Oct			
 */

package com.CustomException;

//Creating a class CustomException
public class CustomException extends Exception {
	// parameterized constructor
	CustomException(String name, int id) {
		// if name string is null
		if (name == null) {
			// print name not found
			System.out.println("Name not found.");
		}
		// if id is 0
		if (id == 0) {
			// print id not found
			System.out.println("Id not found");
		}
	}
}
