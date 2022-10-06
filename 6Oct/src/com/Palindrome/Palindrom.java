/*
 	Program : Write a code to check a string is palindrome or not		
 	@Author : Royston
 	@date : 6 Oct
 */

package com.Palindrome;

// import scanner class
import java.util.Scanner;

// Creating Palindrom class
public class Palindrom {

	// create checkIfPalindrome method
	public static void checkIfPalindrome(String orignalStr) {
		// reversed string
		String reversedString = "";

		// reverse the string
		for (int i = orignalStr.length() - 1; i >= 0; i--) {
			// add to reversed string variable
			reversedString += orignalStr.charAt(i);
		}

		// if palindrome
		if (orignalStr.equals(reversedString)) {
			// print is palindrome
			System.out.print("Is palindrome");
		}
		// not palindrome
		else {
			// print not palindrome
			System.out.print("Not palindrome");
		}
	}

	// calling main method
	public static void main(String[] args) {
		// creating scanner object
		Scanner sc = new Scanner(System.in);
		// taking string input and calling checkIfPalindrome method
		System.out.println("Enter the String : ");
		checkIfPalindrome(sc.next());
	}

}
