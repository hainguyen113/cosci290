/*
  Hai Nguyen
  CoSci290
*/
import java.util.Scanner;//utility for scanner
public class Lab7 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);//scanner 
    //declaring variables
    String str;
    int number, sum = 0, count, sumPositive, sumNegative, positive, negative;
    positive = 0;
    negative = 0;
    sumPositive = 0;
    sumNegative = 0;
    sum = 0;
    
    System.out.print("Enter integers with spaces in between, "
                     + "the input ends if it is 0: i.e. 1 2 -1 3 0\n >> ");
    
    for (count = 0; ; count++)
    {

      number = input.nextInt();
      if(number > 0)
      {
        positive++;
        sumPositive += number;
      }
      else if(number < 0)
      {
        negative++;
        sumNegative += number;
      }
      else if(number == 0)
      {
        break;
      }
      sum = sumPositive + sumNegative;
    }
    System.out.println("sum is " + sum);
    System.out.println("count is " + count);
    System.out.println("the number of positive is " + positive);
    System.out.println("the sum of the positive is " + sumPositive);
    System.out.println("the sum of the negative is " + sumNegative);
    System.out.println("the number of negative is " + negative);
    
    
  }//end of main method
}//end of class