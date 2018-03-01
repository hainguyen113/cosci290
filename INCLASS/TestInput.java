//Hai Nguyen (Henry)
//java CoSci 290

//Testing datatypes and inputs from the user
import java.util.Scanner; //import allows you to use the Scanner object 
public class TestInput{
  
//main method - starting point of application 
  // will always look like this
  
  public static void main(String[] args){
  /*naming rules for identifiers
  datatypes variableName =  expression
  1. identifiers can only start with letter, _, or $
  2. identifiers with multiple words are camelCase
  e.g. - numOfStudents, $name, interestRate, 
  
  primative datatypes 
  int - integer - whole number => 1, 5, 2147483647 
  double - decimal number => 3.33, -0.2 ... 
  char - single character inside single quoteations => '3', '!', ' '
  boolean -  true or fase
  
  object/referance datatypes
  string - character surounded with double quotes => "asdf", "HelloWorld", "cat"
  there are other object in java that comes with Java and that are custom
  => Objects/class that comes with Java: Scanner, System, String, math, ect Objects
  => Customer Classes: Zombie, SpaceInvader, Person, ect.
  */
  // datatype variableName = expression ; 
  // String     name      =   "Henry" ;  
  String name = "Henry";
  name = "not Henry"; // doing this places a new value to the object
  int numberOfStudens = 29;
  double aveGPA = 3.78;
  final double PI_VALUE = 3.1415; //Constants are all capital, multipule words saparated by underscores _
                                  //placig final modifier will keep the object final and can not change in the future
  boolean gameOver = false; //or true
  int age = 0;
    
  System.out.println("Hi Please Enter Your Name");
  Scanner input = new Scanner(System.in);
  
  //name was already declared in line 32
  name = input.next(); //.next() is for String types
    
  System.out.println("Hi " + name);
    
  System.out.println("How old are you " + name + "?");
  
  age = input.nextInt(); //nextInt() is for int types
    
  System.out.println(name + " You Are " + age + " Years Old!");
    
  /* 
    Arithmatic operators
    + addition
    - subtration
    * multiplication
    / division
    = assignment operator, equals
    
    Math operation follow order of operations from left to right
    PEMDAS (), ^, *, /, +, - 
    Parenthases, Exponent, Multiplcation, Division, Addition, Subtraction     
   */
    
   int month = age * 12;
   int days = age * 365;
   int hours = days * 24;
   
   System.out.println("You Are " + month + " months old Or " + days + " Days Old or " 
                     + hours +" hours old.");
  }

}