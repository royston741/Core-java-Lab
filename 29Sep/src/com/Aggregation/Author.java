/*
  Program : Aggregation class Author
  @Author : Royston
  @Date : 29Sep	
*/

package com.Aggregation;

// creating Author class
public class Author {
	// properties of author
	private String authorName;
	private int authorAge;

	// no arguments constructor
	public Author() {
		super();
		System.out.println("---- no argument constructor of author -----");
	}

	// parameterised constructor
	public Author(String authorName, int authorAge) {
		super();
		System.out.println("---- parameterized constructor of author -----");
		// initialize variables
		this.authorName = authorName;
		this.authorAge = authorAge;
	}

	// getter for authorName
	public String getAuthorName() {
		// return authorName
		return authorName;
	}

	// setter for authorName
	public void setAuthorName(String authorName) {
		// initialize author name
		this.authorName = authorName;
	}

	// getter for authorAge
	public int getauthorAge() {
		// return authorAge
		return authorAge;
	}

	// getter for authorAge
	public void setauthorAge(int authorAge) {
		// initialize authorAge
		this.authorAge = authorAge;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", authorAge=" + authorAge + "]";
	}

}
