/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing.fields;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import static swing.fields.passwordField.visibility;

/**
 *
 * @author Shalom Geek
 */
public class textField extends javax.swing.JPanel {

    private String textFieldText;
   
    public String getTextFieldText() {
        textFieldText = loguser.getText();
        return textFieldText;
    }

    public void setTextFieldText(String textFieldText) {
        this.textFieldText = textFieldText;

        if ((textFieldText == null) || (textFieldText.equals(""))) {

            loguser.setForeground(Color.GRAY);
            loguser.setText("Saisir le nom d'utilisateur");
            loguser.setCaretPosition(0);
        } else {
            loguser.setText(textFieldText);
            loguser.setForeground(Color.BLACK);

        }
    }

    /**
     * Creates new form textField
     */
    public textField() {
        initComponents();
        setOpaque(false);
        //setBackground(new Color(0, 0, 0, 0));
        loguser.setText("Saisir le nom d'utilisateur");
        init();
    }

    private void init() {
        String text = loguser.getText();
        if (text.equals("Saisir le nom d'utilisateur")) {
            loguser.setText("Saisir le nom d'utilisateur");
            loguser.setBackground(new Color(0, 0, 0, 0));
            loguser.setForeground(Color.GRAY);
        } else {
            loguser.setForeground(Color.BLACK);
        }
        loguser.setCaretPosition(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);

        loguser.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        loguser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        loguser.setBorder(null);
        loguser.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        loguser.setOpaque(false);
        loguser.setSelectionColor(new java.awt.Color(121, 121, 122));
        loguser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loguserMouseClicked(evt);
            }
        });
        loguser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                loguserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loguserKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loguser, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loguser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loguserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loguserMouseClicked
        int text = loguser.getText().length();
        if (text == 0) {
            loguser.setText("Saisir le nom d'utilisateur");
            loguser.setForeground(Color.GRAY);
            loguser.setCaretPosition(0);

        } else {
            if (!loguser.getText().equals("Saisir le nom d'utilisateur")) {

                loguser.setForeground(Color.BLACK);
            } else {

                loguser.setForeground(Color.GRAY);

                loguser.setCaretPosition(0);
            }
        }
    }//GEN-LAST:event_loguserMouseClicked

    private void loguserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loguserKeyReleased
        int keycode = evt.getKeyCode();
        int text = loguser.getText().length();
        if (keycode == KeyEvent.VK_BACK_SPACE) {
            if (text == 0) {
                loguser.setText("Saisir le nom d'utilisateur");
                loguser.setForeground(Color.GRAY);
                loguser.setCaretPosition(0);

            }
        }
        if (keycode == KeyEvent.VK_ENTER) {
            if (text == 0) {
                loguser.setText("Saisir le nom d'utilisateur");
                loguser.setForeground(Color.GRAY);
                loguser.setCaretPosition(0);

            }
           
        }
        
    }//GEN-LAST:event_loguserKeyReleased

    private void loguserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loguserKeyTyped
        int text = loguser.getText().length();

        if (loguser.getText().equals("Saisir le nom d'utilisateur")) {
            loguser.setForeground(Color.BLACK);
            loguser.setText(null);

        } else if (text == 0) {
            loguser.setText("Saisir le nom d'utilisateur");
            loguser.setForeground(Color.GRAY);
            loguser.setCaretPosition(0);

        }
    }//GEN-LAST:event_loguserKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JTextField loguser = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
