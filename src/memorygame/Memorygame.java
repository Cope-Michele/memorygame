/*
 * This class is done!
 */

package memorygame;

import java.util.Scanner;

/**
 * @author Eva
 */

public class Memorygame {
    private static final Scanner inFile = new Scanner(System.in);
    private static Player[] playerList;
    String name;
    private final static String instructions = "\n\t______________________________________________________________________"
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
                 
    public static void main(String[] args) {
        Memorygame myGame= new Memorygame();
        myGame.getName();
        
        myGame.displayHelp();
        
        MainMenuView mainMenu= new MainMenuView();
        mainMenu.getInput();
    }
    
    public void getName() {
        Scanner inFile=Memorygame.getInputFile();
        System.out.println("Enter your name: ");
        this.name = inFile.next(); 
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(Memorygame.instructions);
    }
   
    public static void setPlayerList(Player[] playerList) {
        Memorygame.playerList = playerList;
    }    
    
}
