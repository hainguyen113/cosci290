/*
  Hai Nguyen
  CoSci group 2
  
  Lab 6
  
  built in string functions
    str.length()
    str.toLowerCase() - makes all letters lowercase
    str.toUpperCase() - makes all letter uppercase
    str.equals("some other string") - checks if two strings are exactly the same
    str.equalsIgnoreCase("no) - checks if two strings are equal regardless of case
    str.charAt(int index) - gete ta specific character at index
    str.substring(int start index, int endindex) - give a subset string based on given range
*/

public class Logic1
{
  public static void main(String[] args)
  {
  
    String str = "Java Rules!";
    int num = 10;
    
    for(int index = 0; index < str.length(); index++)
    {//for goes throught the iterations of strings 
    //first iteration - index = 0 -> "J" index updates to 1
    //2nd iteration - index = 1 -> "a" index updates to 2nd
      //System.out.println(str.charAt(index));
      if(index % 2 == 0)
      {
        System.out.println(str.charAt(index));
        System.out.println("this number is even!");
      }
      else
      {
        System.out.println(str.charAt(index));
        System.out.println("this is an odd number");
    }
     
    }//end of loop
    System.out.println(str.substring(0,4));//outputs java
  }//end of method
}//end of class