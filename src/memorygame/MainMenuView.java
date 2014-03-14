/*
 * This class works correctly! 
 */

package memorygame;
import java.util.Scanner;

/**
 * @author Eva
 */

// first appears to the screen
// this is what you see when first open the program
// the main menu will have: Easy, Normal, and hard option
public class MainMenuView extends Menu {  //this class has a tight cohesion
       
    private static final String[][] menuItems = {
        {"N", "Enter player names"},
        {"M", "Game Menu options"},
       // {"2", "Two player game"},
        {"H", "Help"},
        {"S", "Display Statistics"},
        {"X", "Exit Memory Game"},
    }; 
    
     MainMenuControl mainMenuControl=new MainMenuControl();
     OptionsMenuView optionMenuView= new OptionsMenuView();
   
  
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
                case "N":
                    this.mainMenuControl.createPlayerList();
                    
                    break;
                case "M":
                   this.optionMenuView.display();
                    break;
                case "H":
                    HelpMenuView helpMenu = Memorygame.getHelpMenu();
                    helpMenu.executeCommands(null);
                    break;
                case "S":
                    this.mainMenuControl.displayStatistics();
                    break;
                case "X":
                    return Game.EXIT;
                 
                                
            }
      } while (!gameStatus.equals(Game.EXIT));

        return Game.EXIT;
    }

    
    }
 
        
       
   
    

