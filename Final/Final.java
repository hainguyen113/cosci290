import java.util.*;

public class Final{
  
  //declare 2d array to hold X's and O's to represent board
  static char[][] board = {
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '}
                          };
  static char xo = 'x'; //holds which player is currently playing
  static boolean gameOver = false; //ends the loop if there is a winner
    
  //start of program
  public static void main(String[] args){
    
    //declare variables
    Scanner input = new Scanner(System.in);
    int row = 0;
    int col = 0;
    int draw = 0;
    
    System.out.println("Let's play!");
       
    //while there isn't a winner
    while(!gameOver){
      printBoard();
        System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2 for row");
        row = input.nextInt();
        System.out.println("Please enter 0, 1, 2 for col");
        col = input.nextInt();
        draw += 1;
      move(row, col);
      changeXO();
      //System.out.println(draw);
      if(checkWinner() || draw == 36){
        gameOver = true;
      }
    }
    printBoard();
    changeXO();
    
    if(draw == 36 ){
      System.out.println("No Winner!!!!");
    }
    else{
    System.out.println("The winner is " 
                       + xo + "!");
    }
  }//end of main method
  
  /*
    This method prints the Tic Tac Toe board
    with updated moves by players.
  */
  public static void printBoard(){
       
     System.out.println("--------------------------");
    for (int i = 0; i < 6; i++) {
        System.out.print("| ");
        for (int j = 0; j < 6; j++) {
            System.out.print(board[i][j] + " | ");
        }
        System.out.println();
        System.out.println("--------------------------");
    }
 
  }//end of printBoard
  
  public static void changeXO(){
    if(xo == 'x'){
      xo = 'o';
    }
    else{
      xo = 'x';
    }    
  }//end of changeXO
  
  /*
    If there isn't already an x or o in that row and col
    place the character in the array.
    Then change xo.
    Else prompt the user to try again because there's already an x or o here.
  */
  public static void move(int row, int col){
    if ((row >= 0) && (row < 6) && (col >= 0) && (col < 6)) {
                if(board[5][col] == ' '){
                  board[5][col] = xo;
                }
                else if (board[4][col] == ' ') {
                    board[4][col] = xo;
                }
                else if (board[3][col] == ' ') {
                    board[3][col] = xo;
                }
                else if (board[2][col] == ' ') {
                    board[2][col] = xo;
                }
                else if (board[1][col] == ' ') {
                    board[1][col] = xo;
                }
                else if (board[0][col] == ' ') {
                    board[0][col] = xo;
                }
                else{
                  System.out.println("There is already something there please try again");
                  changeXO();
                }
            }
        
  }//end of move
  
  /*
    Returns true if there there is a winner or a draw to end the game
  */
  public static boolean checkWinner(){
   for(int i = 0; i < 6; i++){
       if(board[i][0]!= ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == board[i][3]){
          return true;
       }
       else if(board[i][1]!= ' ' && board[i][1] == board[i][4] && board[i][1] == board[i][2] && board[i][1] == board[i][3]){
          return true;
       }
       else if(board[i][2]!= ' ' && board[i][2] == board[i][4] && board[i][2] == board[i][5] && board[i][2] == board[i][3]){
          return true;
       }
       else if(board[0][i]!= ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == board[3][i]){
          return true;
       }
       else if(board[1][i]!= ' ' && board[1][i] == board[4][i] && board[1][i] == board[2][i] && board[1][i] == board[3][i]){
          return true;
       }
       else if(board[2][i]!= ' ' && board[2][i] == board[4][i] && board[2][i] == board[5][i] && board[2][i] == board[3][i]){
          return true;
       }
       else if(board[0][0]!= ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == board[3][3] ||
              board[2][0]!= ' ' && board[2][0] == board[1][3] && board[2][0] == board[2][4] && board[2][0] == board[3][5] ||
              board[1][0]!= ' ' && board[1][0] == board[2][1] && board[1][0] == board[1][0] && board[3][2] == board[4][3] ||
              board[2][2]!= ' ' && board[2][2] == board[3][3] && board[2][2] == board[4][4] && board[2][2] == board[5][5] ||
              board[2][1]!= ' ' && board[2][1] == board[3][2] && board[2][1] == board[4][3] && board[2][1] == board[5][4] ||
              board[1][1]!= ' ' && board[1][1] == board[2][2] && board[1][1] == board[3][3] && board[1][1] == board[4][4] ||
              board[0][1]!= ' ' && board[0][1] == board[1][2] && board[0][1] == board[2][3] && board[0][1] == board[3][4] ||
              board[1][2]!= ' ' && board[1][2] == board[2][3] && board[1][2] == board[3][4] && board[1][2] == board[4][5] ||
              board[0][2]!= ' ' && board[0][2] == board[1][3] && board[0][2] == board[2][4] && board[0][2] == board[3][5] ||
              board[0][3]!= ' ' && board[0][3] == board[2][1] && board[0][3] == board[1][2] && board[0][3] == board[0][3] ||
              board[0][4]!= ' ' && board[0][4] == board[3][1] && board[0][4] == board[2][2] && board[0][4] == board[1][3] ||
              board[3][1]!= ' ' && board[3][1] == board[2][2] && board[3][1] == board[1][3] && board[3][1] == board[0][4] ||
              board[5][0]!= ' ' && board[5][0] == board[4][1] && board[5][0] == board[3][2] && board[5][0] == board[2][3] ||
              board[4][1]!= ' ' && board[4][1] == board[3][2] && board[4][1] == board[2][3] && board[4][1] == board[1][4] ||
              board[3][2]!= ' ' && board[3][2] == board[2][3] && board[3][2] == board[1][4] && board[2][3] == board[0][5] ||
              board[5][1]!= ' ' && board[5][1] == board[4][2] && board[5][1] == board[3][3] && board[5][1] == board[2][4] ||
              board[4][2]!= ' ' && board[4][2] == board[3][3] && board[4][2] == board[2][4] && board[4][2] == board[1][5] ||
              board[5][2]!= ' ' && board[5][2] == board[4][3] && board[5][2] == board[3][4] && board[5][2] == board[2][5]){
          return true;
       }
      
      
     }
    
    return false;
  }//end of checkWinner
}//end class