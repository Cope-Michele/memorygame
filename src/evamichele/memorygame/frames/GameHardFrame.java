/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evamichele.memorygame.frames;

import evamichele.memorygame.gamecreator.Card;
import evamichele.memorygame.gamecreator.Game;

/**
 *
 * @author Mpianatra
 */
public class GameHardFrame extends javax.swing.JFrame {
    public Card [][] cards;
    private int prevSelectedCardRow = -1;
    private int prevSelectedCardCol = -1;
    private Game game;

    public GameHardFrame(Game game) {
        initComponents();
        game.GameHard();
        cards = game.getBoard();   
        card1.setText(Integer.toString(cards[0][0].getFront()));
        card2.setText(Integer.toString(cards[0][1].getFront()));
        card3.setText(Integer.toString(cards[0][2].getFront()));
        card4.setText(Integer.toString(cards[0][3].getFront()));
        card5.setText(Integer.toString(cards[0][4].getFront()));
        card6.setText(Integer.toString(cards[0][5].getFront()));
        card7.setText(Integer.toString(cards[1][0].getFront()));
        card8.setText(Integer.toString(cards[1][1].getFront()));
        card9.setText(Integer.toString(cards[1][2].getFront()));
        card10.setText(Integer.toString(cards[1][3].getFront()));
        card11.setText(Integer.toString(cards[1][4].getFront()));
        card13.setText(Integer.toString(cards[1][5].getFront()));
        card13.setText(Integer.toString(cards[2][0].getFront()));
        card14.setText(Integer.toString(cards[2][1].getFront()));
        card15.setText(Integer.toString(cards[2][2].getFront()));
        card16.setText(Integer.toString(cards[2][3].getFront()));
        card17.setText(Integer.toString(cards[2][4].getFront()));
        card18.setText(Integer.toString(cards[2][5].getFront()));
        card19.setText(Integer.toString(cards[3][0].getFront()));
        card20.setText(Integer.toString(cards[3][1].getFront()));
        card21.setText(Integer.toString(cards[3][2].getFront()));
        card22.setText(Integer.toString(cards[3][3].getFront()));
        card23.setText(Integer.toString(cards[3][4].getFront()));
        card24.setText(Integer.toString(cards[3][5].getFront()));
        card25.setText(Integer.toString(cards[4][0].getFront()));
        card26.setText(Integer.toString(cards[4][1].getFront()));
        card27.setText(Integer.toString(cards[4][2].getFront()));
        card28.setText(Integer.toString(cards[4][3].getFront()));
        card29.setText(Integer.toString(cards[4][4].getFront()));
        card30.setText(Integer.toString(cards[4][5].getFront()));
        card31.setText(Integer.toString(cards[5][0].getFront()));
        card32.setText(Integer.toString(cards[5][1].getFront()));
        card33.setText(Integer.toString(cards[5][2].getFront()));
        card34.setText(Integer.toString(cards[5][3].getFront()));
        card35.setText(Integer.toString(cards[5][4].getFront()));
        card36.setText(Integer.toString(cards[5][5].getFront()));
        
        this.game = game;
    }

    GameHardFrame() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     public void flipCard(int row, int col){
        
        if (prevSelectedCardRow == -1 && prevSelectedCardCol == -1){
            prevSelectedCardRow = row;
            prevSelectedCardCol = col;
            cards[row][col].setShowing(true);
            updateButtons();
        }
        else if ( prevSelectedCardRow != -1 && prevSelectedCardCol != -1){
            cards[row][col].setShowing(true);
            updateButtons();
            this.game.matchedCards( cards[prevSelectedCardRow][prevSelectedCardCol], cards[row][col]);
            scoreLabel.setText(Integer.toString(this.game.getScore()));
            //update the score in the UI
            prevSelectedCardRow = -1;
            prevSelectedCardCol = -1;
        }        
    }
     
    public void updateButtons() {
        if ( cards[0][0].isShowing()){
            card1.setText(cards[0][0].getBack());
        }
        else { 
            card1.setText(Integer.toString(cards[0][0].getFront()));
        }
        
        if ( cards[0][1].isShowing()){
            card2.setText(cards[0][1].getBack());
        }
        else { 
            card2.setText(Integer.toString(cards[0][1].getFront()));
        } 
        
        if ( cards[0][2].isShowing()){
            card3.setText(cards[0][2].getBack());
        }
        else { 
            card3.setText(Integer.toString(cards[0][2].getFront()));
        }
        
         if ( cards[0][3].isShowing()){
            card4.setText(cards[0][3].getBack());
        }
        else { 
            card4.setText(Integer.toString(cards[0][3].getFront()));
        }
        
        if ( cards[0][4].isShowing()){
            card5.setText(cards[0][4].getBack());
        }
        else { 
            card5.setText(Integer.toString(cards[0][4].getFront()));
        } 
        
        if ( cards[0][5].isShowing()){
            card6.setText(cards[0][5].getBack());
        }
        else { 
            card6.setText(Integer.toString(cards[0][5].getFront()));
        } 
        
        if ( cards[1][0].isShowing()){
            card7.setText(cards[1][0].getBack());
        }
        else { 
            card7.setText(Integer.toString(cards[1][0].getFront()));
        }
         
        if ( cards[1][1].isShowing()){
            card8.setText(cards[1][1].getBack());
        }
        else { 
            card8.setText(Integer.toString(cards[1][1].getFront()));
        }
        
        if ( cards[1][2].isShowing()){
            card9.setText(cards[1][2].getBack());
        }
        else { 
            card9.setText(Integer.toString(cards[1][2].getFront()));
        }
        
        if ( cards[1][3].isShowing()){
            card10.setText(cards[1][3].getBack());
        }
        else { 
            card10.setText(Integer.toString(cards[1][3].getFront()));
        }
         
        if ( cards[1][4].isShowing()){
            card11.setText(cards[1][4].getBack());
        }
        else { 
            card11.setText(Integer.toString(cards[1][4].getFront()));
        }
        
        if ( cards[1][5].isShowing()){
            card12.setText(cards[1][5].getBack());
        }
        else { 
            card12.setText(Integer.toString(cards[1][5].getFront()));
        }
        
        if ( cards[2][0].isShowing()){
            card13.setText(cards[2][0].getBack());
        }
        else { 
            card13.setText(Integer.toString(cards[2][0].getFront()));
        }
        
        if ( cards[2][1].isShowing()){
            card14.setText(cards[2][1].getBack());
        }
        else { 
            card14.setText(Integer.toString(cards[2][1].getFront()));
        }
        
        if ( cards[2][2].isShowing()){
            card15.setText(cards[2][2].getBack());
        }
        else { 
            card15.setText(Integer.toString(cards[2][2].getFront()));
        }
        
        if ( cards[2][3].isShowing()){
            card16.setText(cards[2][3].getBack());
        }
        else { 
            card16.setText(Integer.toString(cards[2][3].getFront()));
        }
        
        if ( cards[2][4].isShowing()){
            card17.setText(cards[2][4].getBack());
        }
        else { 
            card17.setText(Integer.toString(cards[2][4].getFront()));
        }
        
        if ( cards[2][5].isShowing()){
            card18.setText(cards[2][5].getBack());
        }
        else { 
            card18.setText(Integer.toString(cards[2][5].getFront()));
        }
        
        if ( cards[3][0].isShowing()){
            card19.setText(cards[3][0].getBack());
        }
        else { 
            card19.setText(Integer.toString(cards[3][0].getFront()));
        }
        
        if ( cards[3][1].isShowing()){
            card20.setText(cards[3][1].getBack());
        }
        else { 
            card20.setText(Integer.toString(cards[3][1].getFront()));
        }
        
        if ( cards[3][2].isShowing()){
            card21.setText(cards[3][2].getBack());
        }
        else { 
            card21.setText(Integer.toString(cards[3][2].getFront()));
        }
        
        if ( cards[3][3].isShowing()){
            card22.setText(cards[3][3].getBack());
        }
        else { 
            card22.setText(Integer.toString(cards[3][3].getFront()));
        }
        
        if ( cards[3][4].isShowing()){
            card23.setText(cards[3][4].getBack());
        }
        else { 
            card23.setText(Integer.toString(cards[3][4].getFront()));
        }
        
        if ( cards[3][5].isShowing()){
            card24.setText(cards[3][5].getBack());
        }
        else { 
            card24.setText(Integer.toString(cards[3][5].getFront()));
        }
        
        if ( cards[4][0].isShowing()){
            card25.setText(cards[4][0].getBack());
        }
        else { 
            card25.setText(Integer.toString(cards[4][0].getFront()));
        }
        
        if ( cards[4][1].isShowing()){
            card26.setText(cards[4][1].getBack());
        }
        else { 
            card26.setText(Integer.toString(cards[4][1].getFront()));
        }
        
        if ( cards[4][2].isShowing()){
            card27.setText(cards[4][2].getBack());
        }
        else { 
            card27.setText(Integer.toString(cards[4][2].getFront()));
        }
        
        if ( cards[4][3].isShowing()){
            card28.setText(cards[4][3].getBack());
        }
        else { 
            card28.setText(Integer.toString(cards[4][3].getFront()));
        }
        
        if ( cards[4][4].isShowing()){
            card29.setText(cards[4][4].getBack());
        }
        else { 
            card29.setText(Integer.toString(cards[4][4].getFront()));
        }
        
        if ( cards[4][5].isShowing()){
            card30.setText(cards[4][5].getBack());
        }
        else { 
            card30.setText(Integer.toString(cards[4][5].getFront()));
        }
        
        if ( cards[5][0].isShowing()){
            card31.setText(cards[5][0].getBack());
        }
        else { 
            card31.setText(Integer.toString(cards[5][0].getFront()));
        }
        
        if ( cards[5][1].isShowing()){
            card32.setText(cards[5][1].getBack());
        }
        else { 
            card32.setText(Integer.toString(cards[5][1].getFront()));
        }
        
        if ( cards[5][2].isShowing()){
            card33.setText(cards[5][2].getBack());
        }
        else { 
            card33.setText(Integer.toString(cards[5][2].getFront()));
        }
        
        if ( cards[5][3].isShowing()){
            card34.setText(cards[5][3].getBack());
        }
        else { 
            card34.setText(Integer.toString(cards[5][3].getFront()));
        }
        
        if ( cards[5][4].isShowing()){
            card35.setText(cards[5][4].getBack());
        }
        else { 
            card35.setText(Integer.toString(cards[5][4].getFront()));
        }
        
        if ( cards[5][5].isShowing()){
            card36.setText(cards[5][5].getBack());
        }
        else { 
            card36.setText(Integer.toString(cards[5][5].getFront()));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGamePanel = new javax.swing.JPanel();
        jGameLabel = new javax.swing.JLabel();
        jNewGame = new javax.swing.JButton();
        jHelp = new javax.swing.JButton();
        jExit = new javax.swing.JButton();
        card1 = new javax.swing.JButton();
        card2 = new javax.swing.JButton();
        card3 = new javax.swing.JButton();
        card4 = new javax.swing.JButton();
        card7 = new javax.swing.JButton();
        card8 = new javax.swing.JButton();
        card9 = new javax.swing.JButton();
        card10 = new javax.swing.JButton();
        card13 = new javax.swing.JButton();
        card14 = new javax.swing.JButton();
        card15 = new javax.swing.JButton();
        card16 = new javax.swing.JButton();
        card5 = new javax.swing.JButton();
        card6 = new javax.swing.JButton();
        card11 = new javax.swing.JButton();
        card12 = new javax.swing.JButton();
        card17 = new javax.swing.JButton();
        card18 = new javax.swing.JButton();
        card19 = new javax.swing.JButton();
        card36 = new javax.swing.JButton();
        card20 = new javax.swing.JButton();
        card21 = new javax.swing.JButton();
        card22 = new javax.swing.JButton();
        card23 = new javax.swing.JButton();
        card24 = new javax.swing.JButton();
        card25 = new javax.swing.JButton();
        card26 = new javax.swing.JButton();
        card27 = new javax.swing.JButton();
        card28 = new javax.swing.JButton();
        card29 = new javax.swing.JButton();
        card30 = new javax.swing.JButton();
        card31 = new javax.swing.JButton();
        card32 = new javax.swing.JButton();
        card33 = new javax.swing.JButton();
        card34 = new javax.swing.JButton();
        card35 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jGamePanel.setBackground(new java.awt.Color(204, 255, 255));
        jGamePanel.setForeground(new java.awt.Color(204, 255, 255));

        jGameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jGameLabel.setText("Memory Game");

        jNewGame.setText("New Game");
        jNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNewGameMouseClicked(evt);
            }
        });

        jHelp.setText("Help");
        jHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHelpActionPerformed(evt);
            }
        });

        jExit.setText("Exit");
        jExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExitMouseClicked(evt);
            }
        });

        card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card1ActionPerformed(evt);
            }
        });

        card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card2ActionPerformed(evt);
            }
        });

        card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card3ActionPerformed(evt);
            }
        });

        card4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card4ActionPerformed(evt);
            }
        });

        card7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card7ActionPerformed(evt);
            }
        });

        card8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card8ActionPerformed(evt);
            }
        });

        card9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card9ActionPerformed(evt);
            }
        });

        card10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card10ActionPerformed(evt);
            }
        });

        card13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card13ActionPerformed(evt);
            }
        });

        card14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card14ActionPerformed(evt);
            }
        });

        card15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card15ActionPerformed(evt);
            }
        });

        card16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card16ActionPerformed(evt);
            }
        });

        card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card5ActionPerformed(evt);
            }
        });

        card6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card6ActionPerformed(evt);
            }
        });

        card11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card11ActionPerformed(evt);
            }
        });

        card12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card12ActionPerformed(evt);
            }
        });

        card17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card17ActionPerformed(evt);
            }
        });

        card18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card18ActionPerformed(evt);
            }
        });

        card19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card19ActionPerformed(evt);
            }
        });

        card36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card36ActionPerformed(evt);
            }
        });

        card20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card20ActionPerformed(evt);
            }
        });

        card21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card21ActionPerformed(evt);
            }
        });

        card22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card22ActionPerformed(evt);
            }
        });

        card23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card23ActionPerformed(evt);
            }
        });

        card24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card24ActionPerformed(evt);
            }
        });

        card25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card25ActionPerformed(evt);
            }
        });

        card26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card26ActionPerformed(evt);
            }
        });

        card27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card27ActionPerformed(evt);
            }
        });

        card28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card28ActionPerformed(evt);
            }
        });

        card29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card29ActionPerformed(evt);
            }
        });

        card30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card30ActionPerformed(evt);
            }
        });

        card31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card31ActionPerformed(evt);
            }
        });

        card32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card32ActionPerformed(evt);
            }
        });

        card33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card33ActionPerformed(evt);
            }
        });

        card34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card34ActionPerformed(evt);
            }
        });

        card35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card35ActionPerformed(evt);
            }
        });

        jLabel1.setText("Score:");

        javax.swing.GroupLayout jGamePanelLayout = new javax.swing.GroupLayout(jGamePanel);
        jGamePanel.setLayout(jGamePanelLayout);
        jGamePanelLayout.setHorizontalGroup(
            jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jGamePanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addComponent(card13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addComponent(card17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addComponent(card31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addComponent(card35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addComponent(card23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addComponent(card29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addComponent(card19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addComponent(card25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(43, 43, 43)
                                .addComponent(scoreLabel))
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNewGame))))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jGamePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
            .addGroup(jGamePanelLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jGameLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jGamePanelLayout.setVerticalGroup(
            jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jGamePanelLayout.createSequentialGroup()
                .addComponent(jGameLabel)
                .addGap(18, 18, 18)
                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(scoreLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addComponent(jNewGame)
                                .addGap(14, 14, 14)
                                .addComponent(jHelp)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card22, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card26, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card28, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card27, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card25, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card32, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card34, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card33, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card31, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(card24, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(card23, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(card30, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(card29, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jExit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card36, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card35, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void card35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card35ActionPerformed
        flipCard(5,4);
    }//GEN-LAST:event_card35ActionPerformed

    private void card34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card34ActionPerformed
        flipCard(5,3);
    }//GEN-LAST:event_card34ActionPerformed

    private void card33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card33ActionPerformed
        flipCard(5,2);
    }//GEN-LAST:event_card33ActionPerformed

    private void card32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card32ActionPerformed
        flipCard(5,1);
    }//GEN-LAST:event_card32ActionPerformed

    private void card31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card31ActionPerformed
        flipCard(5,0);
    }//GEN-LAST:event_card31ActionPerformed

    private void card30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card30ActionPerformed
        flipCard(4,5);
    }//GEN-LAST:event_card30ActionPerformed

    private void card29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card29ActionPerformed
        flipCard(4,4);
    }//GEN-LAST:event_card29ActionPerformed

    private void card28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card28ActionPerformed
        flipCard(4,3);
    }//GEN-LAST:event_card28ActionPerformed

    private void card27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card27ActionPerformed
        flipCard(4,2);
    }//GEN-LAST:event_card27ActionPerformed

    private void card26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card26ActionPerformed
        flipCard(4,1);
    }//GEN-LAST:event_card26ActionPerformed

    private void card25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card25ActionPerformed
        flipCard(4,0);
    }//GEN-LAST:event_card25ActionPerformed

    private void card24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card24ActionPerformed
        flipCard(3,5);
    }//GEN-LAST:event_card24ActionPerformed

    private void card23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card23ActionPerformed
        flipCard(3,4);
    }//GEN-LAST:event_card23ActionPerformed

    private void card22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card22ActionPerformed
        flipCard(3,3);
    }//GEN-LAST:event_card22ActionPerformed

    private void card21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card21ActionPerformed
        flipCard(3,2);
    }//GEN-LAST:event_card21ActionPerformed

    private void card20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card20ActionPerformed
        flipCard(3,1);
    }//GEN-LAST:event_card20ActionPerformed

    private void card36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card36ActionPerformed
        flipCard(5,5);
    }//GEN-LAST:event_card36ActionPerformed

    private void card19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card19ActionPerformed
        flipCard(3,0);
    }//GEN-LAST:event_card19ActionPerformed

    private void card18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card18ActionPerformed
        flipCard(2,5);
    }//GEN-LAST:event_card18ActionPerformed

    private void card17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card17ActionPerformed
        flipCard(2,4);
    }//GEN-LAST:event_card17ActionPerformed

    private void card12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card12ActionPerformed
        flipCard(1,5);
    }//GEN-LAST:event_card12ActionPerformed

    private void card11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card11ActionPerformed
        flipCard(1,4);
    }//GEN-LAST:event_card11ActionPerformed

    private void card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card6ActionPerformed
        flipCard(0,5);
    }//GEN-LAST:event_card6ActionPerformed

    private void card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card5ActionPerformed
        flipCard(0,4);
    }//GEN-LAST:event_card5ActionPerformed

    private void card16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card16ActionPerformed
        flipCard(2,3);
    }//GEN-LAST:event_card16ActionPerformed

    private void card15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card15ActionPerformed
        flipCard(2,2);
    }//GEN-LAST:event_card15ActionPerformed

    private void card14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card14ActionPerformed
        flipCard(2,1);
    }//GEN-LAST:event_card14ActionPerformed

    private void card13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card13ActionPerformed
        flipCard(2,0);
    }//GEN-LAST:event_card13ActionPerformed

    private void card10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card10ActionPerformed
        flipCard(1,3);
    }//GEN-LAST:event_card10ActionPerformed

    private void card9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card9ActionPerformed
        flipCard(1,2);
    }//GEN-LAST:event_card9ActionPerformed

    private void card8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card8ActionPerformed
        flipCard(1,1);
    }//GEN-LAST:event_card8ActionPerformed

    private void card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card7ActionPerformed
        flipCard(1,0);
    }//GEN-LAST:event_card7ActionPerformed

    private void card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card4ActionPerformed
        flipCard(0,3);
    }//GEN-LAST:event_card4ActionPerformed

    private void card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card3ActionPerformed
        flipCard(0,2);
    }//GEN-LAST:event_card3ActionPerformed

    private void card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card2ActionPerformed
        flipCard(0,1);
    }//GEN-LAST:event_card2ActionPerformed

    private void card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card1ActionPerformed
        flipCard(0,0);
    }//GEN-LAST:event_card1ActionPerformed

    private void jExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_jExitMouseClicked

    private void jHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHelpActionPerformed
        HelpJFrame helpFrame = new HelpJFrame();
        helpFrame.setVisible(true);
    }//GEN-LAST:event_jHelpActionPerformed

    private void jNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNewGameMouseClicked
        Game game = new Game();
        GameHardFrame gameHardFrame = new GameHardFrame(game);
        gameHardFrame.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jNewGameMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameHardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameHardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameHardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameHardFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton card1;
    private javax.swing.JButton card10;
    private javax.swing.JButton card11;
    private javax.swing.JButton card12;
    private javax.swing.JButton card13;
    private javax.swing.JButton card14;
    private javax.swing.JButton card15;
    private javax.swing.JButton card16;
    private javax.swing.JButton card17;
    private javax.swing.JButton card18;
    private javax.swing.JButton card19;
    private javax.swing.JButton card2;
    private javax.swing.JButton card20;
    private javax.swing.JButton card21;
    private javax.swing.JButton card22;
    private javax.swing.JButton card23;
    private javax.swing.JButton card24;
    private javax.swing.JButton card25;
    private javax.swing.JButton card26;
    private javax.swing.JButton card27;
    private javax.swing.JButton card28;
    private javax.swing.JButton card29;
    private javax.swing.JButton card3;
    private javax.swing.JButton card30;
    private javax.swing.JButton card31;
    private javax.swing.JButton card32;
    private javax.swing.JButton card33;
    private javax.swing.JButton card34;
    private javax.swing.JButton card35;
    private javax.swing.JButton card36;
    private javax.swing.JButton card4;
    private javax.swing.JButton card5;
    private javax.swing.JButton card6;
    private javax.swing.JButton card7;
    private javax.swing.JButton card8;
    private javax.swing.JButton card9;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jGameLabel;
    private javax.swing.JPanel jGamePanel;
    private javax.swing.JButton jHelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jNewGame;
    private javax.swing.JLabel scoreLabel;
    // End of variables declaration//GEN-END:variables
}
