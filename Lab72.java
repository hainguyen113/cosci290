/*
  Hai Nguyen
  CoSci290
*/
import java.util.Scanner;//utility for scanner
public class Lab72 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);//scanner 
    //declaring variables
    String str;
    int sum = 0, count, sumPositive, sumNegative, positive, negative;
    positive = 0;
    negative = 0;
    sumPositive = 0;
    sumNegative = 0;
    sum = 0;
    
    String number = "10";
    int result = Integer.parseInt(number);
    System.out.println(result);
    for(int i = 0; i < number.length(); i++){
      System.out.println(number.charAt(i));
    }
    
  }//end of main method
}//end of class