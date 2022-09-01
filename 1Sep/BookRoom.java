/*
	Program : Write a program to create a room class,the attributes of this class is roomNo,
		  roomtype, roomarea and ACmachine. In this class the member functions are
		  setdata and displaydata.
	@author : Royston
	@date : 1 September	
*/

// import all the methods from system class 
import static java.lang.System.*;

// Creating a Room class 
class Room{
	// instance variables  
	private int roomNo;
	private String roomType;
	private int roomArea;
	private boolean acMachine;
	
	// Creating setdata method
	void setdata(int roomNo,String roomType,int roomArea,boolean acMachine){
		// initializing the variables
		this.roomNo=roomNo;
		this.roomType=roomType;
		this.roomArea=roomArea;
		this.acMachine=acMachine;
	}
	
	// Creating getdata method
	void getdata(){
		// printing room details 
		out.println("Room no. : "+roomNo);
		out.println("Room type : "+roomType);
		out.println("Room area : "+roomArea+" Sqr feet");
		out.println("Ac : "+ (acMachine?"Ac room":"Non ac room"));
	}
}

// Creating BookRoom class
class BookRoom
{
	// Calling the main method 
	public static void main(String...args){
		// Creating a new object c1
		Room c1=new Room();
		// setting the data of c1 
		c1.setdata(101,"Duplex",300,true);
		// getting the data of c1
		c1.getdata();
	
		// Gap
		out.println();
		
		// Creating a new object c2
		Room c2=new Room();
		// setting the data of c2
		c2.setdata(201,"Single",200,false);
		// getting the data of c2 
		c2.getdata();
	}
}
