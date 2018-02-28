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
    boolean flag = true; //flag is optional
    
    //example of a while loop
    while(nameLength < 2)
    {
      
      System.out.println("What is your name?");
    
      //get answer from console
      answer = input.next();
      while(flag)
      { 
        
        //check if name contains letter
      
        //use a for-loop because we know how many letters it has
        for(int index = 0; index < answer.length(); index++)
        {
          
          System.out.println(answer.charAt(index));
          
          //check if the character is a letter or number
          if(!Character.isLetter(answer.charAt(index)))
          { //if it's not a letter
            flag = true;
            System.out.println("Please enter in a name that is at least "
                  + "two letters long and no numbers.");
            answer = input.next();
            break; //gets out of current loop
            
          }
          else
          {
            flag = false;
          }
         }
       }//end of for-loop
      //check if name is less than 2 letters
      if(answer.length() < 2)
      {
      System.out.println("Please enter in a name that is at least "
                        + "two letters");
               
        //nameLength = answer.length();
      }
      
      nameLength = answer.length();
      
      if(answer.length() >= 2 && !flag){
        break;
      }
        
    } //end while loop
  } //end of main method
} //end of class