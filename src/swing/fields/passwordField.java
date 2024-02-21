package swing.fields;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class passwordField extends javax.swing.JPanel {
    private int fontSize;
   
    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
         logpass.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, fontSize));
        this.fontSize = fontSize;
    }
    private String text;

    public String getpasswordText() {
        text = new String(logpass.getPassword());
        return text;
    }

    public void setPasswordText(String text) {
        this.text = text;
        if ((text == null)||(text.equals(""))) {
            logpass.setEchoChar((char) 0);
            visibility.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_eye_30px.png")));
            visibility.setVisible(true);
             logpass.setText("Saisir le mot de passe");
            logpass.setForeground(Color.GRAY);
        } else {
            logpass.setText(text);
            logpass.setForeground(Color.BLACK);
            logpass.setEchoChar('*');
            visibility.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_hide_30px.png")));

        }
    }

    private int eyeclicks = 0;

    public passwordField() {
        initComponents();
        setOpaque(false);
        init();
    }

    private void init() {
        logpass.setBackground(new Color(0, 0, 0, 0));
        String pass = new String(logpass.getPassword());
        if ((pass.equals("Saisir le mot de passe"))||(pass.equals(""))) {
            logpass.setEchoChar((char) 0);
            logpass.setText("Saisir le mot de passe");
            visibility.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_eye_30px.png")));
            logpass.setForeground(Color.GRAY);
        } else {
            logpass.setEchoChar('*');
            logpass.setForeground(Color.BLACK);
        }
        logpass.setCaretPosition(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logpass = new javax.swing.JPasswordField();

        setOpaque(false);

        logpass.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        logpass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        logpass.setText("Saisir le mot de passe");
        logpass.setBorder(null);
        logpass.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        logpass.setEchoChar('*');
        logpass.setOpaque(false);
        logpass.setSelectionColor(new java.awt.Color(121, 121, 122));
        logpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logpassMouseClicked(evt);
            }
        });
        logpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                logpassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                logpassKeyTyped(evt);
            }
        });

        visibility.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        visibility.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_hide_30px.png"))); // NOI18N
        visibility.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visibility.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visibilityMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logpass, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(visibility, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(logpass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(visibility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logpassMouseClicked

        int password = new String(logpass.getPassword()).length();
        if (password == 0) {
            logpass.setText("Saisir le mot de passe");
            logpass.setEchoChar((char) 0);
            logpass.setForeground(Color.GRAY);
            logpass.setCaretPosition(0);

        } else {
            if (!new String(logpass.getPassword()).equals("Saisir le mot de passe")) {

                logpass.setEchoChar('*');
                logpass.setForeground(Color.BLACK);
            } else {

                logpass.setForeground(Color.GRAY);

                logpass.setCaretPosition(0);
            }
        }
    }//GEN-LAST:event_logpassMouseClicked

    private void logpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logpassKeyReleased
        int keycode = evt.getKeyCode();
        int password = new String(logpass.getPassword()).length();
        if (keycode == KeyEvent.VK_BACK_SPACE) {
            if (password == 0) {
                logpass.setText("Saisir le mot de passe");
                logpass.setEchoChar((char) 0);
                logpass.setForeground(Color.GRAY);
                logpass.setCaretPosition(0);
                visibility.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_eye_30px.png")));
                visibility.setVisible(true);
            }
        }
        if (keycode == KeyEvent.VK_ENTER) {
            if (password == 0) {
                logpass.setText("Saisir le mot de passe");
                logpass.setEchoChar((char) 0);
                logpass.setForeground(Color.GRAY);
                logpass.setCaretPosition(0);
                visibility.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_eye_30px.png")));
                visibility.setVisible(true);
            }
        }
    }//GEN-LAST:event_logpassKeyReleased

    private void logpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logpassKeyTyped
        int password = new String(logpass.getPassword()).length();

        if (new String(logpass.getPassword()).equals("Saisir le mot de passe")) {

            logpass.setForeground(Color.BLACK);
            logpass.setEchoChar('*');
            logpass.setText(null);
            visibility.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_hide_30px.png")));
            visibility.setVisible(true);

        } else if (password == 0) {
            logpass.setText("Saisir le mot de passe");
            logpass.setEchoChar((char) 0);
            logpass.setForeground(Color.GRAY);
            logpass.setCaretPosition(0);
            visibility.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_eye_30px.png")));
            visibility.setVisible(true);
        }

    }//GEN-LAST:event_logpassKeyTyped

    private void visibilityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visibilityMouseClicked
        String pass = new String(logpass.getPassword());
        if (pass.equals("Saisir le mot de passe")) {
            logpass.setEchoChar((char) 0);
            visibility.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_eye_30px.png")));
        } else {
            eyeclicks++;
            if (eyeclicks == 1) {
                logpass.setEchoChar((char) 0);
                visibility.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_eye_30px.png")));
                eyeclicks = 1;
            } else {
                visibility.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_hide_30px.png")));
                logpass.setEchoChar('*');
                eyeclicks = 0;
            }
        }
    }//GEN-LAST:event_visibilityMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField logpass;
    public static final javax.swing.JLabel visibility = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
