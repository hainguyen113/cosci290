/*
  Hai Nguyen
  CoSci 290
  
  Topics: 
    Functions/methods - what all the different parts are
      - access modifier
      - return type
      - function name
      - perameters (optionl)
*/
//class container
public class TestFunctions
{
  //main method. entry point of application
  //public is an access modifier
  //function signiture
  public static void main(String[] args)
  {
    /*
      acess modifiers -  i.e. public
      1. public - anything can see/access
      2. private - only functions withing a class can access
      3. default - same things as no written/delared modifiers
      
      functions are like a group of codes or modual that does somthing
      
      return types - void
      - int
      - double
      - String
      - Char
      - boolean
      - can return different objects types
      - void doesnt return anything
      
      function names - main
      - follows the same rules as any identifier
      - use the name of the fuction to call it
      
      function parameters - (xxxxx) i.e. (String[] args)
      - String is the datatype and args is the 
      - inputs the fuction used inside somewhere in the fuction body
      _ saparate multiple parameters with commas
      
   */
    
    //testing custom functions called findSum()
    System.out.println("The sum of 2 and 3 is: " + findSum(2, 3));
    
    //test pringHello()
    printHello(" Henry");
    
   }
  //this function finds the sum of two given numbers
   public static int findSum(int num1, int num2)
   {
    // datatype int variable sum assignment operator = expression num1 + num2
    int sum = num1 + num2;
    return sum;
   }
  public static void printHello(String name)
  {
    System.out.println("Hello" + name);
  }
}