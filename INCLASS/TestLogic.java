/* 
  Hai Nguyen
  CoSci 290
  Topics
   -multi-way if-else
   -logical operatiors
   -symbolic logic
   
   */
   import java.util.Scanner;
   public class TestLogic{
   
//entry point of application
      public static void main(String[] args){
//declare data type, variable, assignment, expression
     
//setting up scanner
     Scanner input = new Scanner(System.in);
//prompt to enter a grade
     System.out.println("Enter Grade: ");
        int grade = input.nextInt();
     
//simple if 
     if(grade >= 90){
       System.out.println("A");
     }
     if(grade < 90){
       System.out.println("grade is not an A");
     }
     else{
       System.out.println("grade is an A");
     }
//multi if - else if - else
     if(grade >= 90){
       System.out.println("A");
     }
     else if(grade >= 80){
       System.out.println("B");
     }
     else if(grade >= 70){
       System.out.println("C");
       
     }
     else{
       System.out.println("F");
     }
/*Logical Operators
     ! - Not
     != - Not Equals to
     == is equal to
     && - AND
     || - OR
       
     */
     //write a code that checks wheather a student is
     //grade is good, average, or bad
     //using a comparason operatior > to evaluate
     //the grade
     if(grade >= 80){
       System.out.println("This is a good grade.");
       
//you can nest if statements
       if(grade >= 90){
         System.out.println("Wow you got an A!");
       }
     }  
     else if(grade < 80 && grade >= 70){
        System.out.println("This is an average grade.");
     }
     else{
       System.out.println("This is a Bad Grade.");
     }
      
    }   
   }