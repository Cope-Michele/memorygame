package memorygame;
//I'm not sure if we actually need this class or not.  This class could be covered
//in our cardView or cardDeck classes.

import java.io.Serializable;


/**
 * @author Mpianatra
 */


public class Board implements Serializable{

    public Board() {
    
    }
    
    public void boardSize(){
  
    int easy [][];
    easy = new int[3][3];//board that holds 9 cards
    
    int medium[][];
    medium= new int [3][4];//board that holds 12 cards
    
    int large [][];
    large= new int [4][4];//board that holds 16 cards
    
    }

}
