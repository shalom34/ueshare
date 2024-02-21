package swing.Login.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import service.Model_Message;
import swing.Cards.Button;
import service.Model_Register;
import swing.Login.components.Events.EventMessage;
import swing.Mainpage.components.interuniversitaire.events.publicEvent;
import swing.buttons.ButtonCustom;
import swing.buttons.ButtonOutLine;
import swing.fields.MyPasswordField;
import swing.fields.MyTextField;

public class PSignup extends javax.swing.JPanel {

    public PSignup() {
        initComponents();
        init();
    }

    private void init() {
        setLayout(new MigLayout("wrap", "push[center]push", "push[]20[]10[]10[]10[]10[]10[]15[]10[]push"));
        JLabel title = new JLabel("Bienvenue sur ueshare!");
        title.setFont(new java.awt.Font("Yu Gothic", 1, 32));
        title.setForeground(new java.awt.Color(28, 120, 239));
        add(title);
        JLabel subtitle = new JLabel("Inscrivez-vous pour experiencer le bien etre des utilisateurs.");
        subtitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 18));
        subtitle.setForeground(new java.awt.Color(28, 120, 239));
        add(subtitle);
        JLabel lbmessage= new JLabel();
        lbmessage.setFont(new java.awt.Font("Yu Gothic", 0, 14));
        lbmessage.setForeground(Color.red);
        lbmessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lbmessage, "w 70%");
        MyTextField textUser = new MyTextField();
        textUser.setPrefixIcon(new ImageIcon(getClass().getResource("/icons/user.png")));
        textUser.setHint("Nom complet");
        add(textUser, "w 70%");
         MyTextField textMail = new MyTextField();
        textMail.setPrefixIcon(new ImageIcon(getClass().getResource("/icons/mail.png")));
        textMail.setHint("Email");
        add(textMail, "w 70%");
        MyPasswordField textPass = new MyPasswordField();
        textPass.setPrefixIcon(new ImageIcon(getClass().getResource("/icons/lock.png")));
        textPass.setHint("Mot de passe");
        add(textPass, "w 70%");
        MyPasswordField textConfPass = new MyPasswordField();
        textConfPass.setPrefixIcon(new ImageIcon(getClass().getResource("/icons/lock.png")));
        textConfPass.setHint("Comfirmer");
        add(textConfPass, "w 70%");
        Button cmd = new Button();
        cmd.setText("Creer un compte");
        cmd.setBackground(new Color(104, 161, 234));
        cmd.setForeground(Color.WHITE);
        cmd.setFont(new java.awt.Font("Yu Gothic UI", 1, 16));
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name= textUser.getText().trim();
                String email=textMail.getText().trim();
                String password=String.valueOf(textPass.getPassword());
                String Confpassword=String.valueOf(textConfPass.getPassword());
                if (name.equals("")) {
                    textUser.grabFocus();
                }else if(email.equals("")){
                    textMail.grabFocus();
                }else if (!email.contains("@gmail.com")) {
                    textMail.setText("");
                    textMail.grabFocus();
                }
                else if (password.equals("")) {
                    textPass.grabFocus();
                }else if (Confpassword.equals("")) {
                    textConfPass.grabFocus();
                }else if (!password.equals(Confpassword)) {
                    textConfPass.grabFocus();
                    
                }else{
                    Model_Register data= new Model_Register(email,password,name);
                publicEvent.getInstance().getEventLogin().register(data, new EventMessage(){
                        @Override
                        public void callMessage(Model_Message message) {
                            if (!message.isAction()) {
                                lbmessage.setForeground(Color.red);
                                lbmessage.setText(message.getMessage());
                            }else{
                                lbmessage.setForeground(Color.GREEN);
                               lbmessage.setText(message.getMessage());
                               publicEvent.getInstance().getEventLogin().login();
                            }
                        }
                    
                });
                }
             }
         });
        add(cmd, "w 50%, h 40");
        ButtonOutLine cmd1 = new ButtonOutLine();
        cmd1.setText("Se connecter");
        cmd1.setBackground(new Color(104, 161, 234));
        cmd1.setForeground(Color.BLACK);
         cmd1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16));
         cmd1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                publicEvent.getInstance().getEventLogin().goLogin();
             }
         });
        add(cmd1, "w 35%, h 40");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(247, 247, 247));

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
