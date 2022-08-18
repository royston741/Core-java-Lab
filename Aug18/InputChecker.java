/*
	Program: Check the input is vowel,consonant,number or special 
			 character and print its ascii value .	
	@author: Royston
	@Date  : 18 August 
*/

// Declaring a class named InputChecker
class InputChecker
{	
	// Creating the checkInput method
	static void checkInput(int value){
		
		char convertedValue=(char)(value);
		
		// if value is a special character
		if(
		(convertedValue=='!')||(convertedValue=='@')||(convertedValue=='#')
		||(convertedValue=='$')||(convertedValue=='%')||(convertedValue=='^')
		||(convertedValue=='&')||(convertedValue=='*')||(convertedValue=='(')
		||(convertedValue==')')){
			System.out.println("The value is a special character.It's asci value is : "+ value);
		}
		// if value is a vowel
		else if((convertedValue=='a')||(convertedValue=='e')||(convertedValue=='i')
		||(convertedValue=='o')||(convertedValue=='u')){
			System.out.println("The value is a vowel.It's asci value is :"+value);
		}
		// If the value is consonant 
		else if((value>='A')||(value<='Z')){
			System.out.println("The value is a consonant.It's asci value is : "+ value);			
		}
		// if value is a number
		else if((value>=0)|| value<=0){
			System.out.println("The value is number.");
		}
		
			
	}
	
	
	// Calling the main method
	public static void main(String args[])
	{	
		// calling the checkInput method			
		checkInput('a');
	}
}