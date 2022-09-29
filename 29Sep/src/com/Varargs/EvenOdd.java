/*
  Program : Write a program to print sum of even and odd numbers using varargs.
  @Author : Royston
  @Date : 29Sep	
 */

package com.Varargs;

// import println method
import static java.lang.System.out;

import java.util.Scanner;

// creating EvenOddclass
public class EvenOdd {

	// Creating add method
	static void add(int... arr) {
		// total of odd num
		int oddSum = 0;
		// total of even num
		int eveSum = 0;
		// for every element of arr
		for (int i : arr) {
			// if event
			if (i % 2 == 0) {
				// add to even
				eveSum += i;
			}
			// if odd
			else {
				// add to odd
				oddSum += i;
			} // if-else ends
		} // for ends

		// calling display method and passing oddSum and eveSum
		display(oddSum, eveSum);
	}

	// create add method
	static void display(int odd, int even) {
		// print even odd
		out.println("The even sum is : " + even);
		out.println("The odd sum is : " + odd);
	}

	// calling main method
	public static void main(String... args) {
		// Creating scanner object
		Scanner sc = new Scanner(System.in);

		// taking size array input
		out.println("Enter the size of the array  : ");
		int size = sc.nextInt();
		// creating array
		int arr[] = new int[size];
		// taking element input
		for (int i = 0; i < size; i++) {
			out.println("Enter element " + i + " :");
			arr[i] = sc.nextInt();
		}
		// calling add method and passing arr
		add(arr);
	}
}
