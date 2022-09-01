/*
	Program : Write a program that reads a set of integers, and then prints the sum 
			  of the even and odd integers.(using arrays)  
	@author : Royston
	@date : 1 September	
*/

// import all the methods from system class 
import static java.lang.System.*;

// Creating a class named Integer Array
class IntegerArray{
	
	// Creating a method to add even numbers and odd numbers in an array
	static void getAdditionOfOddAndEvenNum(String...arr){
		// creating oddNum variable for storing the sum of odd variables
		int oddNum=0;
		// creating evebNum variable for storing the sum of even variables
		int evenNum=0;
		
		// Traversing the array
		for(String i:arr){
			// converting the value of arr into integer from String and storing into integerElement variable
			int integerElement=Integer.parseInt(i);
			
			// if even
			if(integerElement%2==0){
				// add integerElement into eveNum
				evenNum+=integerElement;
			}
			//if odd 
			else{
				// add integerElement into oddNum
				oddNum+=integerElement;
			}
		} // for loop ends
		
		// print the array 
		out.print("Thre array is : ");
		for(String i:arr){
			out.print(i+" ");
		}
		out.println();
		
		// print the sum of odd and even numbers in an array
		out.println("The sum of even numbers from the array is : "+evenNum);
		out.println("The sum of odd numbers from the array is : "+oddNum);
		
	} 

	// calling main method
	public static void main(String...args)
	{	
		// calling getAdditionOfOddAndEvenNum method and passing args as argument 
		getAdditionOfOddAndEvenNum(args);
	}	
}