/*
	Program: . Write a java program to print the tagline of any 5 companies (Enahnced switch case).
	@author: Royston
	@Date  : 15 September 
*/

// import scanner class
import java.util.Scanner;

// import all methods from System class
import static java.lang.System.*;

// Declaring a class named TaglineDemo
class TagLineDemo
{	
	// Creating a method printTaglineOf
	static void printTaglineOf()
	{	// Creating a new Scanner object	
		Scanner sc=new Scanner(System.in);
		
		// taking input and converting into lowercase
		out.print("Enter brand name : ");
		String brand=sc.next().toLowerCase();	
		
		// Switch case start 
		switch(brand){
			// if the case is nike 
			case "nike" ->out.println("Nike ---> \"Just do it\"."); 
			// if the case is adidas 
			case "adidas" ->out.println("Adidas ---> \"Impossible is nothing\".");
			// if the case is puma 
			case "puma" ->out.println("Puma ---> \"forever faster is first ,never second, never third\"."); 
			// if the case is nivia 
			case "nivia" ->out.println("Nivia ---> \"Step out and play\"."); 
			// if the case is hrx
			case "hrx" ->System.out.println("HRX ---> \"Keep going\"."); 
			// if the case is not found
			default ->out.println("We don't have such a brand."); 
		
		// Switch case end
		}
		
		
	}
	
	// Calling the main method
	public static void main(String...args)
	{	
		// Calling printTaglineOf method
		printTaglineOf();			
		
	}
}