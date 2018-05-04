/*
  Hai Nguyen
  CoSci 290
  
*/

import java.util.Scanner;

public class Lab182
{
  public static void main(String[] args)
  {
    System.out.println("Please Enter 10 numbers: ");
    
    
  }
  public static double min(double[] array)
  {
    Scanner input = new Scanner(System.in);
    int ans = 0;
    int[] numbers = new int[5];
    
    for(int i = 0; i < 10; i++)
    {
      numbers[i] = input.nextInt();
      ans = numbers[i];
    }
    return ans;
  }
}