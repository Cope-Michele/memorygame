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
        {"X","Quit Options Menu"},
    };
    LevelMenuView levelmenu= new LevelMenuView();
    
    
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

                case "1":
                System.out.println("dfsdfs");
                case "2":
                    this.levelmenu.display();
                   //LevelMenuView levelMenu = Memorygame.getLevelpMenu();
                    //levelMenu.executeCommands(null);
                   break;
                 case "X":case"x":
                    return Game.EXIT;
                 
                                
            }
        } while (!gameStatus.equals(Game.EXIT));

        return Game.EXIT;
    }
   
}


