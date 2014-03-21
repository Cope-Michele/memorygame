/*
 * This class works correctly! 
 */

package evamichele.memorygame.views;
import evamichele.memorygame.gamecreator.Game;
import evamichele.memorygame.control.MainMenuControl;
import evamichele.memorygame.control.Memorygame;
import evamichele.memorygame.control.Menu;
import evamichele.memorygame.views.OptionsMenuView;

/**
 * @author Eva
 */

// first appears to the screen
// this is what you see when first open the program
// the main menu will have: Easy, Normal, and hard option
public class MainMenuView extends Menu {  //this class has a tight cohesion
    private String command;
    
    private static final String[][] menuItems = {
        {"N", "Enter player names"},
        {"G", "Game Menu options"},
        {"H", "Help"},
        {"S", "Display Statistics"},
        {"X", "Exit Memory Game"},
    }; 
    
     MainMenuControl mainMenuControl=new MainMenuControl();
    // OptionsMenuView optionMenuView= new OptionsMenuView();
      
   
  
    public MainMenuView(){ 
        
        super(MainMenuView.menuItems);
    }
 

    @Override
  
       
    public String executeCommands(Object object) {
       
          String gameStatus = Game.PLAYING;
   
          do {
            this.display();           
           
            String command = this.getCommand();
            switch (command) {
                case "N": case "n":
                    this.mainMenuControl.createPlayerList();    
                    break;
                case "G":case "m":
                    // get number of players
                    OptionsMenuView optionMenu = new OptionsMenuView();
                    optionMenu.setWhatToDo("Player");
                    optionMenu.executeCommands(null);

                    // get the level
                    optionMenu.setWhatToDo("Level");
                    optionMenu.executeCommands(null);
       
                    // play the game.
                    Game game = new Game("ONE_PLAYER");
                    game.startGame(optionMenu.getNumbPlayers(), optionMenu.getNumbLevel());
                    GameMenuView gameMenu = new GameMenuView();
                    gameMenu.executeCommands(game);
                    break;
                case "H":case"h":
                    HelpMenuView helpMenu = Memorygame.getHelpMenu();
                    helpMenu.executeCommands(null);
                    break;
                case "S": case"s":
                    this.mainMenuControl.displayStatistics();
                    break;
                case "X":case"x":
                    return Game.EXIT;              
            }
            
      } while (!gameStatus.equals(Game.EXIT));

        return Game.EXIT;
    }

    public void setCommand(String cmd){
        this.command = cmd;
    }
    public String setCommand(){
        return this.command;
    }
}
 
        
       
   
    

