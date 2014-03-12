/*
 * This class is done!
 */

package memorygame;

import java.util.Scanner;

/*
 * @author michelewhite
 */

public class OptionsMenuView {
    
    private final static String[][] menuChoices = {
     
       {"1","One Player"},
        {"2","Two Player"},
        {"Q","Quit Options Menu"},
    };
     private final static String[][] levelChoices = {
        
       {"1","Easy"},
        {"2","Medium"},
        {"3","Large"},
        {"Q","Quit"},
    };
    
    private OptionsMenuControl optionsMenuControl = new OptionsMenuControl();
    
    //public OptionsMenuView(){
    
    //}
    
    public void getInput(){
    
        String userCommand;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.displayOption();
            
            userCommand = inFile.nextLine();
            userCommand = userCommand.trim().toUpperCase();
            
            switch (userCommand) {

                case "1":
                    this.getLevelInput();
                    break;
                case "2":
                    this.getLevelInput();
                    break;
                case "Q":
                    break;
                default: 
                    new MemoryGameError().displayError(" You Entered an Invalid command. Please enter a valid command.");
                   continue;
            
            }
        } while (!userCommand.equals("Q"));  
             return;
    }
     public void getLevelInput(){
    
        String userCommandLevel;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.displayGameLevelChoice();
            
            userCommandLevel = inFile.nextLine();
            userCommandLevel = userCommandLevel.trim().toUpperCase();
            
            switch (userCommandLevel) {

                case "1":
                    this.optionsMenuControl.startGame(1,1);// What should we do so the value of userCommandLevel 
                    //would be sent to StartGame() and cast to Int 
                   
                    break;
                case "2":
                    this.optionsMenuControl.startGame(1,2);
                  
                    break;
                case "3":
                    this.optionsMenuControl.startGame(1,3);;
                   
                    break;
                case "Q":
                    break;
                default: 
                    new MemoryGameError().displayError(" You Entered an Invalid command. Please enter a valid command.");
                    continue;
            
            }
        } while (!userCommandLevel.equals("Q"));  
             return ;
    }
    
    
    public void displayOption() {
        System.out.println("\n\t______________________________________________________________________");
        System.out.println("\n\tEnter the letter associated with one of the commands.\n");
        
        for (int i = 0; i < OptionsMenuView.menuChoices.length; i++) {
            System.out.println("\n\t " +menuChoices[i][0] + "\t" + menuChoices [i][1]);
        }         
        System.out.println("\n\t______________________________________________________________________");        
    }
    public void displayGameLevelChoice(){
         System.out.println("\n\t______________________________________________________________________");
        System.out.println("\n\tEnter the letter associated with one of the commands.\n");
        
        for (int i = 0; i < OptionsMenuView.levelChoices.length; i++) {
            System.out.println("\n\t " +levelChoices[i][0] + "\t" + levelChoices[i][1]);
        }         
        System.out.println("\n\t______________________________________________________________________");  
    
    }
    
}

