/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Auxiliar.LogicaJuego;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Xpc
 */
public class PlayGame extends javax.swing.JFrame {

    private final LogicaJuego log = new LogicaJuego();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[1];
    
    public PlayGame() {
        initComponents();
        
        setCards();
    }
    
    private void setCards(){
        int[] numbers = log.getCardNumbers();
        
        btnC1.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[0]+".png")));
        btnC2.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[1]+".png")));
        btnC3.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[2]+".png")));
        btnC4.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[3]+".png")));
        btnC5.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[4]+".png")));
        btnC6.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[5]+".png")));
        btnC7.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[6]+".png")));
        btnC8.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[7]+".png")));
        btnC9.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[8]+".png")));
        btnC10.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[9]+".png")));
        btnC11.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[10]+".png")));
        btnC12.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[11]+".png")));
        btnC13.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[12]+".png")));
        btnC14.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[13]+".png")));
        btnC15.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[14]+".png")));
        btnC16.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[15]+".png")));           
    }
    
    
    private void btnEnabled(JButton btn){
        if(!caraUp){
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
        }
        else{
            btn.setEnabled(false);
            caraUp = false; 
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC8 = new javax.swing.JButton();
        btnC9 = new javax.swing.JButton();
        btnC10 = new javax.swing.JButton();
        btnC11 = new javax.swing.JButton();
        btnC12 = new javax.swing.JButton();
        btnC13 = new javax.swing.JButton();
        btnC14 = new javax.swing.JButton();
        btnC15 = new javax.swing.JButton();
        btnC16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego Dos Caras");

        btnC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC1.setBorder(null);
        btnC1.setBorderPainted(false);
        btnC1.setContentAreaFilled(false);
        btnC1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC2.setBorder(null);
        btnC2.setBorderPainted(false);
        btnC2.setContentAreaFilled(false);
        btnC2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC3.setBorder(null);
        btnC3.setBorderPainted(false);
        btnC3.setContentAreaFilled(false);
        btnC3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC4.setBorder(null);
        btnC4.setBorderPainted(false);
        btnC4.setContentAreaFilled(false);
        btnC4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC5.setBorder(null);
        btnC5.setBorderPainted(false);
        btnC5.setContentAreaFilled(false);
        btnC5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC6.setBorder(null);
        btnC6.setBorderPainted(false);
        btnC6.setContentAreaFilled(false);
        btnC6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC7.setBorder(null);
        btnC7.setBorderPainted(false);
        btnC7.setContentAreaFilled(false);
        btnC7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC8.setBorder(null);
        btnC8.setBorderPainted(false);
        btnC8.setContentAreaFilled(false);
        btnC8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC9.setBorder(null);
        btnC9.setBorderPainted(false);
        btnC9.setContentAreaFilled(false);
        btnC9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N
        btnC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC9ActionPerformed(evt);
            }
        });

        btnC10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC10.setBorder(null);
        btnC10.setBorderPainted(false);
        btnC10.setContentAreaFilled(false);
        btnC10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC11.setBorder(null);
        btnC11.setBorderPainted(false);
        btnC11.setContentAreaFilled(false);
        btnC11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC12.setBorder(null);
        btnC12.setBorderPainted(false);
        btnC12.setContentAreaFilled(false);
        btnC12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC13.setBorder(null);
        btnC13.setBorderPainted(false);
        btnC13.setContentAreaFilled(false);
        btnC13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N
        btnC13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC13ActionPerformed(evt);
            }
        });

        btnC14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC14.setBorder(null);
        btnC14.setBorderPainted(false);
        btnC14.setContentAreaFilled(false);
        btnC14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC15.setBorder(null);
        btnC15.setBorderPainted(false);
        btnC15.setContentAreaFilled(false);
        btnC15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        btnC16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0.png"))); // NOI18N
        btnC16.setBorder(null);
        btnC16.setBorderPainted(false);
        btnC16.setContentAreaFilled(false);
        btnC16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cr.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnC1)
                                .addGap(18, 18, 18)
                                .addComponent(btnC2)
                                .addGap(18, 18, 18)
                                .addComponent(btnC3)
                                .addGap(18, 18, 18)
                                .addComponent(btnC4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnC5)
                                .addGap(18, 18, 18)
                                .addComponent(btnC6)
                                .addGap(18, 18, 18)
                                .addComponent(btnC7)
                                .addGap(18, 18, 18)
                                .addComponent(btnC8)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnC13)
                                .addGap(18, 18, 18)
                                .addComponent(btnC14)
                                .addGap(18, 18, 18)
                                .addComponent(btnC15)
                                .addGap(18, 18, 18)
                                .addComponent(btnC16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnC9)
                                .addGap(18, 18, 18)
                                .addComponent(btnC10)
                                .addGap(18, 18, 18)
                                .addComponent(btnC11)
                                .addGap(18, 18, 18)
                                .addComponent(btnC12)
                                .addGap(84, 84, 84)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC1)
                        .addGap(18, 18, 18)
                        .addComponent(btnC5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnC2)
                            .addComponent(btnC3)
                            .addComponent(btnC4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnC6)
                            .addComponent(btnC7)
                            .addComponent(btnC8))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnC9)
                        .addComponent(btnC12))
                    .addComponent(btnC11)
                    .addComponent(btnC10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC16)
                    .addComponent(btnC15)
                    .addComponent(btnC14)
                    .addComponent(btnC13)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 449, 688);
    }// </editor-fold>//GEN-END:initComponents

    private void btnC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnC9ActionPerformed

    private void btnC13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnC13ActionPerformed

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
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC11;
    private javax.swing.JButton btnC12;
    private javax.swing.JButton btnC13;
    private javax.swing.JButton btnC14;
    private javax.swing.JButton btnC15;
    private javax.swing.JButton btnC16;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnC5;
    private javax.swing.JButton btnC6;
    private javax.swing.JButton btnC7;
    private javax.swing.JButton btnC8;
    private javax.swing.JButton btnC9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
