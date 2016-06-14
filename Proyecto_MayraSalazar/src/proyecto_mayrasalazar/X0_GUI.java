/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mayrasalazar;

import javax.swing.JOptionPane;

/**
 *
 * @author Agile_pc
 */
public class X0_GUI extends javax.swing.JFrame {

    boolean empate;
    boolean winX;
    boolean win0;
    int countX = 0;
    int count0 = 0;
    String[][] matriz;
    static int vidaX = 100;
    static int vida0 = 100;
    boolean playerChoice;

    public X0_GUI() {
        initComponents();
        playerChoice = true;
        matriz = new String[3][3];
        juegoNuevo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void juegoNuevo() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = " ";
            }
        }
        winX = false;
        win0 = false;
    }

    public void llamarBotones() {
        jButton1.setText(matriz[0][0]);
        jButton2.setText(matriz[0][1]);
        jButton3.setText(matriz[0][2]);
        jButton4.setText(matriz[1][0]);
        jButton5.setText(matriz[1][2]);
        jButton6.setText(matriz[2][0]);
        jButton7.setText(matriz[1][1]);
        jButton8.setText(matriz[2][2]);
        jButton9.setText(matriz[2][1]);

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        jProgressBar1.setValue(100);

        jProgressBar2.setValue(100);

        jLabel1.setText("Jugador X");

        jLabel2.setText("Jugador 0");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mover(0, 1);
        llamarBotones();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mover(0, 2);
        llamarBotones();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mover(1, 0);
        llamarBotones();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mover(1, 2);
        llamarBotones();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        mover(2, 0);
        llamarBotones();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        mover(1, 1);
        llamarBotones();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        mover(2, 2);
        llamarBotones();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        mover(2, 1);
        llamarBotones();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mover(0, 0);
        llamarBotones();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(X0_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(X0_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(X0_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(X0_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new X0_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables

    public boolean eleccion() {
        playerChoice = !playerChoice;
        return playerChoice;
    }

    public void mover(int x, int y) {
        if (" ".equals(matriz[x][y])) {
            matriz[x][y] = playerChoice ? "X" : "0";
        } else {
            System.out.println("No es válido el movimiento");
        }
        eleccion();
        ganar();
        leerMatriz();
    }

    public void ganar() {
        if (matriz[0][0] == "X" && matriz[0][1] == "X" && matriz[0][2] == "X") {
            winX = true;
            countX += 1;
        }
        if (matriz[0][0] == "X" && matriz[0][1] == "X" && matriz[0][2] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[1][0] == "X" && matriz[1][1] == "X" && matriz[1][2] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[2][0] == "X" && matriz[2][1] == "X" && matriz[2][2] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[0][0] == "X" && matriz[1][0] == "X" && matriz[2][0] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[0][2] == "X" && matriz[1][2] == "X" && matriz[2][2] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[0][1] == "X" && matriz[1][1] == "X" && matriz[2][1] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[0][0] == "X" && matriz[1][1] == "X" && matriz[2][2] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[0][2] == "X" && matriz[1][1] == "X" && matriz[2][0] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[0][0] == "0" && matriz[0][1] == "0" && matriz[0][2] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[1][0] == "0" && matriz[1][1] == "0" && matriz[1][2] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[2][0] == "0" && matriz[2][1] == "0" && matriz[2][2] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[0][0] == "0" && matriz[1][0] == "0" && matriz[2][0] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[0][2] == "0" && matriz[1][2] == "0" && matriz[2][2] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[0][1] == "0" && matriz[1][1] == "0" && matriz[2][1] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[0][0] == "0" && matriz[1][1] == "0" && matriz[2][2] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[0][2] == "0" && matriz[1][1] == "0" && matriz[2][0] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (vacios() == 0 && winX == false && win0 == false) {
            empate = true;
        }
        verificarAttack();
        System.out.printf("La vida actual es:\n X = %d \t 0 = %d\n", vidaX, vida0);
        gameEnd();

    }

    public void verificarAttack() {
        if (winX == true) {
            JOptionPane.showMessageDialog(rootPane, "El jugador X ataca");
            vida0 -= 50;
            jProgressBar2.setValue(vida0);
            juegoNuevo();
        } else if (win0 == true) {
            JOptionPane.showMessageDialog(rootPane, "El jugador 0 ataca");
            vidaX -= 50;
            juegoNuevo();
            jProgressBar1.setValue(vidaX);
        } else if (empate == true) {
            JOptionPane.showMessageDialog(rootPane, "Ningún jugador ataca");
            juegoNuevo();
            empate = false;
        }
    }

    public int vacios() {
        int vacios = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == " ") {
                    vacios++;
                }
            }
        }
        return vacios;
    }

    public void gameEnd() {
        boolean gameEnd = true;
        if (vidaX == 0 || vida0 == 0) {
            gameEnd = false;
        }
        if (gameEnd == false && vidaX > 0) {
            JOptionPane.showMessageDialog(rootPane, "El ganador es el Jugador X");
            juegoNuevo();
            jProgressBar1.setValue(100);
            jProgressBar2.setValue(100);
        } else if (gameEnd == false && vida0 > 0) {
            JOptionPane.showMessageDialog(rootPane, "El ganador es el Jugador 0");
            juegoNuevo();
            jProgressBar1.setValue(100);
            jProgressBar2.setValue(100);
        }
    }

    public void leerMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

}
