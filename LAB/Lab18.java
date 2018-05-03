/*
  Hai Nguyen
  CoSci 290
  Adding 2 arrays
*/


public class Lab18
{
  public static void main(String[] args)
  {
    
    //declare an arrayss
    //String is a refference type in memory
    //inside [] need to give it a size
    
    int[5] numbers = {0 + (int)(Math.random() * 5)}; 
    int[] numbers2 = {6, 7, 8, 9, 0};
    
    
    for(int i = 0; i < numbers.length; i++)
    {
      //int numbers[] = 0 + (int)(Math.random() * 5);
    
      System.out.println(numbers[i] + numbers2[i]);
      //System.out.println(numbers2[i]);
    }
  }//end of main
}//end of class