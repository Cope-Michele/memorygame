/*
 * This class works correctly! 
 */

package evamichele.memorygame.views;
import evamichele.memorygame.gamecreator.Game;
import evamichele.memorygame.control.MainMenuControl;
import evamichele.memorygame.control.Memorygame;
import evamichele.memorygame.control.Menu;
import evamichele.memorygame.exceptions.MenuException;
import evamichele.memorygame.enums.GameStatus;
import evamichele.memorygame.gamecreator.Player;

/**
 * @author Eva
 */

// first appears to the screen
// this is what you see when first open the program
// the main menu will have: Easy, Normal, and hard option
public class MainMenuView extends Menu {  //this class has a tight cohesion
    private String command;
    
    private static final String[][] menuItems = {
       // {"N", "Enter player names"},
        {"G", "Play Game"},
        {"H", "Help"},
        {"S", "Display Statistics"},
        {"X", "Exit Memory Game"},
    }; 
    
     MainMenuControl mainMenuControl=new MainMenuControl();

      
   
  
    public MainMenuView(){ 
        
        super(MainMenuView.menuItems);
    }
 

    @Override    
    public String executeCommands(Object object) throws MenuException{
       
          GameStatus gameStatus =    GameStatus.PLAYING;
   
          do {
              try { 
            this.display();           
           
            String command = this.getCommand();
            switch (command) {
                
                case "G":case "g":
                    // get number of players
                    OptionsMenuView optionMenu = new OptionsMenuView();
                    optionMenu.setWhatToDo("Player");
                    optionMenu.executeCommands(null);

                    // get the level
                    optionMenu.setWhatToDo("Level");
                    optionMenu.executeCommands(null);
       
                    // play the game.
                    try{
                    Game game = new Game();
                    game.startGame(optionMenu.getNumbPlayers(), optionMenu.getNumbLevel());
                    int somme = optionMenu.getNumbLevel()/(optionMenu.getNumbPlayers()-2);
                    }
                    catch (ArithmeticException e) {
                    System.out.println (
                             "\n\t______________________________________________________________________\n"
                     
                               + "\n \" This game is only available for one player for this semster,"
                               + " please choose the one player  option\"\""
                               +"\n\t______________________________________________________________________\n");
                    }
                    
                    Player statistic = new Player();
                    statistic.getWins();
                                       
                    break;
                case "H":case"h":
                    HelpMenuView helpMenu = Memorygame.getHelpMenu();
                    helpMenu.executeCommands(null);
                    break;
                case "S": case"s":
                    this.mainMenuControl.displayStatistics();
                    break;
                case "X":case"x":
                     gameStatus= GameStatus.EXIT;            
                 }
            }
            catch (MenuException error) {
                System.out.println("\n" + error.getMessage());
            }
            
     } while (gameStatus != GameStatus.EXIT);

        return Game.EXIT;
    }

    public void setCommand(String cmd){
        this.command = cmd;
    }
    public String setCommand(){
        return this.command;
    }
}
 
        
       
   
    

