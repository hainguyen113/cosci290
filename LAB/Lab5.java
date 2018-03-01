/*
  Hai Nguyen
  CoSci 290
  
  fix the logic and make this lab work
  ask for user name
  ask for more then 2 characters
  say can not have numbers
  
*/

import java.util.Scanner;
public class Lab5
{

  public static void main(String[] args)
  {
    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    int nameLength = 0;
    String answer = "";
    boolean flag = false; //flag is optional
    
    //example of a while loop
    while(nameLength < 2)
    {
      
      System.out.println("What is your name?");
    
      //get answer from console
      answer = input.next();
      
      //check if name is less than 2 characters
      if(answer.length() < 2)
      {
      System.out.println("Please enter in a name that is at least "
                        + "two letters long and no numbers");
        
      }
      else
      { //name is at least 2 characters
        
        //check if name contains letter
        
        //use a for-loop because we know how many letters it has
        for(int index = 0; index < answer.length(); index++)
        {
          
          //System.out.println(answer.charAt(index));
          
          //check if the character is a letter or number
          if(!Character.isLetter(answer.charAt(index)))
          { //if it's not a letter
                   
          
          }    //break; //gets out of current loop
        
        }//end of for-loop
        //nameLength = answer.length();
      
      
      
     } //end while loop
    } //end of main method
  }//end of class
}