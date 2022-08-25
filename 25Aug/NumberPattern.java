/*
	Program : Java program to print follwing pattern 		
		  1		
		  12		
		  123		
		  1234		
        	  12345
	@author: Royston
	@date  : 25 August 	
*/

// import all the methods from System class
import static java.lang.System.*;

// Creating a class named NumberPattern
class NumberPattern{

	// Creating a class named printPattern
	static void printPattern(){
		
		//Printing the rows 
		for(int i=1;i<=5;i++){
			// Printing the columns
			for(int j=1;j<=i;j++){
				// Printing the numbers
				out.print(j);
			}
			// next line
			out.println();
		} //Loop ends
		
	}

	// calling main method
	public static void main(String...args){
		// calling printPattern method
		printPattern();
	}
}
