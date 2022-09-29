/*
  Program : Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it.
   			Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50.
   			 Now make two constructors of this class as follows:
			1 - without any parameter - no amount will be added to the Piggie Bank                
			2 - having a parameter which is the amount that will be added to the Piggie Bank                
				Create an object of the 'AddAmount' class and display the final amo
  @Author : Royston
  @Date : 29Sep	
 */

package com.PigyBank;

// creating PigyBank class
public class PigyBank {

	// calling main method
	public static void main(String[] args) {
		// object with no input
		AddAmount a1 = new AddAmount();
		// print a1
		System.out.println("Empty counstructor : ");
		System.out.println(a1);

		// object with input
		AddAmount a2 = new AddAmount(10);
		// print a2
		System.out.println("Argument counstructor : ");
		System.out.println(a2);
	}

}
