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

// Crate Area class
public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breath) {
		// return area of rectangle
		return length * breath;
	}

	@Override
	public int squareArea(int side) {
		// return square area
		return side * side;
	}

	@Override
	public double circleArea(int radius) {
		// return circle square
		return 3.14 * radius * radius;
	}

}
