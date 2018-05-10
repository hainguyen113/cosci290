/*
  Hai Nguyen
  Cosci 290
  5/10/18
*/

import java.util.Scanner;// import utility for scanner

public class Quiz2
{// start of class
  public static void main(String[] args)
  {// star of main
    Scanner input = new Scanner(System.in);//scanner
    //declaring variables
    String name;
    int i, randomNum;
    
    System.out.println("Please enter Your name:\n> ");// print out instrustions
    name = input.next();// takes user inputs
    
    int[] set1 = new int[name.length()];
    int[] set2 = new int[name.length()];
    int[] oddArray = new int[name.length()];
    int[] evenArray = new int[name.length()];
    
    for(i = 0; i < name.length(); i++)
    {
      randomNum = 0 + (int)(Math.random() * (10 - 1));
      set1[i] = randomNum;
      set2[i] = randomNum;
      System.out.println("Set1 index # " + i + " is " + set1[i]);
    }
    System.out.println("-------------------------------");
     for(i = 0; i < name.length(); i++)
    {
      randomNum = 0 + (int)(Math.random() * (10 - 1));
      set2[i] = randomNum;
      System.out.println("Set2 index # " + i + " is " + set2[i]);
    }
    
    System.out.println("-------------------------------");
    //System.out.println(checkNum(set1[i]));
    //System.out.println("-------------------------------");
    
    //}//end of main
  
    //public static int checkNum(int set1[])
    //{// start of chech num method
      //int ans = 0;
      for(int j = 0; j < name.length(); j++)
      {
        if(set1[j] % 2 == 0)
        {
          evenArray[j] = set1[j];
          System.out.println("The number in set1 " + set1[j] + " is even.");
        }
        else
        {
          oddArray[j] = set1[j];
          System.out.println("The number in set1 " + set1[j] + " is odd.");
        }
         //ans = set1[j];
      }
      System.out.println("-------------------------------");
    
      for(int k = 0; k < name.length(); k++)
      {
        if(set2[k] % 2 == 0)
        {
          evenArray[k] = set2[k];
          System.out.println("The number in set2 " + set2[k] + " is even.");
        }
        else
        {
          oddArray[k] = set2[k];
          System.out.println("The number in set2 " + set2[k] + " is odd.");
        }
      }
      System.out.println("-------------------------------");
      for(i = 0; i < name.length(); i++)
      {
        System.out.println("New Even Array for index "
                           + i + " is " + evenArray[i]);
      }
      System.out.println("-------------------------------");
      for(i = 0; i < name.length(); i++)
      {
        System.out.println("New Odd Array for index "
                           + i + " is " + oddArray[i]);
      }
    //return ans;
    }// end of main
}//end of class