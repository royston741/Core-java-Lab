/*
	Program : Write a program to remove duplicate entry from array
	@author: Royston
	@date  : 25 August 	
*/

// import all the methods from System class
import static java.lang.System.*;

// Creating a class named ArrayDuplicate
class ArrayDuplicate{

	// Creating a class named removeDuplicate
	static void removeDuplicate(String...arr){
		// storing the size of arr 
		int size=arr.length;
		// Creating a new array
		int newArr []=new int[size];
		
		// converting all the elements of arr and storing it into a new array  
		for(int i=0;i<size;i++){
			newArr[i]=Integer.parseInt(arr[i]);
		}
		
		// taking i element
		for(int i=0;i<size;i++){
			// comparing the i element with j elements
			for(int j=0;j<size;j++){
				// if i element is same as j 
				if(newArr[i]==newArr[j]){
					newArr[j]=0;
				} // end if check
			}
		}
		
		// printing the array 
		for(int i:newArr){
			out.print(i+" ");
		}
		
	}

	// calling main method
	public static void main(String...args){
		
		// calling removeDuplicate method and passing the command line arguments
		removeDuplicate(args);
	}
}