// Hai Nguyen
// CoSci 290
// 4/24/18

import java.util.Scanner;

public class Lab15
{
  public static void main(String[] args)
  {
    int n = 0;
    while(n * n * n < 12000)
    {
      //System.out.println(n);
      n++;
      
    }
    System.out.println(n - 1 + " is the largest number "
                      + "cubed without going over 12,000.");
  }
}