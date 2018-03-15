/*
  Hai Nguyen
  CoSci290
  Lab9
*/
import java.util.Scanner;
public class Lab9
{//start of class
  public static void main(String[] args)
  {//start of main method
    // Create a Scanner
    Scanner input = new Scanner(System.in);

     // Prompt the user to enter some integers
    System.out.print("Enter some integers: ");
    int n = input.nextInt(); //allows users to input
    System.out.println("Your numbers is: " + n);
    System.out.println(isPalindrome(n));//printing true of false statement
    System.out.println("The reverse is: ");
    System.out.println(reverse(n));//printing what is inside the reverse array
    
  }//end main method
  public static int reverse(int n)
  {//start of reverse method
    int pop, num; //declareing variables
    //initialzing the variables
    pop = 0;
    num = n;

    do
    {//beginning of do while loop
      pop = num % 10;
      num = num / 10;
      System.out.print(pop);
     
    }while(num / 10 > 0);//end of do while loop
    return num;
    
  }//end of reverse method
  public static boolean isPalindrome(int n)
  {
    int m = reverse(n);
    if(m != n)
    {
      System.out.println(n + " is not Palindrome.");
    }
    else
    {
      System.out.println(n + " is a Palindrome.");
    }
    return true;
  }
}//end of class