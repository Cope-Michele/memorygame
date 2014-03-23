/*
 * This class should include all of the statistic functions because those are all 
 * dependant on instances of the Player class.  So we need to make sure to 
 * move and statistic functions that are in other classes to this class.
 */

package evamichele.memorygame.gamecreator;

import evamichele.memorygame.interfaces.GetInput;
import evamichele.memorygame.control.MemoryGameError;
import java.io.Serializable;
import java.util.Scanner;
/**
 * @author KenandEva
 * this class creates our Player Object, kind of like the little silver pieces 
 * used to mark a player on the board in Monopoly
 */

// Eva's individual assignment lesson 3
// Paired Programming Assignment Lesson 8
public class Player implements Serializable, GetInput{
    
    public static final String MAIN_USER = "USER_ONE";
    public static final String SECOND_USER = "USER_TWO";
    public String name;
    private String age;
    private boolean Cards;    
    private int gameMove;
    private String playerType;
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;
    private final double startingPoints = 115.00;
    private Scanner getInput;
    
    public Player(){
        getInput = new Scanner(System.in);
        //this.getTotalPoints();
        //this.calculateBestTime(55.55,235.55);
        //this.getWinningScore(gameMove, Cards);
    }
    
    public Player (String userType){
        
    }
    
    public String getAge(){
        System.out.println("Enter the number on the card.");
        System.out.print("First Card Choice?>");
        age =getInputAsString();
        return age;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGameMove() {
        return gameMove;
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
    
    // Paired Programming Assignment
    private void calculateBestTime(double recordBest, double newTime){
        int secondsBehind;
        int secondsAhead;
    
        if(((recordBest <= 0)&&(newTime <= 0))||(newTime <= 0)) 
            System.out.println("Invalid Time. \n");
        else if (recordBest == 0) {
            System.out.println(+newTime + " Game Time \n");
            System.out.println("New Record!");
        }
        else if (recordBest < newTime) {
            secondsBehind = (int) (newTime - recordBest);
            System.out.println(+newTime + " Game Time \n");
            System.out.println(+ secondsBehind+ " seconds behind the current record time. \n");
        } 
        else if (recordBest > newTime) {
            secondsAhead = (int) (recordBest - newTime);
            System.out.println(+newTime + " Game Time \n");
            System.out.println("New Record! " +secondsAhead+ " seconds ahead of previous record time. \n");
        }
        else if (recordBest == newTime) {
            System.out.println(+newTime + " Game Time \n");
            System.out.println("Tied Game Record! \n");
        }
        
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
        
        //Michele's Week 6 individual Assignment (collects and totals a players points)
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
}
