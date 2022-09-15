/*
	Program : Java progam to find whether the character entered is vowel 
			  ,consonant ,number and special character.
	@author : Royston
	@date : 15 September
*/

// import scanner class
import java.util.Scanner;

// import all methods from System class
import static java.lang.System.*;

// Creating a class named CharacterCheck
class CharacterCheck
{
	// Creating a method named checkTheCharacter
	static void checkTheCharacter()
	{	// Creating a new Scanner object	
		Scanner sc=new Scanner(System.in);
		
		// Taking input
		out.print("Value : ");
		char value= sc.next().charAt(0);
		
		// if upper case letter
		if((value>=65)&&(value<=90)){
			out.println("It is a capital (upper case) letter.");
			// if vowel
			if((value=='A')||(value=='E')||(value=='I')||(value=='O')||(value=='U')){
				// print it is a vowel
				out.println("It is a vowel.");
			}
			// if consonant
			else{
				// print it is a consonant
				out.println("It is a consonant");
			}
		}
		// if lower case letter
		else if((value>=97)&&(value<=122)){
			out.println("It is a small (lower case) letter.");
			// if vowel
			if((value=='a')||(value=='e')||(value=='i')||(value=='o')||(value=='u')){
				// print it is a vowel
				out.println("It is a vowel.");
			}
			// if consonant
			else{
				// print it is a consonant
				out.println("It is a consonant");
			}
		}
		//if number
		else if((value>=48)&&(value<=58)){
			// print it is a number
			out.println("It is a number.");
		}
		// if special character
		else{
			// print it is a special character
			out.println("It is a special character.");
		}
		
	}// method ends
	
	// calling main method
	public static void main(String...args)
	{
		// calling checkTheCharacter method
		checkTheCharacter();
	}
}