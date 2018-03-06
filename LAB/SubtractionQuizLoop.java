/*
  Hai Nguyen
  CoSci 290
  Lab 6
*/
import java.util.Scanner;//utility that allows us to use scanner for user inputs
public class SubtractionQuizLoop
{
  public static void main(String[] args)
  {
    final int NUMBER_OF_QUESTIONS = 10; //number of questions 
    int correctCount = 0; //count the number of correct answers
    int count = 0; //count the number of questions
    long startTime = System.currentTimeMillis(); //beginning time when you started the test
    String output = " "; //outputs string is initially empty
    Scanner input = new Scanner(System.in);

    while(count < NUMBER_OF_QUESTIONS)
    {
      //generate 2 random single digit integers
      int number1 = (int)(Math.random() * 15);
      int number2 = (int)(Math.random() * 15);

      //if number1 < number2 swap number1 with number2
      if(number1 < number2)
      {
        int temp = number1;
        number1 = number2;
        number2 = temp;
      }//end of if loop for placing larger number with smaller number

      //prompt the student to answer what is number1 - number2?
      System.out.println("What is " + number1 + " + " + number2 + " ?");
      System.out.print("> ");
      
      int answer = input.nextInt();//user input assinged to answer
      
      //grade the answer and display the result
      if(number1 + number2 == answer)
      {
        System.out.println("You Are Correct!\n*********************************************\n");
        correctCount++;//adds 1 to correctCount
      }//end of if loop for display answer
      else
        System.out.println("Your answer is wrong.\n" + number1 + " + " + number2 + " should be " 
                           + (number1 + number2) + "\n*********************************************\n");
      //increase the questions count
      count++;

      output += "\n" + number1 + " + " + number2 + " = " + answer 
             + ((number1 + number2 == answer) ? " correct" : " wrong");

    }//end of while loop
    
    long endTime = System.currentTimeMillis();//end time for when you finished test
    long testTime = endTime - startTime;//time it took to finish test
    
    //prints out your score
    System.out.println("You got " + correctCount + " out of " + NUMBER_OF_QUESTIONS 
                       + "\nThe time it took you to complete is "
                      + testTime / 1000 + " seconds\n" + output);
  }//end of main method
}//end of class
