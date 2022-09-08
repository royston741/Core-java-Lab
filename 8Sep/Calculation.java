/*
	Program : Java program to find Quotient and Remainder(take input).
	@author : Royston
	@Date : 8 September 
*/

// Declaring a class named Calculation
class Calculation
{
	// Calling main method
	public static void main(String args [])
	{
		// storing divident into a variable
		int divident=Integer.parseInt(args[0]);
		// storing divisor into a variable
		int divisor=Integer.parseInt(args[1]);
		
		// calculating the quotient
		int quotient=divident/divisor;
		// calculating the remainder
		int remainder=divident%divisor;
		
		// printing the quotient
		System.out.println("The quotient is : "+quotient);
		// printing the remainder
		System.out.println("The remainder is : "+remainder);
		
	}// main method ends
	
} // class ends