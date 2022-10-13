/*
 	Program : Create a Account and perform synchronized withdrawal in it using Threads	
 	@Author : Royston
 	@Date : 13 Oct
 */

package com.Syncronize;

// Create Account class
public class Account {
	// balance
	private int balance = 1000;

	// get balance method
	public int getBalance() {
		return this.balance;
	}

	// withdraw money method
	public int withdrawMoney(int withdrawAmt) {
		// decrease the balance
		this.balance = this.balance - withdrawAmt;
		// return withdrawn ammount
		return withdrawAmt;
	}

}
