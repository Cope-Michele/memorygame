/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evamichele.memorygame.control;

import evamichele.memorygame.enums.ErrorType;
import java.util.Scanner;
import evamichele.memorygame.interfaces.DisplayInfo;
import evamichele.memorygame.exceptions.MenuException;

/**
 *
 * @author Mpianatra
 */
public abstract class Menu implements DisplayInfo{
    
    private String[][] menuItems = null;

    public Menu() {
    }

    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
    
  
    public abstract String executeCommands(Object object) throws MenuException;
    
    public String[][] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }

    
    public final void display() {
        System.out.println("\n\t______________________________________________________________________\n");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\n\t______________________________________________________________________\n");
    }

    private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    protected final String getCommand() throws MenuException{

        // Scanner inFile = Memorygame.getInputFile();
        Scanner inFile = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
               throw new MenuException(ErrorType.ERROR3.getMessage());
                //continue;
            }                
            return command;
        
        } while (!valid);
    }
}
