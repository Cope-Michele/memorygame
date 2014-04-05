/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evamichele.memorygame.exceptions;

/**
 *
 * @author Mpianatra
 */
public class MemorygameException extends Exception {

   
    public MemorygameException() {
    }

    
    public MemorygameException(String msg) {
        super(msg);
    }

   

    public MemorygameException(String message, Throwable cause) {
        super(message, cause);
    }

    public MemorygameException(Throwable cause) {
        super(cause);
    }
    
}