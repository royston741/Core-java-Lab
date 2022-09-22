/*
	Program : Write a Student and create an array of 10 student and display the 
		  	  students whose marks are more than 90%.		
	@Author : Royston
	@date : 22 September			  
*/

// import Scanner class
import java.util.Scanner;

// import all the methods from System
import static java.lang.System.*;

// Creating a class named Student
class Student{
	// properties of a student 
	private int stdId;
	private String stdName;
	private float stdPercentage;
	
	// no argument constructor
	Student(){}
	
	// parameteried constructor
	Student(int stdId,String stdName,float stdPercentage){
		// initializing the values
		this.stdId=stdId;
		this.stdName=stdName;
		this.stdPercentage=stdPercentage;
	}
	
	// getter for stdId
	public int getStdId(){
		// return stdId
		return this.stdId;
	}
	
	// setter for stdId
	public void setStdId(int stdId){
		// initialize stdId
		this.stdId=stdId;
	}
	
	// getter for stdName
	public String getStdName(){
		// return stdName
		return this.stdName;
	}
	
	// setter for stdName
	public void setStdName(String setStdName){
		// initialize stdName
		this.stdName=setStdName;
	}
	
	// getter for stdPercentage
	public float getStdPercentage(){
		// initialize stdPercentage	
		return this.stdPercentage;
	}	
	
	// setter for stdPercentage
	public void setStdPercentage(float stdPercentage){
		// initialize stdPercentage
		this.stdPercentage=stdPercentage;
	}
}// Student class ends

//Creating School class
class School{
	// calling main method
	public static void main(String...args){
		// creating an array of 5 students 
		Student[] std=new Student[5];
		
		// Constructor injection assingning
		std[0]=new Student(1,"Roy",90);
		std[1]=new Student(2,"Sam",80);
		std[2]=new Student(3,"Tom",70);
		
		// getter setter injection
		std[3]=new Student();
		std[3].setStdId(44);
		std[3].setStdName("Harry");
		std[3].setStdPercentage(80);
		
		// getter setter injection
		std[4]=new Student();
		std[4].setStdId(5);
		std[4].setStdName("Ram");
		std[4].setStdPercentage(90);
		
		// looping in std array 
		for(int i=0;i<std.length;i++){
			// storing the percentage
			float per=std[i].getStdPercentage();
			// percentage greater than 90
			if(per>=90){		
				// print student details
				out.println("\n------------ STUDENT "+i+" DETAILS -----------");
				out.println("The student id is : "+std[i].getStdId());
				out.println("The student name is : "+std[i].getStdName());
				out.println("The student percentage is : "+std[i].getStdPercentage());
			}// if ends
			
		}// for ends
		
	}// main method ends
	
}// School class ends