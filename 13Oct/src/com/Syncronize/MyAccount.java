/*
 	Program : Create a Account and perform synchronized withdrawal in it using Threads	
 	@Author : Royston
 	@Date : 13 Oct
 */

package com.Syncronize;

// create myAccount class
public class MyAccount implements Runnable {
	// create new account
	Account acc = new Account();

	// create a synchronized withdraw method
	synchronized public void withdraw() {
		// if balance greater than 500
		if (acc.getBalance() > 500) {
			// print details
			System.out.println("The withdraw money is " + acc.withdrawMoney(100));
			System.out.println("The account balance is " + acc.getBalance());
		}
	}

	@Override
	public void run() {
		try {
			// thread sleeps for 500 mili sec
			Thread.sleep(500);
			// withdraw
			withdraw();
		}
		// if exception
		catch (Exception e) {
			// print exception
			System.out.println(e);
		}
	}

	// call main method
	public static void main(String[] args) {
		// create my account object
		MyAccount a1 = new MyAccount();
		// two threads
		Thread t1 = new Thread(a1, "Roy");
		Thread t2 = new Thread(a1, "Toy");
		// run the threads
		t1.run();
		t2.run();
	}

}
