/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pages;

import connectivity.Connector;

import java.awt.Color;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import swing.popups.ConnectionError;

public class SplashScreen extends javax.swing.JFrame {

    private Thread thread;
    private ConnectionError er;

    private JFrame fram=this;

    public SplashScreen() {
        initComponents();
        init();
        panelBorder1.setBackground(new Color(255,255,255,200));
    }

    private void init() {
        setBackground(new Color(0, 0, 0, 0));
        animate();

    }

    private void animate() {
        thread = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    liquidProgress1.setValue(i);
                    try {
                        Thread.sleep(35);
                    } catch (InterruptedException e) {
                        System.err.println(e);
                    }
                    if (i == 100) {
                        Login log= new Login();
                        log.setVisible(true);
                        setVisible(false);
                    }
                }
            }
        });
        thread.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.panels.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        liquidProgress1 = new swing.ProgressBar.LiquidProgress();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder1.setBackground(new java.awt.Color(247, 247, 247));
        panelBorder1.setBorderRadius(0);
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UEShare");
        panelBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 200, 160, 110));

        liquidProgress1.setBorder(null);
        liquidProgress1.setValue(50);
        liquidProgress1.setAnimateColor(new java.awt.Color(28, 120, 239));
        liquidProgress1.setBorderColor(new java.awt.Color(28, 120, 239));
        liquidProgress1.setSpacesize(0);
        panelBorder1.add(liquidProgress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 175, 169, 156));

        getContentPane().add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 525));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private swing.ProgressBar.LiquidProgress liquidProgress1;
    private swing.panels.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
