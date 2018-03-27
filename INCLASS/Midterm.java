/*
  Hai Nguyen
  CoSci290
  3/27/18
  remember to comment in randomNum for numbers over 10
*/

import java.util.Scanner;
public class Midterm
{
  public static void main(String[] args)
  {
   String str1, str2;
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter a number.");
   System.out.print("> ");
   int n = input.nextInt();
   System.out.println("");
   printMatix(n);
   System.out.println("");
   printMatix(n);
  }
  public static void printMatix(int n)
  {
   for(int i = n; i > 0; i--)
   {
     for(int row = n ; row > 0; row--)
     {
       //int randomNum = 0 + (int)(Math.random() * 2);
       int randomNum = 0 + (int)(Math.random() * 11);
       System.out.print(randomNum + " ");
     }
     System.out.println(" ");
   }
  }
    
}
/* figure out how to save it as a string...
import java.util.Scanner;
public class Midterm
{
  public static void main(String[] args)
  {
   String str1, str2, n;
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter a number.");
   n = input.next();
   //int n = Integer.parseInt(intValue);
   printMatix(n);
   System.out.println("");

  // printMatix(n);
   //System.out.println(n);
  }
  public static void printMatix(String n)
  {
   int intValue = Integer.parseInt(n);
   for(int i = intValue; i > 0; i--)
   {
     for(int row = intValue ; row > 0; row--)
     {
       int randomNum = 0 + (int)(Math.random() * 2);
       //int randomNum = 0 + (int)(Math.random() * 11);
       String s = randomNum + "";
       System.out.print(s + " ");
       for(i = 0; i < s.length(); i++)
   {
     System.out.println("i = " + i + ", Letter parsed: " + s.charAt(i));
   }
     }
     System.out.println(" ");
   }
  }
}*/