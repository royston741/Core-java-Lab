/*
  Program : Aggregation class Book
  @Author : Royston
  @Date : 29Sep	
*/

package com.Aggregation;

// Create Book class
public class Book {
	// properties of book
	private String bookName;
	private int bookPrice;
	private Author bookAuthor;

	// no arguments constructor
	public Book() {
		super();
		System.out.println("---- no argument constructor of book -----");
	}

	// parameterized constructor
	public Book(String bookName, int bookPrice, Author bookAuthor) {
		super();
		System.out.println("---- parameterized constructor of book -----");
		// initialize variables
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
	}

	// getter for bookname
	public String getBookName() {
		// return book name
		return bookName;
	}

	// setter for book name
	public void setBookName(String bookName) {
		// initialize book name
		this.bookName = bookName;
	}

	// getter for price
	public int getBookPrice() {
		// return price
		return bookPrice;
	}

	// setter for price
	public void setBookPrice(int bookPrice) {
		// initialize price
		this.bookPrice = bookPrice;
	}

	// getter for author
	public Author getBookAuthor() {
		// return author
		return bookAuthor;
	}

	// setter for author
	public void setBookAuthor(Author bookAuthor) {
		// initialize author
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookAuthor=" + bookAuthor + "]";
	}

}
