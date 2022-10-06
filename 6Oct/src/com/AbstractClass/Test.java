/*
 	Program : We have to calculate the area of a rectangle, a square and a circle. 
 			  Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' 
 			  taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
 			  The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is 
 			  its side and that of 'CircleArea' is its radius. Now create another class 'Area' 
 			  containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' 
 			  for printing the area of rectangle, square and circle respectively. 
 		      Create an object of class 'Area' and call all the three methods.
 	@Author : Royston
 	@Date : 6 Oct
 */

package com.AbstractClass;

// import Scanner class
import java.util.Scanner;

// create test class
public class Test {
	// call main method
	public static void main(String[] args) {
		// create scanner object
		Scanner sc = new Scanner(System.in);
		// Create area object
		Area a1 = new Area();

		// for rectangle
		System.out.println("----- RECTANGLE -----");
		// take length and breadth input
		System.out.println("Enter the lenghth : ");
		int len = sc.nextInt();
		int bre = sc.nextInt();
		// print area of rectangle
		System.out.println("Area of rectangle is : " + a1.rectangleArea(len, bre));

		// for square
		System.out.println("----- SQUARE -----");
		// Take side input
		System.out.println("Enter the side : ");
		int side = sc.nextInt();
		// print area of square
		System.out.println("Area of square is : " + a1.squareArea(side));

		// for circle
		System.out.println("----- CIRCLE -----");
		// take radius input
		System.out.println("Enter the radius : ");
		int radius = sc.nextInt();
		// print area of circle
		System.out.println("Area of circle is : " + a1.circleArea(radius));

	}

}
