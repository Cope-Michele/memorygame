package evamichele.memorygame.views;

import java.util.Scanner;
import evamichele.memorygame.gamecreator.Game;
import evamichele.memorygame.control.Menu;
import evamichele.memorygame.control.MemoryGameError;
import evamichele.memorygame.gamecreator.Player;
import evamichele.memorygame.exceptions.MenuException;
import evamichele.memorygame.enums.GameStatus;

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
          GameStatus gameStatus =    GameStatus.PLAYING;
        
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
                         gameStatus= GameStatus.QUIT;
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
                   gameStatus= GameStatus.QUIT;
                }
            }
            catch (MenuException error) {
                System.out.println("\n" + error.getMessage());
            }
        return Game.EXIT;
        }
        return null;
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


