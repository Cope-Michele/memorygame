package memorygame;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michelewhite
 */
public class GameMenuView  extends Menu {// do we need this class? when is this class appear?
    
    private Game game;
    private MainMenuControl mainMenuControl ;
    private MainMenuView mainMenuView = new MainMenuView();
    private final static String[][] menuItems = {
        {"T","Take your turn"},
        {"D", "Display the board"},
        {"N", "New Game"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };

    public GameMenuView(Game game) {
        this.game = game;
        this.mainMenuControl = new MainMenuControl();
    }

    
    
    public void getInput() {
   
        String command;
        Scanner inFile = new Scanner(System.in);

        do {    
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "T":
                    this.game.choosePairOfCards();
                    break;
                case "D":
                    this.game.printCells();
                    break;
                case "N":
                    this.mainMenuView.display();
                    break;
                case "H":
                    HelpMenuView helpMenu = Memorygame.getHelpMenu();
                    helpMenu.executeCommands(null);
                    break;
                case "Q":                   
                    break;
                default: 
                    new MemoryGameError().displayError("Invalid command. Please enter a valid command.");
                    continue;                              
            }
        } while (!command.equals("Q"));

        return;
    }
    


    @Override
    public String executeCommands(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}


