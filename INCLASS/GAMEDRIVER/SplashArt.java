/*
  
    Hai Nguyen with  Steven Lemos help
    
    This Utility Class houses all the custom methods that
    support my text adventure.support
    
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SplashArt{
  /*
    This methond oens a file and prints out each line.
  */
  public void readFile(String filename) throws Exception {
    
    String currentLine; //hold the current line being read in file
    
    //trying to open a file to read
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
      
      //read each line in the file until the EOF
      while((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
        
      } 
     //if there is no file to open, the exception will be caught 
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}//end class