//Hai Nguyen
//CoSci 290

import java.util.Scanner;
public class LabInput{
  public static void main(String[] args){
    
    String name = " ";
    String survivors = " ";
    int age = 0;
    String namePet;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Hello What Is Your Character's Name?");
    name = input.next();
    System.out.println("How Old Is your Character?");
    age = input.nextInt(); System.out.println("How Many Survivors Are With You?");
    survivors = input.next();
    System.out.println("What is your dog's name");
    namePet = input.next();
    
    
    System.out.println("Welcome " + name + " To....");
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
                      + "    :: : :     :: :: :    :            :         :   ");
    
    System.out.println(name + " You and the remaining " + survivors + " survivors head in separate directions." 
                       + "Your Dog " + namePet + " Start your adventure.");
    
                      
  }
}