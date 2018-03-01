/*
  Hai Nguyen
  CoSci 290
  
  Demo on the String Class
 */

 import java.util.Scanner; //used for user inputs
 public class TestStrings
 {
  
   //main method
  public static void main(String[] args)
  {
    
    //instantiate the scanner object
    Scanner input = new Scanner(System.in);
   
    /*
      impose some rules on user input
      name.length() - gives a int  of how many characters the String is long
    */
    int nameLegnth = 0;
    String answer = "";
    boolean flag = false;
    
    /*
      using pseudocode write your logic 
      while the user gives a name that is less that 2 characters
        check if inputs has less then 2 charaters and keep prompting 
        else{
          the input is greater than 1 characters
          now check if each character is a letters
          
          for each character in input{
          check if each char is not a letter
            get out of loop
          }
        }
    */
    
    while(nameLegnth < 2)
    {
        System.out.println("What is your name?");
    
        String answer = input.next();
    
        if(answer.length() < 2)
        {
          System.out.println("Please enter in a name that is at least two letters long.");
        }
        else{//name is at least 2 characters
          //check if name containts letters
          
          //for example, go through each letter in the name "Logan"
          //name.charAt(0) to look at the character in index 0
          
          //use a for-loop because we know how mnay letter it has
          for(int index = 0; index < answer.length(); index++)
          {
            // check if the character is a letter
            //if(name.charat(index); )
            for(!Character.isLetter(answer.charAt(index)))
            {//if not a letter
              flag = true;
              //break; //gets you out of the loop
            }
          }
         
        }
      
      nameLegnth = answer.length();
      }//end of while loop
      
    System.out.println("Hello");
    
    
    /*
      when you want code to run at least one use do-while loop
      i.e.
      
      do{
      
      }while("some condition")
      
    */
    
    //**********************************************************************************
    //1answer = answer.toLowerCase();
    
    //if(answer.equals("No")){// "no" != "No"
    //1if(answer.equals("no"))({//this witht he toLowercase(); 
    
    /*
      answer.toLowerCase() - makes all letters lowercase
      answer.toUpperCase() - makes all letter uppercase
      answer.equals("some other string") - checks if two Strings are exactly the same
      answer.equalsIgnoreCase("some other string") - ignores case sensitive 
    */
   /* 
      //asks the user a question
    System.out.println("Are you rich? Yes or No?");
    
    //get answer from console
    answer = input.next();
    
    if(answer.equalsIgnoreCase("no"))
    {
      System.out.println("That sucks!");
    }
    else
    {
      System.out.println("Cool!");
    }
    */
  }
}