/*
Hai Nguyen

Play around with arrayss
*/

public class TestArrays
{//start of class
    public static void main(String[] args)
    {//start of main
      
      //declare an arrayss
      //String is a refference type in memory
      //inside [] need to give it a size
      String[] names = new String[5];
      
      //assignj values to this array
      names[0] = "Steven";
      names[1] = "Chris";
      names[2] = "Hai";
      names[3] = "Gerson";
      names[4] = "Adom";
      
      //reassign a value
      names[4] = "Lynn";
      
      //print 
      for(int i = 0; i < names.length; i++)
      {
        System.out.println("Element " + i + ": " 
                           + names[i]);
      }
    }//end of main
}//end of class