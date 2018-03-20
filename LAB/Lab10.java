/*
  Hai Nguyen
  CoSci 290
  Lab10 problem 6.8
  Convert from Celsius to Fahrenheit and from Fahrenheit to Celsius
*/

//import java.util.Scanner;
public class Lab10
{//start of class
  public static void main(String[] args)
  {//start of main
    //Scanner input = new Scanner(System.in);
    //char start;
    double celsius = 40, fahrenheit = 120;
    System.out.println("Are you ready to start");
    System.out.print("Hello Please enter Celsius\n> ");
    //celsius = input.nextDouble();
    System.out.print("Please enter Fahrenheit\n> ");
    //fahrenheit = input.nextDouble();
    System.out.println("Celsius     Fahrenheit | " + "Fahrenheit   Celsius \n"
                      + "___________________________________________________");
    for(int i = 0; i<10; i++)
    {
      System.out.println( celsius + "C         " + celsiusToFahrenheit(celsius) 
                       + "F   | " + fahrenheit + "F         " + fahrenheitToCelsius(fahrenheit)
                      + "C");
      celsius--;
      fahrenheit -= 10;
    }
  }//end of main
    public static double celsiusToFahrenheit(double celsius)
    {//celsiusToFahrenheit
      double fahrenheit = (9.0 / 5) * celsius + 32;
      return fahrenheit;
    }//end celsiusToFahrenheit
    public static double fahrenheitToCelsius(double fahrenheit)
    {
      double celsius = (5.0 / 9) * (fahrenheit - 32);
      return celsius;
    }
}//end of class
/*
Scanner input = new Scanner(System.in);
    int start;
    double celsius = 0, fahrenheit = 0;
    System.out.println("Hello, Are You Ready To Convert From Celsius or Fahrenheit"
                      + "Press '1' If You Are Converting From Celsius Or Press '2'"
                      + " If You Are Converting From Fahrenheit.");
    System.out.print("> ");
    start = input.nextInt();
    System.out.println("You Entered " + start + ".");
      if(start == 1)
      {//start of if for celsius
        System.out.println("How Many Degree Celsius Do You Have?");
        System.out.print("> ");
        celsius = input.nextDouble();

        fahrenheit = (9.0 / 5) * celsius + 32;
      }//end of if for celsius
      else if(start == 2)
      {//start of if for fahrenheit
        System.out.println("How Many Degree Fahrenheit Do You Have?");
        System.out.print("> ");
        fahrenheit = input.nextDouble();

        celsius = (5.0 / 9) * (fahrenheit - 32);
      }//end of if for fahrenheit
      else
      {
        System.out.println("Not A Valid Entry");
      }
    System.out.println("Celsius   Fahrenheit |   Fahrenheit    Celsius");
    System.out.println(celsius + "       " + fahrenheit);
*/