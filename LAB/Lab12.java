/*
	Hai Nguyen
  CoSci 290
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	Sample output with odd number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	3
	The number 3 is odd...
	Sample output with even number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	2
	The number 2 is even...
	
	Note:
	Preserve the indentation of the code. 
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/
// allows you to use Scanner option
import java.util.Scanner;// missing Scanner utility
public class Lab12// said Lab2
{// start of class
	public static void main(String[] args)
  {// start of method main
    //this activates the scanner option
	  Scanner input = new Scanner(System.in);// lowercase system
    
    // declare variable num
	  int num; // not char
    
    //prints out and tells what this program is going to do
	  System.out.println("This program will check if a number"// missing beggining "
  	+ " is even or odd...");//missing ending "
    
    // prompts user to enter a whole number
	  System.out.println("Please enter in a whole number...");// missing ;
    
    // allows user to enter the number
	  num = input.nextInt();// not char 
    
    // prints out the returned value for checkNums function
	  System.out.println(checkNums(num));
	}// end of main method

  // checkNums function to see if you entered an odd or even number
	public static int checkNums(int num)
  {// start of checkNums method
    
    // if loop for checking if number is even
    if(num % 2 == 0)
    {
      // oops...  still need to implement
      // if statement true will print out this line
      System.out.println("This number " + num + " is even.");
    }
    // else statement will execute if  the if statment is flase
    else
    {
      // prints out this line if the if statement is false
      System.out.println("This number " + num + " is odd.");
    }
    // returns the num value when funciton is called
    return num;
  }// end of checkNums method
}// end of class