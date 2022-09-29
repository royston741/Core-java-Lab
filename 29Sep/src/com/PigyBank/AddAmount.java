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

// create AddAmount class
public class AddAmount {
	// properties of AddAmount
	private double amount = 50;

	// no argument constructor
	public AddAmount() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public AddAmount(double amount) {
		super();
		// increment amount
		this.amount += amount;
	}

	// getter for amount
	public double getAmount() {
		// return amount
		return amount;
	}

	// setter for amount
	public void setAmount(double amount) {
		// initialize amount
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "AddAmount [amount=" + amount + "$ ]";
	}

}
