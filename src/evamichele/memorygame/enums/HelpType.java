/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evamichele.memorygame.enums;

/**
 *
 * @author jacksonrkj
 */
public enum HelpType {
        OBJECTIVE ("  The objective of the game is to be the first player to mark three "
                + "squares vertically, horizontally or diagonally. \n\n  Each player takes "
                + "turns placing their marker in one of the locations on the "
                + "board. \n\n  The first player to get \"three-in-a-row\" is the winner."),
        
             
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
