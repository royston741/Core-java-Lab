/*
	Program : Write a Java program to print the duplicate entries , Sort the array and 
			  then remove the duplicate entry.
	@Author : Royston
	@date : 22 September			  
*/

// import Scanner class
import java.util.Scanner;

// import all the methods from System
import static java.lang.System.*;

// importing array 
import java.util.Arrays;

// Creating a class named ArrayOperations
class ArrayOperations{
	// array variable
	static int[] myArr;
	
	// Creating takeInput method
	static void takeInput(){
		// Creating a scanner object
		Scanner sc=new Scanner(System.in);
		
		// Taking the size as input
		out.print("Enter the size of the array : ");
		int size=sc.nextInt();
		//setting the size of the array 
		myArr=new int[size];
		
		// taking the element as input
		for(int i=0;i<myArr.length;i++){
			out.print("Enter the "+i+" element : ");
			int el=sc.nextInt();
			// setting the element i.e. el at position i 
			myArr[i]=el;	
		}
		
	}
	
	// Creating printArray method
	static void printArray(int...arr){
		// printing the array elements
		out.print("[ ");
		for(int i=0;i<arr.length;i++){
			out.print(+arr[i]+" ");
		}
		out.print("] ");
	}
	
	// Creating printDuplicateElements method
	static void printDuplicateElements(){
		// for loop for selecting one element 
		for(int i=0;i<myArr.length;i++){
			// for loop for comparing the lement 
			for(int j=i+1;j<myArr.length;j++){
				// if element is duplicate than print it
				if(myArr[i]==myArr[j]){
					out.print(myArr[i]+" ");
					// come out of the inner loop 
					break;
				}
			}
		}
	}
	
	// Creating removeDuplicateElements method
	static void removeDuplicateElements(){
		// Sorting the array 
		Arrays.sort(myArr);
		
		int[] newArr =new int[myArr.length];
		// looping the first loop 
		for(int i=0;i<myArr.length;i++){
			// looping the second loop 
			for(int j=i+1;j<myArr.length;j++){
				// if the element at i is equal to element at j 
				if(myArr[i]!=myArr[j]){
				/*	
					//then swap their position 
					int temp=myArr[j+1];
					myArr[j+1]=myArr[j];
					myArr[j]=temp;
				*/
					// adding the element in new arr
					newArr[j]=myArr[j];
				}
			}
		}
		// clone the newArr
		myArr=newArr.clone();
		// print the new array
		out.print("The new array is : ");
		printArray(myArr);
	}
	
	// Calling main method
	public static void main(String...args){
		// calling taje input method
		takeInput();
		// priring the orignal array 
		out.print("The orignal array is : ");
		printArray(myArr);
		// next line
		out.println();
		// printing duplicate values 
		out.print("The duplicate values : ");
		printDuplicateElements();
		// next line
		out.println();
		//calling duplicate values
		removeDuplicateElements();
	}
	
}
