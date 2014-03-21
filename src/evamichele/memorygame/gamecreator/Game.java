/*
 * 1.Paired Programming Assignment function is called calculateBestTime()
 * 2.Make a loop so that player can take a new turn.
 * 3.Make board sizes within the Board class, and call them into our Game.
 * 4. We need to create a timer so that we can get statistics for our game.
 */

package evamichele.memorygame.gamecreator;


import evamichele.memorygame.control.MemoryGameError;
import evamichele.memorygame.views.HelpMenuView;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.io.Serializable;

/*
 * @author michelecope
 */

public class Game implements Serializable {  
    //these tags are used to reference the Game class in other classes.
    public static final String ONE_PLAYER_GAME = "ONE_PLAYER";
    public static final String TWO_PLAYER_GAME = "TWO_PLAYER";
    public static final String EASY="EASY";
    public static final String MEDIUM="MEDIUM";
    public static final String HARD="HARD";
    
    
    public static final String NO_ACTIVE_GAME = "NO_GAME_STARTED";
    public static final String NEW_GAME = "NEW_GAME";
    public static final String PLAYING = "PLAYING"; 
    public static final String WINNER = "WINNER"; 
    public static final String TIE = "TIE"; 
    public static final String QUIT = "QUIT"; 
    public static final String ERROR = "ERROR";
    public static final String EXIT = "EXIT";
    
    private String gameType;// used?
    public Player playerA;
    public Player playerB;
    private Player currentPlayer;
    private Player otherPlayer;
    private Player winner;// SAME AS THIS ONE ?  public static final String WINNER = "WINNER"; 
    private Player loser;
    public String status;
    private HelpMenuView gameRules;
    private Array gamePlayers;
    
    private  Card[][]board;
    private  String[] words;
    private  Random randomCard;
    private  Scanner getInput;
    private int card;
    private int cardChoice1;
    private int cardChoice2;
    private int gameMove=0;// the player move
    private boolean matched = false;
    private double startingPoints = 115.00;
    private int module;
   
    public void startGame(int noPlayers,int gameLevel){         
        if (noPlayers != 1  &&  noPlayers != 2) {
            new MemoryGameError().display("invalid number of players specified."
                    + "Please select either a 1 or 2 player game.");
            return;
        }
        
        if (noPlayers == 1) {module = 6;     
            if(gameLevel==1){
                this.GameEasy();
                System.out.println(" One PLayer Level 1");
            }
            else if(gameLevel==2){
                this.GameMedium();
                System.out.println(" One PLayer Level 2");
            }
            else if (gameLevel==3){
                this.GameHard();
                System.out.println(" One PLayer Level 3");
            }    
        }
        
        else {
            if(gameLevel==1){
                System.out.println(" Two PLayer Level 1");
                this.GameEasy();
            }
            else if(gameLevel==2){   
                System.out.println(" Two PLayer Level 2");
                this.GameMedium();
            }
            else if (gameLevel==3){
                System.out.println(" Two PLayer Level 3");
                this.GameHard();
            }
        }
    }
    
    public void GameEasy(){
        
        words = new String []{"RED","RED","ORANGE","ORANGE","YELLOW","YELLOW","GREEN","GREEN","BLUE","BLUE"};
        randomCard = new Random();
        getInput = new Scanner(System.in);
        board = new Card[3][3];
        module = 3; 
            
        shuffle();// I don't know if thos are necessary
        setCells ();
        printCells();
        playGame();// this is  not  used 
         
    }
    
    public void GameMedium(){ 
   
        words = new String []{"RED","RED","ORANGE","ORANGE","YELLOW","YELLOW","GREEN","GREEN","BLUE","BLUE","PURPLE","PURPLE","VIOLET","VIOLET","INDIGO","INDIGO"};
        randomCard = new Random();
        getInput = new Scanner(System.in);
        board = new Card[4][4];
        module= 4;
      
        shuffle();
        setCells ();
        printCells();
        playGame();
      
    }
    public void GameHard(){
        
        words = new String []{"RED","RED","ORANGE","ORANGE","YELLOW","YELLOW","GREEN","GREEN","BLUE","BLUE","PURPLE","PURPLE","VIOLET","VIOLET","INDIGO","INDIGO","MAROON","MAROON","AQUA","AQUA","TEAL","TEAL","BLACK","BLACK","GRAY","GRAY","WHITE","WHITE","GOLD","GOLD","SILVER","SILVER","BROWN","BROWN","LIME","LIME"};
        randomCard = new Random();
        getInput = new Scanner(System.in);
        board = new Card[6][6];
        module= 6;
            
        shuffle();
        setCells ();
        printCells();
        playGame();
      
    }
    
    public void playGame(){
        choosePairOfCards();
    }
    
    public void choosePairOfCards(){
        int row1, col1, row2, col2;
        System.out.println();
        System.out.println("Enter the number on the card.");
        System.out.print("First Card Choice?>");
        cardChoice1 =getInputAsInt();
        row1=cardChoice1/module;
        col1=cardChoice1%module;
        board[row1][col1].setShowingStatus();
        System.out.print("Second CardView Choice?>");
        System.out.print("\n");
        cardChoice2 =getInputAsInt();
        row2=cardChoice2/module ;
        col2=cardChoice2%module;
        board[row2][col2].setShowingStatus();
       
        System.out.print('\u000C'); // Clear the screen
        printCells();
        matchedCards(row1, col1, row2, col2);
        
    }
    
        // check the card to see if the "cards" match
        // if they don't call each card's setShowingStatus to "flip" them
    public void matchedCards(int row1, int col1, int row2, int col2){
        if(board[row1][col1].back == board[row2][col2].back){
            matched = true;
            board[row1][col1].matched = true;
            board[row2][col2].matched = true;
            System.out.println("You made a match!"); // cards stay flipped over for duration of the game
            playGame();
        }
        else 
            board[row1][col1].setShowingStatus();
            board[row2][col2].setShowingStatus();
            playGame();
   }
   
   public void setCells (){
       card = 0;//the front of the card
       for (int row=0; row<board.length;row++){
           for (int col=0; col<board[0].length;col++){
               {
               board[row][col]=new Card (words[card],card); // create a new card object
               card++;
               }
           }
       }
   }

   
   public void printCells(){
       for (int row=0; row<board.length;row++){
           for (int col=0; col<board[0].length;col++){
                board[row][col].showCard();
            }
       System.out.println();
       }    
   } 
    
        public void shuffle(){
        for(int a=0; a < words.length;a++);{
            int pos = randomCard.nextInt(words.length);
            String temp = words[card];
            words[card] = words[pos];
            words[pos] = temp;
        }
    }

    public int getInputAsInt(){
        String temp = getInput.nextLine();
        return Integer.parseInt(temp); 
    }

    public String getInputAsString(){
        return getInput.nextLine();
    }
}

    


     
     
     
     
     

    
