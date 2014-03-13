/*
 * This class is done!
 */

package memorygame;

import java.util.Scanner;

/**
 * @author michelewhite
 *
 */
    public class OptionsMenuControl {
    private long noPlayer = 0;
    private long gameLevel = 0;
    
        public OptionsMenuControl(){
    
        }
      public void startGame(long noPlayers,long gameLevel) {
                
        if (noPlayers != 1  &&  noPlayers != 2) {
            new MemoryGameError().displayError("startGame - invalid number of players specified.");
            return;
        }
        
        Game game; // this command could use Switch I don't know how to do it
        if ((noPlayers == 1&& gameLevel==1)) {
        game = this.createGame(Game.ONE_PLAYER_GAME);// this is just a prototype
        }
        else if (noPlayers==1&& gameLevel==2){
            System.out.println("Game One PLayer Level 2");
            }
        
        else if (noPlayers==1&& gameLevel==3){
            System.out.println("Game One PLayer Level 3");
                    }
             
             
         
        // fro two player Game  
        else if (noPlayers==2&& gameLevel==1){
             game = this.createGame(Game.TWO_PLAYER_GAME);// this is just a prototype
            }
         else if (noPlayers==2&& gameLevel==2){
            System.out.println("Game Two PLayer Level 2");
                    }
        else if (noPlayers==2 && gameLevel==3){
            System.out.println("Game Two PLayer Level 3");
                    }
      }
              
                

      
    
        private Game createGame(String gameType) {
        Game game = null;
        Player playerA = null;
        Player playerB = null;
        
        if (gameType == null) {
            new MemoryGameError().displayError("MainCommands - create: gameType is null");
            return null;
        }
        
        if (gameType.equals(Game.ONE_PLAYER_GAME)) {
            game = new Game(Game.ONE_PLAYER_GAME);
            playerA = new Player(Player.MAIN_USER);
            playerA.name = "Player 1";
        }
        else if (gameType.equals(Game.TWO_PLAYER_GAME)) {
            game = new Game(Game.TWO_PLAYER_GAME);
            playerA = new Player(Player.MAIN_USER);
            playerA.name = "Player 1";
            playerB = new Player(Player.SECOND_USER);
            playerB.name = "Player 2";

        }

        // save the two players created as the default players of the game
        game.playerA = playerA;
        game.playerB = playerB; 
        
        // set the game status to game not yet in playing mode
        game.status = Game.NO_ACTIVE_GAME;
        
        return game;
    } 
    
    public String quitGame() {
        System.out.println("\n\tAre you sure you want to quit? (Y or N)");
        Scanner inFile = new Scanner(System.in);
        String answer = inFile.next().trim().toUpperCase();
        if (answer.equals("Y")) {
            return Game.EXIT;
        }

        return Game.PLAYING;
    }
    
 
}

     /*   public void displayNumberCards(){
            System.out.println();
            displayOptionsBorder();
            System.out.println("\t You have selected to play a game using cards that have number faces.\n");
             new Game().playGame(); 
            // game = this.createGame(Game.ONE_PLAYER_GAME);
        }
    
        public void displayColorCards(){
            System.out.println();
            displayOptionsBorder();
            System.out.println("\t You have selected to play a game using cards that have color faces.\n");
        }
        
        public void displayOptionsBorder (){
            System.out.println(
            "\n\t______________________________________________________________________");
    }
}
*/