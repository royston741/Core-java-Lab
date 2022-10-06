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

// Creating shape class
public abstract class Shape {
	// abstract method rectangleArea
	public abstract int rectangleArea(int length, int breath);

	// abstract method squareArea
	public abstract int squareArea(int side);

	// abstract area circleArea
	public abstract double circleArea(int radius);
}
