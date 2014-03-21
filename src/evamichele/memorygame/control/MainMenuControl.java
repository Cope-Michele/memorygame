/*
 * This class is done!
 */

package evamichele.memorygame.control;

import java.util.Scanner;
import evamichele.memorygame.gamecreator.Player;
import evamichele.memorygame.gamecreator.PlayerView;

/**
 * @author Mpianatra
 */
public class MainMenuControl {
    
    public void createPlayerList() {
        PlayerView playerView = new PlayerView();
        String[] playerNameList = playerView.getInput();
        
        // creates and adds players to list
        Player[] playerList = new Player[playerNameList.length];
                               
        for (int i = 0; i < playerList.length; i++) {
            String playersName = playerNameList[i];
            Player newPlayer = new Player();
            newPlayer.name = playersName;
            playerList[i] = newPlayer;          
        }
        
        Memorygame.setPlayerList(playerList);
        
    }
      
   
    public void displayStatistics(){
        Player player = new Player();
        //player.getTotalPoints();
    }
}

