/* Hai Nguyen
   CoSci290
   HW 2/15/2018
*/

import java.util.Scanner;

//Demo HW1
public class GameDriver{
  //start of the application
  public static void main(String[] args) throws Exception{
    //variable name/decloration assignment expression
    Scanner input = new Scanner(System.in); 
    int survivors = 0;
    String name = "";
    String name2 = "Sally";
    String namePet = "";
    int randomNum = 0;
    int minimum = 1;
    int maximum = 10;    
      
    //Splash Screen
    System.out.println("-------------------------------------------------------------\n\n");
    System.out.println(                                         
                        "     @@@@@@    @@@@@@@  @@@          @@@@@@@@  @@@  \n"
                      + "    @@@@@@@   @@@@@@@@  @@@          @@@@@@@@  @@@  \n"
                      + "    !@@       !@@       @@!          @@!       @@!  \n"
                      + "    !@!       !@!       !@!          !@!       !@!  \n"
                      + "    !!@@!!    !@!       !!@  @!@!@!  @!!!:!    !!@  \n"
                      + "     !!@!!!   !!!       !!!  !@!@!@  !!!!!:    !!!  \n"
                      + "         !:!  :!!       !!:          !!:       !!:  \n"
                      + "        !:!   :!:       :!:          :!:       :!:  \n"
                      + "    :::: ::    ::: :::   ::           ::        ::  \n"
                      + "    :: : :     :: :: :    :            :         :  \n\n\n");
    
    
//story setup
    System.out.println("You wake up in a room groggy and disorented. There is another person with you.");
    Thread.sleep(3000);
    System.out.println("The person looks at you and asks your name?\nType your name and press return.");
    
    System.out.print("> ");
    name = input.next();//character name input
    
    System.out.println("My Name... oh my name is " + name + ". What's Your's?");
    Thread.sleep(3000);
    System.out.println("She looks no older then 12 she says her name is...  \nWhat is her name again?");
    
    System.out.print("> ");
    name2 = input.next();//npc name input
    
    System.out.println(name2 + " you hear her say.");
    Thread.sleep(3000);
    System.out.println("You ask her where you were.");
    Thread.sleep(3000);
    System.out.println("She looks just as confused as you are and says she was hoping you could tell her.");
    Thread.sleep(3000);
    System.out.println("Just then you to see a door and are able to open it to see outside");
    Thread.sleep(3000);
    System.out.println("She asks you Can you see anyone?");
    System.out.println("Tell her how many people can you see?");
   
    
    System.out.print("> ");
    survivors = input.nextInt();//anyone else around
    
    //if else statemant
    if(survivors >= 1){
      System.out.println("Yeah I see somthing about " + survivors + " or so moving shadows.");
      Thread.sleep(3000);
    }
    else{
      System.out.println("I dont see anyone.");
      Thread.sleep(3000);
    }
    
    System.out.println("You pause for a moment and say I see a dog comming.");
    Thread.sleep(3000);
    System.out.println("The little girl says it is hers and tells you its name.");
    Thread.sleep(3000);
    System.out.println("You try to remember the dogs name. What was it again?");
   
    System.out.print("> ");
    namePet = input.next();//playing with inputs
   
    System.out.println("Oh yeah it is " + namePet + ".");
    Thread.sleep(3000);
    System.out.println("You walk out with " + name2 + " and her dog " + namePet + " to see if you can find anyone "
                      + "that has any answers to your questions.");
    Thread.sleep(3000);
    System.out.println("\n\nThe light fades away as you and " + name2 + " and " + namePet +" head out to find anyone.");
    Thread.sleep(2000);
    
    //random number generator
    randomNum = minimum + (int)(Math.random() * (maximum - minimum));
    //System.out.println(randomNum); //testing to see if randomNum gen is working
    System.out.println("You roll a " + randomNum + ".");
    //live or die?
    if(randomNum > 5 ){
      System.out.println("You and " + name2 + " find a group heading home, You're SAVED!!!");
      Thread.sleep(2000);
    }
    else if(randomNum <=5){
      System.out.println("As you walk with " + name2 + " you begin to notice her eyes glowing red "
                        + " you also see her floating as she screams your name" + name + "\n You "
                        + " will never escape my grasp!!!!");
      Thread.sleep(2000);
      
     
    }
      System.out.println(" _______  _______  __   __  _______    _______  __   __  _______  ______    __  \n"
                     + "|       ||   _   ||  |_|  ||       |  |       ||  | |  ||       ||    _ |  |  | \n"
                     + "|    ___||  |_|  ||       ||    ___|  |   _   ||  |_|  ||    ___||   | ||  |  | \n"
                     + "|   | __ |       ||       ||   |___   |  | |  ||       ||   |___ |   |_||_ |  | \n"
                     + "|   ||  ||       ||       ||    ___|  |  |_|  ||       ||    ___||    __  ||__| \n"
                     + "|   |_| ||   _   || ||_|| ||   |___   |       | |     | |   |___ |   |  | | __  \n"
                     + "|_______||__| |__||_|   |_||_______|  |_______|  |___|  |_______||___|  |_||__| \n");
    
    }
    
  }
