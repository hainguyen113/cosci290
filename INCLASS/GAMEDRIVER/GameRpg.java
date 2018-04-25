//Hai Nguyen
//CoSci 290
//123


import java.util.Scanner;

public class GameRpg{
  public static void main(String[] args){
    
    Utility tool = new Utility();
    TestWriteFile write = new TestWriteFile();
    
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
      
    