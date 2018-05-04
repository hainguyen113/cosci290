/*
  Hai Nguyen
  CoSci 290
  
*/

import java.util.Scanner;

public class Lab182
{
  public static void main(String[] args)
  {
    double num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
    double[] numbers = new double[10];
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please Enter 10 numbers: ");
    
    //min(new double[] {1, 2, 3});
    num1 = input.nextDouble();
    num2 = input.nextDouble();
    num3 = input.nextDouble();
    num4 = input.nextDouble();
    num5 = input.nextDouble();
    num6 = input.nextDouble();
    num7 = input.nextDouble();
    num8 = input.nextDouble();
    num9 = input.nextDouble();
    num0 = input.nextDouble();
   
    min(num1, num2, num3, num4, num5, num6, num7, num8, num9, num0);
  }
  public static void min(double... numbers)
  {
    double result = numbers[0];
    for (int i = 1; i < numbers.length; i++)
    if (numbers[i] < result)
    result = numbers[i];
    System.out.println("The min value is " + result);

  }
    //System.out.println(numbers[0]);    
}
