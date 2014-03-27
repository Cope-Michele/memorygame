package evamichele.memorygame.views;

import java.util.Scanner;
import evamichele.memorygame.gamecreator.Game;
import evamichele.memorygame.control.Menu;
import evamichele.memorygame.control.MemoryGameError;
import evamichele.memorygame.gamecreator.Player;
import evamichele.memorygame.exceptions.MenuException;

/*
 * @author michelewhite
 */

public class OptionsMenuView extends Menu {
    private String whatToDo;
    private int numbPlayers;
    private int numblevel;    
    
    private final static String[][] menuItemsLevel = {
        {"1","Easy"},
        {"2","Medium"},
        {"3","Large"},
        {"Q","Quit"},
    };
    
    private final static String[][] menuItemsNumbPlayers = {
        {"1","One Player"},
        {"2","Two Player"},
        {"X","Quit Options Menu"},
    };
    
    public OptionsMenuView() {
        super(OptionsMenuView.menuItemsNumbPlayers);
    }
    
    @Override
    public String executeCommands(Object object) {
        //String gameStatus = Game.PLAYING;
        
        if (this.whatToDo.equalsIgnoreCase("Level")){
            try{
            this.setMenuItems(menuItemsLevel);                
            this.display();
            String command = this.getCommand();
            switch (command) {
                    case "1":
                        this.setNumbLevel(1);
                        break; 
                    case "2":
                        this.setNumbLevel(2);
                        break;
                     case "3":
                        this.setNumbLevel(3);
                        break;
                     case "X":
                         return Game.EXIT;
            }
            }
            catch (MenuException error) {
                System.out.println("\n" + error.getMessage());
            }
        }else if (this.whatToDo.equalsIgnoreCase("Player")){
            //LevelMenuView levelMenu = new LevelMenuView();
            try{
            this.setMenuItems(menuItemsNumbPlayers); 
            this.display();
            String command = this.getCommand();
            switch (command) {
                case "1": 
                   this.setNumbPlayers(1);
                   break;
                case "2":
                   this.setNumbPlayers(2);
                   break;
                 case "X":case"x":
                    return Game.EXIT;
                }
            }
            catch (MenuException error) {
                System.out.println("\n" + error.getMessage());
            }
        return Game.EXIT;
        }
        return null;
    }
    

        private Game createGame(String gameType) {
        Game game = null;
        Player playerA = null;
        Player playerB = null;
        
       if (gameType == null) {
           new MemoryGameError().display("MainCommands - create: gameType is null");
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

    public void setNumbLevel(int level){
        this.numblevel = level;
    }
    
    public int getNumbLevel(){
        return this.numblevel;
    }
    
    public void setNumbPlayers(int level){
        this.numbPlayers = level;
    }
    
    public int getNumbPlayers(){
        return this.numbPlayers;
    }
 
   public void setWhatToDo(String doing){
        this.whatToDo = doing;
    }
 
 
}


