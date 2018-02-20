/*
  Hai Nguyen
  CoSci 290
  
  Lab3
  1. Using if - else if - else, create a scenario that sets up your character/user with random objects/situations
  2. Use random number generator
*/

public class TestSenerio
{

  public static void main(String[] args)
  {
  
    int minimum = 1;
    int maximum = 100;
    int randomNum = minimum + (int)(Math.random() * maximum);
    
    if(randomNum >= 90)
    {
      System.out.println("You found some food!");  
    }
    else if(randomNum <= 80 && randomNum >= 50)
    {
      System.out.println("You hear somthing in the shadows and find a place to hide from it.");
    }
    else if(randomNum < 30 && randomNum >= 20)
    {
      System.out.println("You found the key to escape!");
    }
    else if(randomNum < 20 && randomNum >= 15)
    {
      System.out.println("You feel dizzy and feel like someone is calling you to go to them "
                        + "as you walk closer you can see the red glow in their eyes. \nYou feel "
                        + "a sudden jolt of pain and begin to feel tired. She is telling you to sleep....");
      System.out.println("GAME OVER!!!");
    }
    else
    {
      System.out.println("Nothing is here.");
    }
  }
}