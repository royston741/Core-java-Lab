/*
	Program: Print tag line of a brand
	@author: Royston
	@Date  : 18 August 
*/

// Declaring a class named TaglinePrinter
class TagLinePrinter
{	
	// Creating a method PrintTaglineOf
	static void printTaglineOf(String brand){
		
		// Switch case start 
		switch(brand){
			
			// if the case is nike 
			case "nike" ->System.out.println("Nike ---> \"Just do it\" ."); 
			// if the case is adidas 
			case "adidas" ->System.out.println("Adidas ---> \"Impossible is nothing\" .");
			// if the case is puma 
			case "puma" ->System.out.println("Puma ---> \"forever faster is first ,never second, never third\" ."); 
			// if the case is nivia 
			case "nivia" ->System.out.println("Nivia ---> \"Step out and play\" ."); 
			// if the case is hrx
			case "hrx" ->System.out.println("HRX ---> \"Keep going\" ."); 
			// if the case is not found
			default ->System.out.println("We don't have such a brand ."); 
		
		// Switch case end
		}
		
		
	}
	
	// Calling the main method
	public static void main(String args[])
	{	
		String brandName=args[0];
		// Calling the tag line printer method
		printTaglineOf(brandName.toLowerCase());			
		
	}
}