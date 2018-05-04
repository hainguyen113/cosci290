import java.util.Scanner;
public class OtherTest 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int a, b, c, d, e;
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    d = input.nextInt();
    e = input.nextInt();
    
    printMax(a, b, c, d, e);
    printMax(new double[]{1, 2, 3});
  }
  public static void printMax(double... numbers) 
  {
    if (numbers.length == 0) 
    {
      System.out.println("No argument passed");
      return;
    }
    double result = numbers[0];
    for (int i = 1; i < numbers.length; i++)
    if (numbers[i] > result)
    result = numbers[i];
    System.out.println("The max value is " + result);
  }
}