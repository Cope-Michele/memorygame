/*
 * This class should include all of the statistic functions because those are all 
 * dependant on instances of the Player class.  So we need to make sure to 
 * move and statistic functions that are in other classes to this class.
 */

package evamichele.memorygame.gamecreator;

import evamichele.memorygame.enums.GameStatus;
import evamichele.memorygame.interfaces.GetInput;
//import evamichele.memorygame.control.MemoryGameError;
import java.io.Serializable;
import java.util.Scanner;
/**
 * @author KenandEva
 * this class creates our Player Object, kind of like the little silver pieces 
 * used to mark a player on the board in Monopoly
 */

public class Player implements Serializable, GetInput{
    
    public static final String MAIN_USER = "USER_ONE";
    public static final String SECOND_USER = "USER_TWO";
    public String name;
    private boolean Cards;    
    private int gameMove;
    private String playerType;
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;
    private final double startingPoints = 115.00;
    private Scanner getInput;
    private GameStatus gameStatus;
    
    public Player(){
        getInput = new Scanner(System.in);
        //this.getTotalPoints();
        //this.calculateBestTime(55.55,235.55);
        //this.getWinningScore(gameMove, Cards);
    }
     public int getGameMove() {
        return gameMove;
    }

    
    public Player (String userType){
        
    }
    
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setGameMove(int gameMove) {
        this.gameMove = gameMove;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public long getWins() {
     System.out.println("you win mostly, you score will be here");
     //gameStatus = GameStatus.EXIT;
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }

    public long getTies() {
        
        return ties;
    }

    public void setTies(long ties) {
        this.ties = ties;
    }
    
    public String getInputAsString(){
        return getInput.nextLine();
    }
    
    private void getDisplayScore(){
    System.out.println("you win mostly");
     gameStatus = GameStatus.EXIT;
    
    }
  
    private void getWinningScore(int gameMove, boolean cards){
        
        int score= (int) (startingPoints)-gameMove;// cast double to int
        if ((cards==true)&&(gameMove==15)){
            System.out.println("you win perfect score!: " +score+" points\n");
        }
        else if  ((cards==true) && (gameMove<115)){
            System.out.println("you win  "+score+" points\n");
        }        
        else if((cards==false) && (gameMove==115)){
            System.out.println("you loose! "+ score+" points\n");
        }
        else if((cards==true) && (gameMove<=0)){
            System.out.println("invalid input\n");
        }
        else if((cards==false) && (gameMove>115)){
            System.out.println("invalid input\n");
        }            
    }
}
        
 /*       //Michele's Week 6 individual Assignment (collects and totals a players points)
    private void getTotalPoints() {    
        int points[] = {100, 115, 89, 60, 77, 26, 115};
        int sum = 0;
        for(int p : points) {
            System.out.println("\n\tGame Points are: " + p);
            sum += p;
        }
            System.out.println("\n\tTotal Player Points are: " + sum);
        if(points.length < 1) {
            new MemoryGameError().display("\n\t It looks like you Haven't "
            + "played yet! Play a game of Memory first to view your statistics");
        }
    }
}*/
