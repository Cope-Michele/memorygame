/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evamichele.memorygame.enums;

/**
 *
 * @author eva
 */
public enum HelpType {
        OBJECTIVE ("  The objective of the game is match each card to its twin card "
                + "hidden within the card grid. \n\n  Each player takes "
                + "turns flipping over two cards at a time. "
                + "\n\n  The player with the most matches at the end of the game wins."),
        
             
        ONE_PERSON_GAME ( "    You have 115 points.\n\n"
            +"  Your points is substructed when you make a move\n\n"
            +"  Try to finish the game with just few moves."),

        TWO_PERSON_GAME (" You compete against the computer.\n\n"
                +" The one that has the most matches at the end of the game wins!\n\n");

        
        String helpText;

    private HelpType(String helpText) {
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }
    
    

}
