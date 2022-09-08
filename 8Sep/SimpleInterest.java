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
		int principal=Integer.parseInt(args[0]);
		// rate of interest variable
		int rateOfInterest=Integer.parseInt(args[1]);
		// time variable
		int time=5;
		
		// Calculating the simple interest	
		int simpleInterest=principal*rateOfInterest*time;
		
		// printing the simple interest
		System.out.println("The simple interest for principal = "+principal+", rateofInterest = "+rateOfInterest+", time = "+time+" is : "+simpleInterest);
	
	}// main method ends
	
} // class ends