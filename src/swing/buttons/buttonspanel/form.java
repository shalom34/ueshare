/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing.buttons.buttonspanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import swing.panels.PanelBorder;
import swing.popups.MessageDialog;

/**
 *
 * @author Shalom Geek
 */
public class form extends javax.swing.JPanel {

    /**
     * Creates new form form
     */
    public form() {
        initComponents();
        setOpaque(false);
    }

    public void initEvent(JPanel background1, JPanel background2, JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4) {
        button1.setBackground(Color.red);
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setBackground(Color.RED);
                button2.setBackground(Color.DARK_GRAY);
                button3.setBackground(Color.DARK_GRAY);
                panel1.setVisible(true);
                panel3.setVisible(false);
                panel2.setVisible(false);
                panel4.setVisible(false);
                background1.setVisible(false);
            }
        });
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                button2.setBackground(Color.RED);
                button1.setBackground(Color.DARK_GRAY);
                button3.setBackground(Color.DARK_GRAY);
                panel2.setVisible(true);
                panel1.setVisible(false);
                panel3.setVisible(false);
                background1.setVisible(false);
                panel4.setVisible(false);
            }
        });
        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                button3.setBackground(Color.RED);
                button2.setBackground(Color.DARK_GRAY);
                button1.setBackground(Color.DARK_GRAY);
                panel3.setVisible(true);
                panel1.setVisible(false);
                panel2.setVisible(false);
                background1.setVisible(false);
                panel4.setVisible(false);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button3 = new swing.buttons.winButton.button();
        button1 = new swing.buttons.winButton.button();
        button2 = new swing.buttons.winButton.button();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button3.setBackground(new java.awt.Color(78, 95, 91));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("3");
        button3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, 30));

        button1.setBackground(new java.awt.Color(78, 95, 91));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("1");
        button1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        button2.setBackground(new java.awt.Color(78, 95, 91));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("2");
        button2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.buttons.winButton.button button1;
    private swing.buttons.winButton.button button2;
    private swing.buttons.winButton.button button3;
    // End of variables declaration//GEN-END:variables
}
