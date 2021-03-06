/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evamichele.memorygame.frames;

import evamichele.memorygame.control.Memorygame;
import evamichele.memorygame.gamecreator.Game;
import java.util.Scanner;

/**
 *
 * @author Mpianatra
 */
public class EnterPlayerNames extends javax.swing.JFrame {
    private Game game = null;

    /**
     * Creates new form EnterPlayerNames
     */
    public EnterPlayerNames() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jName = new javax.swing.JPanel();
        jEnternameLabel = new javax.swing.JLabel();
        jPlayerName = new javax.swing.JTextField();
        jContinueButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enter Player Name");

        jName.setBackground(new java.awt.Color(204, 255, 255));

        jEnternameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jEnternameLabel.setForeground(new java.awt.Color(0, 153, 153));
        jEnternameLabel.setText("Enter your Name below:");

        jContinueButton.setText("Continue");
        jContinueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jContinueButtonMouseClicked(evt);
            }
        });
        jContinueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContinueButtonActionPerformed(evt);
            }
        });
        jContinueButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jContinueButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jNameLayout = new javax.swing.GroupLayout(jName);
        jName.setLayout(jNameLayout);
        jNameLayout.setHorizontalGroup(
            jNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNameLayout.createSequentialGroup()
                .addGroup(jNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jNameLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jEnternameLabel))
                    .addGroup(jNameLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jNameLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jContinueButton)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jNameLayout.setVerticalGroup(
            jNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEnternameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jContinueButton)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPlayerName.getAccessibleContext().setAccessibleParent(jPlayerName);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jContinueButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContinueButtonMouseClicked
        this.continueToGame();
    }//GEN-LAST:event_jContinueButtonMouseClicked

    private void jContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContinueButtonActionPerformed
        this.continueToGame();
    }//GEN-LAST:event_jContinueButtonActionPerformed

    private void jContinueButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jContinueButtonKeyPressed
         this.continueToGame();
    }//GEN-LAST:event_jContinueButtonKeyPressed
   private void continueToGame() {
        String playerName = this.jPlayerName.getName();// will be used
        MainMenuJFrame mainMenuFrame = new MainMenuJFrame();
        mainMenuFrame.setVisible(true);
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jContinueButton;
    private javax.swing.JLabel jEnternameLabel;
    private javax.swing.JPanel jName;
    private javax.swing.JTextField jPlayerName;
    // End of variables declaration//GEN-END:variables

    void initializeForm() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}