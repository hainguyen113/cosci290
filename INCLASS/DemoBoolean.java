/* 
  Hai Nguyen
  CoSci 290
  
  Demo Topics on :
      - increments/decrement operators
      - Augmented assignment operators
      - casting ints, double, 
      - basic if else statment
*/

public class DemoBoolean{
  
  //start of application
  public static void main(String[] args){
  
  int num = 1;
  num = num +1;
  num++;
  ++num; 
  
  num = 1;
  int count = ++num; //pre-increment, count 2
  System.out.println("count " + count + " num" + num);
  num = 1;
  count = num++;
  System.out.println("count  " + count + " num" + num);
    
  count = num--; //post-decrements
  count = --num; //pre-decrements
    
  //examples of augmented assignment operators
  num += 2; //equivalennt to => num = num + 2
  num *= 2; // num = num - 2
  num /= 2; // num = num / 2
  num -= 2; // num = num - 2
    
  System.out.println(2 * 3.0); //multiplaying and int with double will output a double
  System.out.println(num);
  System.out.println(num * 3.0); 
  num = 2;
  double num2 = 3.0;
  System.out.println("  num * num2 Double wins!! " + num * num2); // gain decimal point
  System.out.println(" (int) num2) Casting a double to int " + (int) num2); //lose decimal point
  System.out.println(" (double) num) Double wins!! " + (double) num); //gain decimal pint
  System.out.println(" Double wins!! " + (double) 'c'); // ascii
  
    
  int numberOfZombies =3;
  //basic if-else   
  if(numberOfZombies < 5){ 
    System.out.println("You Might To Survive This Apocolypes.");
  }
  else{
    System.out.println("You Might Not Survive This Apocolypes");
  }
    //Generating a random number 
    //Math.pow(3, 2); 3^2
    //Math.random()
    System.out.println(Math.random()); //random number between 0 - 1 with decmals
    
    //minimum + Math.random() * Maximum
    System.out.println(1 + Math.random() * 10); // will print out 1 - 10 with decmals
    
    //min + (Math.random()) * (Max - Min)
    System.out.println(1 + (int)(Math.random() * (10-5))); 
    
    int chanceOfSurviving = 1 + (int)(Math.random() * (10 - 1));
    System.out.println("You Rolled a " + chanceOfSurviving);
    if(chanceOfSurviving <= 3){
      System.out.println("You Made it Out Alive!!");
    }
    else{
      System.out.println("GameOver!!");
     
    }
  }
}
