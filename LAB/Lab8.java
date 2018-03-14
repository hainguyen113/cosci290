/*
  Hai Nguyen
  CoSci290
  Lab8
*/

import java.util.Scanner;

public class Lab8
{
  /** Main method */
  public static void main(String[] args) 
  {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

     // Prompt the user to enter some integers
    System.out.print("Enter some integers: ");
    int n = input.nextInt();  
    System.out.println("Your numbers is " + n);  
    //System.out.println("The sum of your numbers is " + sumDigits(n));
    System.out.println("The sum of your integers is " + n 
                       + " is " + sumDigits(n));
  }

  public static int sumDigits(int n)
  {
    int pop, num, sum;
    //sumDigits = 0;
    pop = 0;
    num = n;
    sum = 0;

    do
    {
      pop = num % 10;
      num = num / 10;
      sum += pop;
    }
    while(pop > 0);
    //System.out.println("The sum of your numbers is " + sum);
    //System.out.println("The pop of your numbers is " + pop);
    //System.out.println("The num of your numbers is " + num);

    return sum;
  }
}
/*
import java.util.Scanner;
public class Lab8
{
  public static void main(String[] args)
  {
    int sum, pop, num;
    sum = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("input some numbers: ");
    num = input.nextInt();
    System.out.println("you entered " + num);
    do
    {
      pop = num % 10;
      num = num / 10;
      sum += pop;
    }
    while(pop > 0);
    
    System.out.println("The sum of your numbers is " + sum);
    
  }
}
*/