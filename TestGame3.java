//Hai Nguyen
//cosci 290
//testing out ways to make this  working>???
import java.util.Scanner;
import java.util.Random;

  public class TestGame3{
    
  public static void main(String[] args) {
    
    //system objects
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    
    //game variables
    String[] enemies = { "Skeletons", "Zombies", "Warrior", "Assassin" };
    int maxEnemyHealth = 75;
    int enemyAttack = 25;
   
    //player variables
    int health = 100;
    int attackDamage = 50;
    int numHealthPotion = 3;
    int healthPotionHealAmount = 30;
    int healthPotionDropRate = 75; //75% drop rate
    
    boolean running = true;
    
    System.out.println("Welcome");
    
    GAME:
    while(running) {
      System.out.println("____________________________________________");
      
      
      int enemyHealth = rand.nextInt(maxEnemyHealth);
      String enemy = enemies[rand.nextInt(enemies.length)];
      System.out.println("\t#" + enemy + "Appeared!");
      //prints out "Skeletons Appeared
      
      while(enemyHealth > 0 ) {
        System.out.println("\t> Your HP " + health);
        System.out.println("\t> Enemy " + enemy + "HP: " + enemyHealth);
        System.out.println("\n\t> What would you like to do");
        System.out.println("\t You have " + numHealthPotion + " Potions.");
        System.out.print("\t1. Attack");
        System.out.print("\t2. Drink A Potion");
        System.out.println("\t3 RUN!!!");
        
        String input = in.nextLine();
        if(input.equals("1")) {
          int damageDealt = rand.nextInt(attackDamage);
          int damageTaken = rand.nextInt(enemyAttack);
          
          enemyHealth -= damageDealt;
          health -= damageTaken;
          
          System.out.println("\t> You Did " + damageDealt + " Damage To " + enemy + "!");
          System.out.println("\t> You Received " + damageTaken + " Damage From " + enemy 
                             + "!");
         if(health < 1) {
           System.out.println("\n\t You Are Dead!!");
          break;
         }  
        }
        else if(input.equals("2")) {
          if(numHealthPotion > 0) {
            health += healthPotionHealAmount;
            numHealthPotion--;
            
            System.out.println("\t You Heal For " + health + " Points!! You have " 
                               + numHealthPotion + " Health Potions Left!\n");
            
              
          }
          else {
           System.out.println("\t You have no Potions Left!!");
           
          }     
          
        }
       
        else if(input.equals("3")) {
          System.out.println("\t You Ran Away from " + enemy + "!");
          continue GAME;
          
        }
      else {
        System.out.println("\t Please Choose from 1, 2, 3!!!!");
      }
      }
  //Out of Game loop
      if(health < 1) {
        System.out.println("\t GameOver!!");
        break;
      }
      System.out.println("\n____________________________________________\n");
      System.out.println("\t #  You defeated " + enemy + "!  # ");
      if(rand.nextInt(100) < healthPotionDropRate) {
        numHealthPotion++;
        System.out.println("The Enemy " + enemy + " Dropped Health Potions. You now have " 
                           + numHealthPotion + " Potions\n");
        
      }
      System.out.println("\t What Do You Want To Do");
      System.out.print("\t1. Continue");
      System.out.print("\t2. End \n");
      
      String input = in.nextLine();
      
      while(!input.equals("1") && !input.equals("2")) {
        System.out.println("Invalid Command");
        input = in.nextLine();
        }
      if(input.equals("1")) {
        System.out.println("\t You Continue On Your Adventure");
         }
      else if(input.equals("2")) {
        System.out.println("\t Good Bye Adventurer Until We Meet Again!!");
        break;
      }
    }
    
    System.out.println("#########################");
    System.out.println("\t Thanks for playing!!");
    System.out.println("##########################");
    
  }
  
}