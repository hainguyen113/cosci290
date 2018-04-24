//Hai Nguyen
//CoSci 290
//123

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GameRpg{
  public static void main(String[] args){
    
    String name = " ";
    String survivors = " ";
    int age = 0;
    
    
    Scanner input = new Scanner(System.in);
    System.out.println("How Many Survivors Are With You?");
    survivors = input.next();
    System.out.println("Hello What Is Your Character's Name?");
    name = input.next();
    System.out.println("How Old Is your Character?");
    age = input.nextInt();
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
                      + "    :: : :     :: :: :    :            :         :  \n"
                      + " \n\n\n");
    
    System.out.println(name + "You and the remaining " + survivors + " survivors head in separate directions.");
      
    String FILENAME = "MyFile.txt";
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

	  String content = "This is the content to write into file\n";

	  bw.write(content);

	  System.out.println("Done");

    } catch (IOException e) {

      e.printStackTrace();                  
    }
}