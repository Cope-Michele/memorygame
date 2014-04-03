/*
 * This class is done!
 */

package evamichele.memorygame.control;

import evamichele.memorygame.enums.ErrorType;
import evamichele.memorygame.exceptions.MenuException;
import evamichele.memorygame.frames.MainFrame;
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
    public static MainFrame mainFrame = null;
    public static final Scanner inFile = new Scanner(System.in);
    private static final HelpMenuView helpMenu = new HelpMenuView();
    private static final OptionsMenuView optionMenu = new OptionsMenuView();
    
//    private static Player[] playerList;
    private static String name;
    private final static String instructions = "\n\t______________________________________________________________________\n"
                        + "\n\tMemory is the name of this game!"
                        + "\n\tThe purpose of the game is to clear the board of all cards by matching"
                        + "\n\teach card with its \"twin\" when the board is clear the game is over."
                        + "\n\tGood Luck!"
                        + "\n\t______________________________________________________________________";

    static void setPlayerList(Player[] playerList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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
    
                
    public static void main (String[] args) {
        Memorygame memoryGame = null;
       
       /* getCommand();
        displayInstructions();
        MainMenuView mainMenu = new MainMenuView();*/
        
            try {
                memoryGame = new Memorygame();
            //mainMenu.executeCommands(null);  /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Memorygame.mainFrame = new MainFrame();
                    Memorygame.mainFrame.setVisible(true);
                }
            });
        
        }
            
            
            
     catch (Throwable ex) {     
            ErrorType.displayErorrMsg("Unexpected error: " + ex.getMessage());
            ErrorType.displayErorrMsg(ex.getStackTrace().toString());           
        } 
        finally {
            if (Memorygame.mainFrame != null) {
                Memorygame.mainFrame.dispose();
            }
        }
            }
      /*  catch (MenuException error) {
                System.out.println("\n" + error.getMessage());
                }
        finally{
        Memorygame.inFile.close();
        }*/
           
    
  
    public static void getCommand() {
        Scanner inFile=Memorygame.getInputFile();
        System.out.println("Enter your name: ");
        name = inFile.next(); 
    }
   
    public static void displayInstructions() {
        System.out.println("\nWelcome " + name + "\n");
        System.out.println(Memorygame.instructions);
    }
}
  

