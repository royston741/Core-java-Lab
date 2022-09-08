/*
	Program : Write a java program to calculate simple interest(SI =PxRxt).
	@author : Royston
	@Date : 8 September 
*/

// Declaring a class named SimpleInterest
class SimpleInterest
{
	// Calling main method
	public static void main(String args [])
	{	
		// principal variable
		int p=Integer.parseInt(args[0]);
		// rate of interest variable
		int r=Integer.parseInt(args[1]);
		// time variable
		int t=5;
		
		// Calculating the simple interest	
		int simpleInterest=p*r*t;
		
		// printing the simple interest
		System.out.println("The simple interest for p = "+p+", r = "+r+", t = "+t+" is : "+simpleInterest);
	
	}// main method ends
	
} // class ends