/*
 	Program : Create a Thread using Lambda .	
 	@Author : Royston
 	@Date : 13 Oct
*/

package com.Thread;

// Create LambdaTest class
public class LambdaTest extends Thread {
	// no argument constructor
	LambdaTest() {
	}

	// parameterized constructor
	LambdaTest(String thread) {
		super(thread);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	// call main method
	public static void main(String[] args) {
		// lambda method
		LamdaFunc d1 = () -> {
			LambdaTest t1 = new LambdaTest("Thread1");
			t1.run();
		};
		// call lambda method
		d1.createThread();

	}
}
