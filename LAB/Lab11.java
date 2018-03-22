/*
  Hai Nguyen
  CoSci290
  3/22/18
*/
import java.util.Scanner;
public class Lab11 
{
 public static void main(String[] args)
 {
   Scanner input = new Scanner(System.in);
   int n;
   System.out.println("Please enter a number.");
   n = input.nextInt();
   printMatix(n);
 }  
  public static void printMatix(int n)
  {
   for(int i = n; i > 0; i--)
   {
     for(int row = n ; row > 0; row--)
     {
       int randomNum = 0 + (int)(Math.random() * 2);
       System.out.print(randomNum + " ");
     }
     System.out.println(" ");
   }
  }
}