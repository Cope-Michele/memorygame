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
        
    }

    GameMediumFrame() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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
        jButton13 = new javax.swing.JButton();
        card13 = new javax.swing.JButton();
        card15 = new javax.swing.JButton();
        card14 = new javax.swing.JButton();
        card16 = new javax.swing.JButton();

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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

        jButton13.setText("Score");

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

        javax.swing.GroupLayout jGamePanelLayout = new javax.swing.GroupLayout(jGamePanel);
        jGamePanel.setLayout(jGamePanelLayout);
        jGamePanelLayout.setHorizontalGroup(
            jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jGamePanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jGameLabel))
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jGamePanelLayout.createSequentialGroup()
                                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(34, 34, 34)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(95, Short.MAX_VALUE))
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
                            .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jGamePanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jNewGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jHelp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jExit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jGamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        card2.setText(cards[0][1].getBack());
    }//GEN-LAST:event_card2ActionPerformed

    private void card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card5ActionPerformed
        card5.setText(cards[1][0].getBack());
    }//GEN-LAST:event_card5ActionPerformed

    private void card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card1ActionPerformed
        card1.setText(cards[0][0].getBack());
    }//GEN-LAST:event_card1ActionPerformed

    private void card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card3ActionPerformed
        card3.setText(cards[0][2].getBack());
    }//GEN-LAST:event_card3ActionPerformed

    private void card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card4ActionPerformed
        card4.setText(cards[0][3].getBack());
    }//GEN-LAST:event_card4ActionPerformed

    private void card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card6ActionPerformed
        card6.setText(cards[1][1].getBack());
    }//GEN-LAST:event_card6ActionPerformed

    private void card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card7ActionPerformed
        card7.setText(cards[1][2].getBack());
    }//GEN-LAST:event_card7ActionPerformed

    private void card8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card8ActionPerformed
        card8.setText(cards[1][3].getBack());
    }//GEN-LAST:event_card8ActionPerformed

    private void card9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card9ActionPerformed
        card9.setText(cards[2][0].getBack());
    }//GEN-LAST:event_card9ActionPerformed

    private void card10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card10ActionPerformed
        card10.setText(cards[2][1].getBack());
    }//GEN-LAST:event_card10ActionPerformed

    private void card11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card11ActionPerformed
        card11.setText(cards[2][2].getBack());
    }//GEN-LAST:event_card11ActionPerformed

    private void card12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card12ActionPerformed
        card12.setText(cards[2][3].getBack());
    }//GEN-LAST:event_card12ActionPerformed

    private void card13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card13ActionPerformed
        card13.setText(cards[3][0].getBack());
    }//GEN-LAST:event_card13ActionPerformed

    private void card14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card14ActionPerformed
        card14.setText(cards[3][1].getBack());
    }//GEN-LAST:event_card14ActionPerformed

    private void card15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card15ActionPerformed
        card15.setText(cards[3][2].getBack());
    }//GEN-LAST:event_card15ActionPerformed

    private void card16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card16ActionPerformed
        card16.setText(cards[3][3].getBack());
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
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jGameLabel;
    private javax.swing.JPanel jGamePanel;
    private javax.swing.JButton jHelp;
    private javax.swing.JButton jNewGame;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
