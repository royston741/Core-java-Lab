/*
	Program: Palindrone number checker
	@author: Royston
	@Date  : 18 August 
*/

// Declaring a class named PalindroneNumberChecker
class PalindroneNumberChecker
{	
	// Creating a method checkIfPalindrone
	static void checkIfPalindrone(int orignalNumber){
		
		// storing the orignalNumber into num variable.
		int num=orignalNumber;
		
		// Storing the reversed number 
		int reversedNum=0;
		
		// while the num is not equal to 0
		while(num!=0){
			// storing remainder by dividing number by 10
			int remainder=num%10;
			reversedNum=reversedNum*10+remainder;
			num/=10;
		}
		
		// check if palodrine
		if(orignalNumber==reversedNum){
			System.out.println("It is a palodrine number.");
		}else{
			System.out.println("It is not a palodrine number.");
		}
		
	}
	
	// Calling the main method
	public static void main(String args[])
	{				
		// calling the method checkIfPalindrone
		checkIfPalindrone(Integer.parseInt(args[0]));
	}
}