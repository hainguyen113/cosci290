/*
  Hai Nguyen
  CoSci290
  3/27/18
  remember to comment in randomNum for numbers over 10
*/

import java.util.Scanner;
public class Midterm
{//start of class
  public static void main(String[] args)
  {//start of main
   //String str1, str2;
   Scanner input = new Scanner(System.in);//set up scanner
   System.out.println("Please enter a number.");//asks for number for matrix
   System.out.print("> ");
   int n = input.nextInt();//sets n as an int for input
   System.out.println("");// i wanted a line break so prints one
   printMatix(n);//prints out the first matrix
   System.out.println("");// another line break
   printMatix2(n);//prints out second matrix
  }//end of main method
  public static void printMatix(int n)
  {//start of printMatix method
   for(int i = n; i > 0; i--)
   {//for loop for the colums
     for(int row = n ; row > 0; row--)
     {//for loop for rows
       //int randomNum = 0 + (int)(Math.random() * 2);
       int randomNum = 0 + (int)(Math.random() * 11);
       System.out.print(randomNum + " ");
     }//end of loop for rows
     System.out.println(" ");
   }//end of loop for colums
  }//end of printMatix method
  public static void printMatix2(int n)
  {//start of printMatix2 method
   for(int i = n; i > 0; i--)
   {//start of loop for colums
     for(int row = n ; row > 0; row--)
     {//start of loops for rows
       //int randomNum = 0 + (int)(Math.random() * 2);
       int randomNum = 0 + (int)(Math.random() * 11);//random num gen for the matrix from 0 to 10
       System.out.print(randomNum + " ");//prints out the random number and adds space
     }//end of row loop
     System.out.println(" ");// line break
   }//end of for colums
  }//end of printMatix2 method
    
}//end of class

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
  public static void printMatix2(int n)
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
}*/