/*
  Hai Nguyen
  CoSci290
*/
import java.util.Scanner;
public class TestStringMethod{
  
  //main method
  public static void main(String[] args){
    
  //hardcode a random string  
  String str = "123abc!45"; // "cat", "!", "Hi, there!"
  Scanner input = new Scanner(System.in);
  str = input.next();
 
  //one way to go through each character in a string
  /*char character1 = str.charAt(0);
  char character2 = str.charAt(1);
  char character3 = str.charAt(2);
  char character4 = str.charAt(3);
  //... kept going on until the end of the string
    
  //print out the characters that was parsed out with charAt(index)
  System.out.println("List of characters parsed: (1) - " + character1
                    + " (2) - " + character2 + " (3) - " + character3
                    + " (4) - " + character4);
  */  
  //why do it the way above, if you had 1000 characters to look at?
  //why not use a for-loop?
  for(int i = 0; i < str.length(); i++)
  {
    
   
    //just print out the parsed character
   // System.out.println("i = " + i + ", Letter parsed: " + str.charAt(i));
    
    //How do I check if a character is a number?
    
    if(Character.isDigit(str.charAt(i)))
    {
      System.out.println("This is a digit! " + str.charAt(i));
      int positive += str.charAt(i);
    }
    else
    {
      System.out.println("This is not a digit! " + str.charAt(i));
    }
  
  }
  }//end main method
  
}//end class