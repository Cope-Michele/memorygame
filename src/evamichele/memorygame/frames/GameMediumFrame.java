
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
public class GameMediumFrame extends javax.swing.JFrame {
    public Card [][] cards;
    private int prevSelectedCardRow = -1;
    private int prevSelectedCardCol = -1;
    private Game game;
    
    public GameMediumFrame(Game game) {
        initComponents();
        game.GameMedium();
        cards = game.getBoard();
        card1.setText(Integer.toString(cards[0][0].getFront()));
        card2.setText(Integer.toString(cards[0][1].getFront()));
        card3.setText(Integer.toString(cards[0][2].getFront()));
        card4.setText(Integer.toString(cards[0][3].getFront()));
        card5.setText(Integer.toString(cards[1][0].getFront()));
        card6.setText(Integer.toString(cards[1][1].getFront()));
        card7.setText(Integer.toString(cards[1][2].getFront()));
        card8.setText(Integer.toString(cards[1][3].getFront()));
        card9.setText(Integer.toString(cards[2][0].getFront()));
        card10.setText(Integer.toString(cards[2][1].getFront()));
        card11.setText(Integer.toString(cards[2][2].getFront()));
        card12.setText(Integer.toString(cards[2][3].getFront()));
        card13.setText(Integer.toString(cards[3][0].getFront()));
        card14.setText(Integer.toString(cards[3][1].getFront()));
        card15.setText(Integer.toString(cards[3][2].getFront()));
        card16.setText(Integer.toString(cards[3][3].getFront()));
        
        this.game = game;
    }

    GameMediumFrame() {
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
        
         if ( cards[1][0].isShowing()){
            card5.setText(cards[1][0].getBack());
        }
        else { 
            card5.setText(Integer.toString(cards[1][0].getFront()));
        }
        
        if ( cards[1][1].isShowing()){
            card6.setText(cards[1][1].getBack());
        }
        else { 
            card6.setText(Integer.toString(cards[1][1].getFront()));
        }
        
        if ( cards[1][2].isShowing()){
            card7.setText(cards[1][2].getBack());
        }
        else { 
            card7.setText(Integer.toString(cards[1][2].getFront()));
        }
        
        if ( cards[1][3].isShowing()){
            card8.setText(cards[1][3].getBack());
        }
        else { 
            card8.setText(Integer.toString(cards[1][3].getFront()));
        }
        
         if ( cards[2][0].isShowing()){
            card9.setText(cards[2][0].getBack());
        }
        else { 
            card9.setText(Integer.toString(cards[2][0].getFront()));
        }
        
        if ( cards[2][1].isShowing()){
            card10.setText(cards[2][1].getBack());
        }
        else { 
            card10.setText(Integer.toString(cards[2][1].getFront()));
        }
        
        if ( cards[2][2].isShowing()){
            card11.setText(cards[2][2].getBack());
        }
        else { 
            card11.setText(Integer.toString(cards[2][2].getFront()));
        }
        
        if ( cards[2][3].isShowing()){
            card12.setText(cards[2][3].getBack());
        }
        else { 
            card12.setText(Integer.toString(cards[2][3].getFront()));
        }
        
         if ( cards[3][0].isShowing()){
            card13.setText(cards[3][0].getBack());
        }
        else { 
            card13.setText(Integer.toString(cards[3][0].getFront()));
        }
        
        if ( cards[3][1].isShowing()){
            card14.setText(cards[3][1].getBack());
        }
        else { 
            card14.setText(Integer.toString(cards[3][1].getFront()));
        }
        
        if ( cards[3][2].isShowing()){
            card15.setText(cards[3][2].getBack());
        }
        else { 
            card15.setText(Integer.toString(cards[3][2].getFront()));
        }
        
        if ( cards[3][3].isShowing()){
            card16.setText(cards[3][3].getBack());
        }
        else { 
            card16.setText(Integer.toString(cards[3][3].getFront()));
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
        card5 = new javax.swing.JButton();
        card6 = new javax.swing.JButton();
        card7 = new javax.swing.JButton();
        card8 = new javax.swing.JButton();
        card9 = new javax.swing.JButton();
        card10 = new javax.swing.JButton();
        card11 = new javax.swing.JButton();
        card12 = new javax.swing.JButton();
        card13 = new javax.swing.JButton();
        card15 = new javax.swing.JButton();
        card14 = new javax.swing.JButton();
        card16 = new javax.swing.JButton();
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
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
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

        card13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card13ActionPerformed(evt);
            }
        });

        card15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card15ActionPerformed(evt);
            }
        });

        card14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card14ActionPerformed(evt);
            }
        });

        card16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card16ActionPerformed(evt);
            }
        });

        scoreLabel.setText("Score:");

        javax.swing.GroupLayout jGamePanelLayout = new javax.swing.GroupLayout(jGamePanel);
        jGamePanel.setLayout(jGamePanelLayout);
        jGamePanelLayout.setHorizontalGroup(
            jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jGamePanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jGamePanelLayout.createSequentialGroup()
                                        .addComponent(card13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(card14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(card15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jGamePanelLayout.createSequentialGroup()
                                        .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jHelp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNewGame, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(59, 59, 59))
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jGameLabel))
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(scoreLabel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jGamePanelLayout.setVerticalGroup(
            jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jGamePanelLayout.createSequentialGroup()
                .addComponent(jGameLabel)
                .addGap(18, 18, 18)
                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scoreLabel)
                    .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jGamePanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jNewGame)
                        .addGap(18, 18, 18)
                        .addComponent(jHelp)
                        .addGap(18, 18, 18)))
                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExit))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jGamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
    this.dispose();
    }//GEN-LAST:event_jExitActionPerformed

    private void jHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHelpActionPerformed
       HelpJFrame helpFrame = new HelpJFrame();
       helpFrame.setVisible(true);
    }//GEN-LAST:event_jHelpActionPerformed

    private void jNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNewGameMouseClicked
      GameMediumFrame gameMediumFrame = new GameMediumFrame();
      gameMediumFrame.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jNewGameMouseClicked

    private void card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card2ActionPerformed
        flipCard(0,1);
    }//GEN-LAST:event_card2ActionPerformed

    private void card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card5ActionPerformed
        flipCard(1,0);
    }//GEN-LAST:event_card5ActionPerformed

    private void card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card1ActionPerformed
        flipCard(0,0);
    }//GEN-LAST:event_card1ActionPerformed

    private void card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card3ActionPerformed
        flipCard(0,2);
    }//GEN-LAST:event_card3ActionPerformed

    private void card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card4ActionPerformed
        flipCard(0,3);
    }//GEN-LAST:event_card4ActionPerformed

    private void card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card6ActionPerformed
        flipCard(1,1);
    }//GEN-LAST:event_card6ActionPerformed

    private void card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card7ActionPerformed
        flipCard(1,2);
    }//GEN-LAST:event_card7ActionPerformed

    private void card8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card8ActionPerformed
        flipCard(1,3);
    }//GEN-LAST:event_card8ActionPerformed

    private void card9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card9ActionPerformed
        flipCard(2,0);
    }//GEN-LAST:event_card9ActionPerformed

    private void card10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card10ActionPerformed
        flipCard(2,1);
    }//GEN-LAST:event_card10ActionPerformed

    private void card11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card11ActionPerformed
        flipCard(2,2);
    }//GEN-LAST:event_card11ActionPerformed

    private void card12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card12ActionPerformed
        flipCard(2,3);
    }//GEN-LAST:event_card12ActionPerformed

    private void card13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card13ActionPerformed
        flipCard(3,0);
    }//GEN-LAST:event_card13ActionPerformed

    private void card14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card14ActionPerformed
        flipCard(3,1);
    }//GEN-LAST:event_card14ActionPerformed

    private void card15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card15ActionPerformed
        flipCard(3,2);
    }//GEN-LAST:event_card15ActionPerformed

    private void card16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card16ActionPerformed
        flipCard(3,3);
    }//GEN-LAST:event_card16ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton card1;
    private javax.swing.JButton card10;
    private javax.swing.JButton card11;
    private javax.swing.JButton card12;
    private javax.swing.JButton card13;
    private javax.swing.JButton card14;
    private javax.swing.JButton card15;
    private javax.swing.JButton card16;
    private javax.swing.JButton card2;
    private javax.swing.JButton card3;
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
    private javax.swing.JButton jNewGame;
    private javax.swing.JLabel scoreLabel;
    // End of variables declaration//GEN-END:variables
}
