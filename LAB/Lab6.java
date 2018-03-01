/*
  Hai Nguyen
  CoSci group 2
  
  Lab 6
  
  */
import java.util.Scanner;

public class Lab6
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); 
    String item;
    int num = 0;
    
   
    System.out.println("Please chose a number between 0 - 9");
    System.out.print("> ");
    num = input.nextInt();
    
    System.out.println("Please enter your item name");
    System.out.print("> ");
    item = input.next();
    
    System.out.println("You Have " + item + ". x " + num + ". ");
    
  }
}
  