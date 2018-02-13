//Hai Nguyen
//cosci 290
//testing out ways to make this game
import java.util.Scanner;
import java.util.Random;

public class TestGame{
    
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
    int healthPotionDropRate = 50; //50% drop rate
    
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
         
        }
        else if(input.equals("2")) {
          
        }
        else if(input.equals("3")) {
          
        }
      //  else 
      }
  //Start Game loop
      
    }
    
    
  }
  
}