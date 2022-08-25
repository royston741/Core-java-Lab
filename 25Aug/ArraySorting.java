/*
	Program: Java progam to find the largest and second largest number in an array .
	@author: Royston
	@Date  : 25 August 
*/

// import all the methods from System class
import static java.lang.System.*;

// Creating a class named ArraySorting
class ArraySorting{
	
	// Creating printLargestAndSecondLargestOf method
	static void printLargestAndSecondLargestOf(String...arr){
		// Storing the size of arr 
		int size=arr.length;
		// Creating a new array
		int newArr []=new int[size];

		// converting all the elements of arr into type int from type string and storing it into newArr
		for(int i=0;i<size;i++){
			newArr[i]=Integer.parseInt(arr[i]);	
		}
		
		// Printing the provided array 
		out.print("The provided array is :");
		for(int i:newArr){
			out.print(i+" ");
		}
		
		// calling sortArray and passing newArr as argument
		sortArray(newArr);

	}

	// Creating a class named printPattern
	static void sortArray(int...arr){
		
		// first taking i element
		for(int i=0;i<arr.length;i++){
			// comparing i element with all the element in the array
			for(int j=i;j<arr.length;j++){
				// if i element is greater than j swap their position 
				if(arr[i]>arr[j]){
					//Swapping
					
					// a=a+b  a=10+5 i.e a=15
					arr[i]+=arr[j];
					// b=a-b  b=15-5 1.e. b=10
					arr[j]=arr[i]-arr[j];
					// a=a-b  a=15-10 i.e a=5
					arr[i]-=arr[j];
				}  // closing the if check
				
			} //closing the j loop
			
		} // clossing the i loop

		// next line 
		out.println();
		// Printing the largest and second largest namber		
		out.println("The second largest number is : "+ arr[arr.length-2]);	
		out.println("The largest number is : "+ arr[arr.length-1]);
		
	}

	// calling main method
	public static void main(String...args){
		// take input from the command line argument
		
		// calling printLargestAndSecondLargestOf method and passing args as argument 
		printLargestAndSecondLargestOf(args);
	}
}