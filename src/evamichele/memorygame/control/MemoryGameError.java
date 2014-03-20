/*
 * This class is done!
 */

package evamichele.memorygame.control;

import evamichele.memorygame.interfaces.DisplayInfo;
/**
 *
 * @author michelewhite
 */
public class MemoryGameError implements DisplayInfo{
    public Object display(Object object) {
        String message = (String) object;
        System.out.println("\n\t______________________________________________________________________");
        System.out.println("\n\t ERROR: Uh-Oh, Something isn't right!" + message);
        System.out.println("\n\t______________________________________________________________________");
        return null;
    }
}
