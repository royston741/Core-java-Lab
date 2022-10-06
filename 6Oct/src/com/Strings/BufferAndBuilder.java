/*
 	Program : Compare string builder and string Buffer using performance test		
 	@Author : Royston
 	@date : 6 Oct
 */

package com.Strings;

import java.util.Scanner;

// creating BufferAndBuilder  class
public class BufferAndBuilder {

	// creating checkStringBufferTime method
	public static long checkStringBufferTime(String str) {
		// storing current time
		long currTime = System.currentTimeMillis();
		// Creating stringBuffer object
		StringBuffer sbf = new StringBuffer(str);
		// appending sbf
		for (int i = 0; i < 100000; i++) {
			sbf.append("b");
		}
		// return the time
		return System.currentTimeMillis() - currTime;
	}

	// creating checkStringBuilderTime method
	public static long checkStringBuilderTime(String str) {
		// storing current time
		long currTime = System.currentTimeMillis();
		// Creating stringBuilder object
		StringBuilder sbl = new StringBuilder(str);
		// appending sbl
		for (int i = 0; i < 100000; i++) {
			sbl.append("b");
		}
		// return the time
		return System.currentTimeMillis() - currTime;
	}

	// create check performance method
	public static void checkPerformance(String str) {
		// Storing StringBuffer time
		long sbf = checkStringBufferTime(str);
		// Storing StringBuilder time
		long sbl = checkStringBuilderTime(str);

		// printing time taken
		System.out.println("String buffer time is : " + sbf + " mili sec");
		System.out.println("String builder time is : " + sbl + " mili sec");

		// if string buffer is faster
		if (sbf > sbl) {
			System.out.println("String buffer is faster");
		}
		// if string builder is faster
		else {
			System.out.println("String builder is faster");
		}
	}

	// calling main method
	public static void main(String[] args) {
		// Creating new scanner object
		Scanner sc = new Scanner(System.in);
		// taking string input and calling checkPerformance method
		System.out.println("Enter the string :");
		checkPerformance(sc.next());
	}
}
