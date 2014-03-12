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
public class MainMenuView {  //this class has a tight cohesion
       
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
   OptionsMenuControl optionsMenuControl= new OptionsMenuControl();
  
    public MainMenuView(){  
    
    }
   
     public void getInput(){
        String command;
        Scanner inFile=new Scanner(System.in);
        do {
            this.display();           
           
            command= inFile.nextLine();
            command=command.trim().toUpperCase();
         
            switch (command) {
                case "N":
                    this.mainMenuControl.createPlayerList();
                    
                    break;
                case "M":
                   this.optionMenuView.getInput();
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();
                    break;
                case "S":
                    this.mainMenuControl.displayStatistics();
                    break;
                case "X":
                    this.optionsMenuControl.quitGame();
                    break;
                 
                default: 
                    new MemoryGameError().displayError("Invalid command. Please enter a valid command.");
                continue;                    
            }
        } while (!command.equals("X"));

        return;
    }
    
    public final void display() {
        System.out.println("\n\t______________________________________________________________________");
        System.out.println("\n\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\n\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\n\t______________________________________________________________________");
    }
}
        
       
   
    

