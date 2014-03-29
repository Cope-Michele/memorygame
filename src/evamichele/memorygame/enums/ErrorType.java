/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evamichele.memorygame.enums;

/**
 *
 * @author michelewhite
 */
public enum ErrorType {
    ERROR1 ("You can't pick the same exact card... \n Please Try again"),
    
    ERROR2 ("You must enter 2 different card numbers, "
              + "or a \"Q\" to quit. Try again."),
    
    ERROR3 ("Invalid command. Please enter a valid command."),
    
    ERROR4 ("You must start a new game first."),
    
    ERROR5 ("You must enter a name or enter a \"Q\" to quit. Try again."),
    
    ERROR6 ("The game parameter is null."),
    
    ERROR7 ("You must enter two numbers, a row and the column, "
              + "or a \"Q\" to quit. Try again."),
    
    ERROR8 ("No empty locations found on the board"),
    
    ERROR9 ("This location is already occupied. Try a different "
              + "location."),
    
    ERROR10 ("Enter a non-blank character for the player's marker."),
    
    ERROR11 ("invalid number of players specified."
                    + "Please select either a 1 or 2 player game."),
    
    ERROR12 ("Two Player game is not currently available,"
              + "please choose a one player game"), 
    
    ERROR13 ("The number of rows must be between 3 - 9 and the "
              + "number of columns must be between 3 - 9 "),
    
    ERROR14 ("GameCommands - takeTurn: invalidPlayerTYpe");

    
    String message;
    
    ErrorType(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }

    
    public static void displayErorrMsg(String errorMessage) {
        String fullMessage = "\t+ ERROR: " + errorMessage + " +";
        int dividerLineLength = fullMessage.length();
        StringBuilder dividerLine = new StringBuilder(dividerLineLength);
        for (int i = 0; i < dividerLineLength; i++) {
            dividerLine.insert(i, '+');
        }
        System.out.println("\t" + dividerLine.toString());
        System.out.println(fullMessage);
        System.out.println("\t" + dividerLine.toString());
    }
}
