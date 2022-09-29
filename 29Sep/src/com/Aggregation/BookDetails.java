/*
  Program : Aggregation class book details
  @Author : Royston
  @Date : 29Sep	
*/

package com.Aggregation;

// Create class BookDetails
public class BookDetails {
	// call main methhod
	public static void main(String... args) {
		// create new book object
		Book b1 = new Book("Time", 100, new Author("Jhack Mark", 55));
		// print book details
		System.out.println(b1);
	}
}
