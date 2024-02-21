package swing.Login.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import swing.Cards.Button;
import swing.Mainpage.components.interuniversitaire.events.publicEvent;
import swing.buttons.ButtonCustom;
import swing.buttons.ButtonOutLine;
import swing.fields.MyPasswordField;
import swing.fields.MyTextField;

public class PLogin extends javax.swing.JPanel {

    public PLogin() {
        initComponents();
        init();
    }

    private void init() {
        setLayout(new MigLayout("wrap", "push[center]push", "push[]20[]10[]10[]15[]10[]push"));
        JLabel title = new JLabel("Bienvenue sur ueshare!");
        title.setFont(new java.awt.Font("Yu Gothic", 1, 32));
        title.setForeground(new java.awt.Color(28, 120, 239));
        add(title);
        JLabel subtitle = new JLabel("Connectez-vous sur votre compte");
        subtitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 18));
        subtitle.setForeground(new java.awt.Color(28, 120, 239));
        add(subtitle);
        MyTextField textUser = new MyTextField();
        textUser.setPrefixIcon(new ImageIcon(getClass().getResource("/icons/mail.png")));
        textUser.setHint("Email");
        add(textUser, "w 70%");
        MyPasswordField textPass = new MyPasswordField();
        textPass.setPrefixIcon(new ImageIcon(getClass().getResource("/icons/lock.png")));
        textPass.setHint("Mot de passe");
        add(textPass, "w 70%");
        Button cmd = new Button();
        cmd.setText("Se connecter");
        cmd.setBackground(new Color(104, 161, 234));
        cmd.setForeground(Color.WHITE);
        cmd.setFont(new java.awt.Font("Yu Gothic UI", 1, 16));
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                 publicEvent.getInstance().getEventLogin().login();
                
             }
         });
        add(cmd, "w 50%, h 40");
        ButtonOutLine cmd1 = new ButtonOutLine();
        cmd1.setText("Creer un compte");
        cmd1.setBackground(new Color(104, 161, 234));
        cmd1.setForeground(Color.BLACK);
         cmd1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16));
         cmd1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                publicEvent.getInstance().getEventLogin().goRegister();
             }
         });
        add(cmd1, "w 40%, h 40");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 175, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
