/*
 * This class is done!
 */

package memorygame;

import java.util.Scanner;

/*
 * @author michelewhite
 */

public class OptionsMenuView extends Menu {
    
    private final static String[][] menuItems = {
     
       {"1","One Player"},
        {"2","Two Player"},
        {"Q","Quit Options Menu"},
    };
    
    
    public OptionsMenuView() {
        super(OptionsMenuView.menuItems);
    }
    
    @Override
    public String executeCommands(Object object) {
        String gameStatus = Game.PLAYING;
       
           
        do {
            this.display();
                     
            String command = this.getCommand();
            switch (command) {

                case "1":case "2":
                   LevelMenuView levelMenu = Memorygame.getLevelpMenu();
                    levelMenu.executeCommands(null);
                   break;
                 case "X":
                    return Game.EXIT;
                 
                                
            }
        } while (!gameStatus.equals(Game.EXIT));

        return Game.EXIT;
    }
   
}


