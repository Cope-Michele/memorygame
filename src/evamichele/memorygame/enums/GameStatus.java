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
public enum GameStatus {
  

  CONTINUE ("CONTINUE"),
    NEW_GAME ("NEW_GAME"),
    PLAYING ("PLAYING"), 
    WINNER ("WINNER"), 
    TIE ("TIE"), 
    QUIT ("QUIT"), 
    ERROR ("ERROR"),
    EXIT ("EXIT"),
     NO_ACTIVE_GAME("NO_ACTIVE_GAME"),
    NEWGAME("NEW_GAME"),
    OBJECTIVE("OBJECTIVE"),
    ONE_PLAYER_GAME("ONE_PLAYER_GAME"),
    TWO_PLAYER_GAME("TWO_PLAYER_GAME"),
    MAIN_USER("MAIN_USER"),
    SECOND_USER("SECOND_USER"),
    PLAYER_ONE("PLAYER_ONE"),
    PLAYER_TWO("PLAYER_TWO");
    
    String value;
    
    GameStatus(String value) {
        this.value = value;   
    }
    
    public String getValue() {
        return value;
    }
}