/*
 * This class is done!
 */

package evamichele.memorygame.control;

import evamichele.memorygame.gamecreator.Game;
import evamichele.memorygame.views.OptionsMenuView;
import evamichele.memorygame.views.MainMenuView;
import evamichele.memorygame.views.HelpMenuView;
import evamichele.memorygame.views.GameMenuView;
import java.util.Scanner;
import evamichele.memorygame.gamecreator.Player;

/**
 * @author Eva
 */

public class Memorygame {
    private static final Scanner inFile = new Scanner(System.in);
    private static final HelpMenuView helpMenu = new HelpMenuView();
    private static final OptionsMenuView optionMenu = new OptionsMenuView();
    
    private static Player[] playerList;
    private static String name;
    private final static String instructions = "\n\t______________________________________________________________________\n"
                        + "\n\tMemory is the name of this game!"
                        + "\n\tThe purpose of the game is to clear the board of all cards by matching"
                        + "\n\teach card with its \"twin\" when the board is clear the game is over."
                        + "\n\tGood Luck!"
                        + "\n\t______________________________________________________________________";
    public Memorygame(){
    }
    public static Scanner getInputFile(){//creating Singleton
    return Memorygame.inFile;
    }
     public static HelpMenuView getHelpMenu() {
        return Memorygame.helpMenu;
    }
      public static OptionsMenuView getOptionMenu() {
        return Memorygame.optionMenu;
    }
    
                
    public static void main(String[] args) {
        //Memorygame myGame= new Memorygame();
        // get the users name
        getName();
        
        // display the instructions
        displayInstructions();
        
        // display main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.executeCommands(null);
        
        
        // get number of players
        OptionsMenuView optionMenu = new OptionsMenuView();
        optionMenu.setWhatToDo("Player");
        optionMenu.executeCommands(null);
        
        // get the level
        optionMenu.setWhatToDo("Level");
        optionMenu.executeCommands(null);
       
        // play the game. (Need to move this to the Game class)
        Game game = new Game("ONE_PLAYER");
        game.startGame(optionMenu.getNumbPlayers(), optionMenu.getNumbLevel()); 
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.executeCommands(null);
        
        Memorygame.inFile.close();
    }
  
    
    public static void getName() {
        Scanner inFile=Memorygame.getInputFile();
        System.out.println("Enter your name: ");
        name = inFile.next(); 
    }
    
    public static void displayInstructions() {
        System.out.println("\nWelcome " + name + "\n");
        System.out.println(Memorygame.instructions);
    }
   
    public static void setPlayerList(Player[] playerList) {
        Memorygame.playerList = playerList;
    }    
     
}
