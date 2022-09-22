/*
	Program : Write a  java program to create a BankAccount and display the
			  people with balance less than 1000.
	@Author : Royston
	@date : 22 September			  
*/

// import Scanner class
import java.util.Scanner;

// import all the methods from System
import static java.lang.System.*;

// Creating a class named Account
class Account{
	// properties of a account 
	private int accId;
	private String accHolderName;
	private double accBalance;
	
	// no argument constructor
	Account(){}
	
	// parameterized constructor
	Account(int accId,String accHolderName, double accBalance){
	//inttializing the variables
		this.accId=accId;
		this.accHolderName=accHolderName;
		this.accBalance=accBalance;
	}
	
	// getter for accId
	public int getAccId(){
		// returning accId 
		return accId;
	}
	
	// setter for accId
	public void setAccId(){
		// initiailize
		this.accId=accId;
	}
	
	// getter for accHolderName
	public String getAccHolderName(){
		// returning accHolderName 
		return accHolderName;
	}
	
	// setter for accHolderName
	public void setAccHoldername(){
		// initiailize accHolderName
		this.accHolderName=accHolderName;
	}
	
	// getter for accBalance
	public double getAccBalance(){
		// returning accBalance
		return accBalance;
	}
	
	// setter for accBalance
	public void setAccBalance(){
		// initiailize accBalance
		this.accBalance=accBalance;
	}
}// Account class ends	

// Creating Bank class
class Bank{
	// calling main method
	public static void main(String...args){
		// Creating an array of accounts
		Account bank1[]=new Account[10];
		
		// Constructor injection
		bank1[0]=new Account(1,"Roy",10000);
		bank1[1]=new Account(2,"Sam",20000);
		bank1[2]=new Account(3,"Tom",100);
		bank1[3]=new Account(4,"Jam",500);
		bank1[4]=new Account(5,"Ram",30000);
		bank1[5]=new Account(6,"Jack",70000);
		bank1[6]=new Account(7,"Dom",800);
		bank1[7]=new Account(8,"Som",4000);
		bank1[8]=new Account(9,"Jhon",1000);
		bank1[9]=new Account(10,"Tin",100000);
		
		// running the loop on bank1 array
		for(int i=0;i<bank1.length;i++){
			// storing the amount in variable
			double amount=bank1[i].getAccBalance();
			// if amount is less than 1000
			if(amount<1000){
				// print account details
				out.println("\n------- Account "+i+" Detsils -------");
				out.println("The account id is : "+bank1[i].getAccId());
				out.println("The account holder name is : "+bank1[i].getAccHolderName());
				out.println("The account balance is : "+bank1[i].getAccBalance());
			} // if ends 
			
		} // for loop ends
		
	} //main method ends 
	
}// Bank class ends  