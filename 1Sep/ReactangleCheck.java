/*
	Program : Create a class named 'Rectangle' with two data members- length and breadth
		  and a function to calculate the area which is 'length*breadth'. 
	          The class has three constructors which are :  
			1 - having no parameter - values of both length and breadth are assigned zero.		
			2 - having two numbers as parameters - the two numbers are assigned as length 
			    and breadth respectively.		
			3 - having one number as parameter - both length and breadth are assigned 
			    that number.		
		   Now, create objects of the 'Rectangle' class having none, one and two parameters
 		   and print their areas.
	@author : Royston
	@date : 1 September	
*/

// import all the methods from system class 
import static java.lang.System.*;

// Creating class named rectangle
class Rectangle
{
	// instance variables
	private int length;
	private int breadth;
	
	// Default constructor if no parameters are provided
	Rectangle(){
		// setting he length and breadth as 0
		this.length=0;
		this.breadth=0;
	}
	
	// if single parameter is provided   
	Rectangle(int value){
		// initializing the length and breadth
		this.length=value;
		this.breadth=value;
	}
	
	// if two parameters are provided   
	Rectangle(int length,int breadth){
		// initializing the length and breadth
		this.length=length;
		this.breadth=breadth;
	}

	// method to calculate area of rectangle
	int calculateArea(){
		// returning the area of rectangle
		return length*breadth;
	}
	
} // class Reactangle ends


// Creating a class named ReactangleCheck
class ReactangleCheck
{
	// Calling main method
	public static void main(String...args){
		
		// creating a object r1
		Rectangle r1=new Rectangle();
		// printing the area of r1
		out.println("The area of r1 rectangle is "+r1.calculateArea()+" square units");
		
		// creating a object r2
		Rectangle r2=new Rectangle(10);
		// printing the area of r2
		out.println("The area of r2 rectangle is "+r2.calculateArea()+" square units");
		
		// creating a object r3
		Rectangle r3=new Rectangle(40,20);
		// printing the area of r3
		out.println("The area of r3 rectangle is "+r3.calculateArea()+" square units");
	
	}
}
