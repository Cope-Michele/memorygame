/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evamichele.memorygame.control;

import evamichele.memorygame.enums.ErrorType;
import evamichele.memorygame.enums.HelpType;
import evamichele.memorygame.exceptions.MemorygameException;





/**
 *
 * @author jacksonrkj
 */
public class HelpMenuControl {
    
    public String getHelpText(HelpType command) throws MemorygameException {
        String helpText = "";
        switch (command) {
            case OBJECTIVE:
            case ONE_PERSON_GAME:
            case TWO_PERSON_GAME:
            
                helpText = command.getHelpText();
                break;
            default:
                throw new MemorygameException(ErrorType.ERROR3 .getMessage());
        }

        return helpText;
    }
    
}
