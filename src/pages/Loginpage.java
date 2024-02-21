/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pages;

import connectivity.Connector;
import connectivity.RememberMe;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jnafilechooser.api.JnaFileChooser;
import swing.popups.ErrorMessage;
import swing.popups.MessageDialog;
import swing.popups.VerificationMessage;

/**
 *
 * @author Shalom Geek
 */
public class Loginpage extends javax.swing.JFrame {

    Connector connection = null;
    int eyeclick = 0, sliderclick = 0;
    public static byte[] profilepic = null;
    public static String course, year, sex;

    public Loginpage() {
        initComponents();
        init();
        initResults();
    }

    private void init() {
        setBackground(new Color(0, 0, 0, 0));
        sliderpane.setBackground(new Color(51, 51, 51, 80));
        //buttonspanel.setVisible(false);
        Date currentDate = new Date();
        //connection.connect();
        datechooser.setDate(currentDate);
        signup.setVisible(false);
        buttonspanel.initEvent(signin, signup, page1, page2, page3, loading);
        page2.setVisible(false);
        page3.setVisible(false);
        DateChooserDesign();
        RememberMe r = new RememberMe();
        Connector con = new Connector();
        con.setUniCombo("public");
       // r.getInfos();
        loading.setVisible(false);

    }

    private void DateChooserDesign() {
        datechooser.getCalendarButton().setBorder(null);
        datechooser.getCalendarButton().setBackground(new Color(0, 0, 0, 0));
        datechooser.getDateEditor().getUiComponent().setBackground(new Color(247, 247, 247));
        datechooser.setBackground(Color.red);
        datechooser.getDateEditor().getUiComponent().setBorder(null);
        datechooser.getDateEditor().getUiComponent().setForeground(Color.BLACK);

    }

    private void initResults() {
        results.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.panels.PanelBorder();
        sliderpane = new swing.panels.PanelBorder();
        jLabel3 = new javax.swing.JLabel();
        sliderButton1 = new swing.buttons.SliderButton();
        jLabel1 = new javax.swing.JLabel();
        slidertext = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signin = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        button3 = new swing.Cards.Button();
        signup = new javax.swing.JPanel();
        page1 = new javax.swing.JPanel();
        luser15 = new javax.swing.JLabel();
        pcpassword = new javax.swing.JPanel();
        ppassword = new javax.swing.JPanel();
        puser = new javax.swing.JPanel();
        ppname = new javax.swing.JPanel();
        pname = new javax.swing.JPanel();
        pemail = new javax.swing.JPanel();
        luser21 = new javax.swing.JLabel();
        luser20 = new javax.swing.JLabel();
        luser19 = new javax.swing.JLabel();
        luser18 = new javax.swing.JLabel();
        luser17 = new javax.swing.JLabel();
        luser16 = new javax.swing.JLabel();
        luser14 = new javax.swing.JLabel();
        luser13 = new javax.swing.JLabel();
        luser12 = new javax.swing.JLabel();
        luser11 = new javax.swing.JLabel();
        luser10 = new javax.swing.JLabel();
        luser9 = new javax.swing.JLabel();
        luser8 = new javax.swing.JLabel();
        luser3 = new javax.swing.JLabel();
        luser7 = new javax.swing.JLabel();
        luser6 = new javax.swing.JLabel();
        luser5 = new javax.swing.JLabel();
        luser2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonOutLine1 = new swing.buttons.ButtonOutLine();
        page2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        luser22 = new javax.swing.JLabel();
        luser23 = new javax.swing.JLabel();
        pname1 = new javax.swing.JPanel();
        luser4 = new javax.swing.JLabel();
        buttonpublique1 = new javax.swing.JRadioButton();
        buttonprivee = new javax.swing.JRadioButton();
        luser30 = new javax.swing.JLabel();
        luser31 = new javax.swing.JLabel();
        st = new javax.swing.JCheckBox();
        multimedia = new javax.swing.JCheckBox();
        business = new javax.swing.JCheckBox();
        art = new javax.swing.JCheckBox();
        ss = new javax.swing.JCheckBox();
        sc = new javax.swing.JCheckBox();
        autre = new javax.swing.JCheckBox();
        luser29 = new javax.swing.JLabel();
        licence = new javax.swing.JCheckBox();
        master = new javax.swing.JCheckBox();
        doctorat = new javax.swing.JCheckBox();
        page3 = new javax.swing.JPanel();
        luser27 = new javax.swing.JLabel();
        radiomale = new javax.swing.JRadioButton();
        radiofemale = new javax.swing.JRadioButton();
        luser28 = new javax.swing.JLabel();
        imageAvatar1 = new swing.avatars.ImageAvatar();
        button1 = new swing.Cards.Button();
        buttonOutLine2 = new swing.buttons.ButtonOutLine();
        loading = new javax.swing.JPanel();
        politics = new javax.swing.JPanel();
        txt = new javax.swing.JTextPane();
        buttonCustom1 = new swing.buttons.ButtonCustom();
        buttonCustom2 = new swing.buttons.ButtonCustom();
        results = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextPane();
        button2 = new swing.Cards.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder1.setBackground(new java.awt.Color(247, 247, 247));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sliderpane.setBackground(new java.awt.Color(51, 51, 51));
        sliderpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 120, 239));
        jLabel3.setText("UEshare");
        sliderpane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 60));

        sliderButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sliderButton1MouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/more_than_45px.png"))); // NOI18N
        sliderButton1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        sliderpane.add(sliderButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 80, 70));

        slidertext.setBackground(new java.awt.Color(28, 120, 239));
        slidertext.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 22)); // NOI18N
        slidertext.setForeground(new java.awt.Color(28, 120, 239));
        slidertext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slidertext.setText("Créer le nouveau compte");
        sliderpane.add(slidertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 270, 40));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cancel_35px_1.png"))); // NOI18N
        close.setToolTipText("Fermer");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        sliderpane.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 40, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_minus_35px.png"))); // NOI18N
        jLabel2.setToolTipText("Minimiser");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        sliderpane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 30, 40));

        panelBorder1.add(sliderpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 525));

        signin.setBackground(new java.awt.Color(247, 247, 247));
        signin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(28, 120, 239));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Connexion");
        signin.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 210, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_45px_1.png"))); // NOI18N
        signin.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 50));

        jPanel3.setBackground(new java.awt.Color(28, 120, 239));
        signin.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 470, 2));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_lock_45px_1.png"))); // NOI18N
        signin.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 50, 50));

        jPanel4.setBackground(new java.awt.Color(28, 120, 239));
        signin.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 470, 2));
        signin.add(logpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));
        signin.add(loguser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        button3.setBackground(new java.awt.Color(28, 120, 239));
        button3.setText("Se connecter");
        button3.setEffectColor(new java.awt.Color(255, 255, 255));
        button3.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        signin.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 220, 60));

        panelBorder1.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 5, 510, 510));

        signup.setBackground(new java.awt.Color(247, 247, 247));
        signup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        page1.setBackground(new java.awt.Color(247, 247, 247));
        page1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        luser15.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        luser15.setForeground(new java.awt.Color(28, 120, 239));
        luser15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser15.setText("Veuillez remplir les zones suivantes s'il vous plait.");
        page1.add(luser15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 410, 30));

        tpassword.setBackground(new java.awt.Color(247, 247, 247));
        tpassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        tpassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tpassword.setBorder(null);
        tpassword.setEchoChar('*');
        tpassword.setOpaque(false);
        tpassword.setSelectionColor(new java.awt.Color(11, 129, 208));
        tpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tpasswordKeyReleased(evt);
            }
        });
        page1.add(tpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 310, 30));

        tcpassword.setBackground(new java.awt.Color(247, 247, 247));
        tcpassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        tcpassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tcpassword.setBorder(null);
        tcpassword.setEchoChar('*');
        tcpassword.setOpaque(false);
        tcpassword.setSelectionColor(new java.awt.Color(11, 129, 208));
        tcpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tcpasswordKeyReleased(evt);
            }
        });
        page1.add(tcpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 310, 30));

        tpname.setBackground(new java.awt.Color(247, 247, 247));
        tpname.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        tpname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tpname.setBorder(null);
        tpname.setOpaque(false);
        tpname.setSelectionColor(new java.awt.Color(11, 129, 208));
        tpname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tpnameKeyReleased(evt);
            }
        });
        page1.add(tpname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 390, 30));

        tname.setBackground(new java.awt.Color(247, 247, 247));
        tname.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        tname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tname.setBorder(null);
        tname.setSelectionColor(new java.awt.Color(11, 129, 208));
        tname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tnameKeyReleased(evt);
            }
        });
        page1.add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 390, 30));

        tuser.setBackground(new java.awt.Color(247, 247, 247));
        tuser.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        tuser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tuser.setBorder(null);
        tuser.setOpaque(false);
        tuser.setSelectionColor(new java.awt.Color(11, 129, 208));
        tuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tuserKeyReleased(evt);
            }
        });
        page1.add(tuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 310, 30));

        temail.setBackground(new java.awt.Color(247, 247, 247));
        temail.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        temail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        temail.setBorder(null);
        temail.setOpaque(false);
        temail.setSelectionColor(new java.awt.Color(11, 129, 208));
        temail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                temailKeyReleased(evt);
            }
        });
        page1.add(temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 340, 30));

        pcpassword.setBackground(new java.awt.Color(28, 120, 239));
        page1.add(pcpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 505, 1));

        ppassword.setBackground(new java.awt.Color(28, 120, 239));
        page1.add(ppassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 505, 1));

        puser.setBackground(new java.awt.Color(28, 120, 239));
        page1.add(puser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 505, 1));

        ppname.setBackground(new java.awt.Color(28, 120, 239));
        page1.add(ppname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 505, 1));

        pname.setBackground(new java.awt.Color(28, 120, 239));
        page1.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 505, 1));

        pemail.setBackground(new java.awt.Color(28, 120, 239));
        page1.add(pemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 505, 1));

        luser21.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        luser21.setForeground(new java.awt.Color(249, 45, 45));
        luser21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser21.setText("*");
        page1.add(luser21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 20, 30));

        luser20.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        luser20.setForeground(new java.awt.Color(249, 45, 45));
        luser20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser20.setText("*");
        page1.add(luser20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 20, 30));

        luser19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        luser19.setForeground(new java.awt.Color(28, 120, 239));
        luser19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser19.setText("Comfirmer");
        page1.add(luser19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 110, 30));

        luser18.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        luser18.setForeground(new java.awt.Color(249, 45, 45));
        luser18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser18.setText("*");
        page1.add(luser18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 20, 30));

        luser17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        luser17.setForeground(new java.awt.Color(28, 120, 239));
        luser17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser17.setText("Nom");
        page1.add(luser17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 50, 30));

        luser16.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        luser16.setForeground(new java.awt.Color(255, 0, 0));
        luser16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser16.setText("*");
        page1.add(luser16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 20, 30));

        luser14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        luser14.setForeground(new java.awt.Color(249, 45, 45));
        luser14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser14.setText("*");
        page1.add(luser14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 10, 30));

        luser13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        luser13.setForeground(new java.awt.Color(28, 120, 239));
        luser13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser13.setText("Mot de passe");
        page1.add(luser13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 140, 30));

        luser12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        luser12.setForeground(new java.awt.Color(249, 45, 45));
        luser12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser12.setText("*");
        page1.add(luser12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 20, 30));

        luser11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        luser11.setForeground(new java.awt.Color(28, 120, 239));
        luser11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser11.setText("Nom d'utilisateur");
        page1.add(luser11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, 30));

        luser10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        luser10.setForeground(new java.awt.Color(249, 45, 45));
        luser10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser10.setText("*");
        page1.add(luser10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 20, 30));

        luser9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        luser9.setForeground(new java.awt.Color(28, 120, 239));
        luser9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser9.setText("Prénom");
        page1.add(luser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 80, 30));

        luser8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        luser8.setForeground(new java.awt.Color(249, 45, 45));
        luser8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser8.setText("* : Obligatoire");
        page1.add(luser8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 500, 30));

        luser3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        luser3.setForeground(new java.awt.Color(28, 120, 239));
        luser3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser3.setText("Email");
        page1.add(luser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 60, 30));

        luser7.setBackground(new java.awt.Color(56, 123, 248));
        luser7.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        luser7.setForeground(new java.awt.Color(28, 120, 239));
        luser7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser7.setText("Bienvenue sur UEshare, Rejoignez-vous pour partager");
        page1.add(luser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 390, 30));

        luser6.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        luser6.setForeground(new java.awt.Color(28, 120, 239));
        luser6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser6.setText("votre connaissance avec des autres jeunes.");
        page1.add(luser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 310, 30));

        luser5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        luser5.setForeground(new java.awt.Color(28, 120, 239));
        luser5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser5.setText("Il faut verifier si vous êtes humain pour continuer à créer votre compte.");
        page1.add(luser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 500, 30));

        luser2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        luser2.setForeground(new java.awt.Color(255, 0, 0));
        luser2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser2.setText("*");
        page1.add(luser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 20, 30));

        jLabel7.setBackground(new java.awt.Color(28, 120, 239));
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(28, 120, 239));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Créer un compte");
        page1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 290, 70));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_more_10px_1.png"))); // NOI18N
        page1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 30, 30));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/invisible_20px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        page1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 20, 30));

        buttonOutLine1.setBackground(new java.awt.Color(22, 176, 53));
        buttonOutLine1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonOutLine1.setForeground(new java.awt.Color(22, 176, 53));
        buttonOutLine1.setText("Verifier maintenant");
        buttonOutLine1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        buttonOutLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine1ActionPerformed(evt);
            }
        });
        page1.add(buttonOutLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 180, 40));

        signup.add(page1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 460));

        page2.setBackground(new java.awt.Color(247, 247, 247));
        page2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(28, 120, 239));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Créer un compte");
        page2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 290, 70));

        luser22.setBackground(new java.awt.Color(56, 123, 248));
        luser22.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        luser22.setForeground(new java.awt.Color(28, 120, 239));
        luser22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser22.setText("Vous êtes un peu plus près de l'enchèvement...");
        page2.add(luser22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 420, 30));

        luser23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        luser23.setForeground(new java.awt.Color(28, 120, 239));
        luser23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser23.setText("Date de naissance:");
        page2.add(luser23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 30));

        datechooser.setBackground(new java.awt.Color(239, 239, 239));
        datechooser.setForeground(new java.awt.Color(255, 255, 255));
        datechooser.setAutoscrolls(true);
        datechooser.setDateFormatString("yyyy-MM-dd");
        datechooser.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        datechooser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_event_30px.png")));
        datechooser.setOpaque(false);
        datechooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datechooserMouseClicked(evt);
            }
        });
        page2.add(datechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 190, 30));

        pname1.setBackground(new java.awt.Color(28, 120, 239));
        page2.add(pname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 365, 1));

        luser4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        luser4.setForeground(new java.awt.Color(28, 120, 239));
        luser4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser4.setText("Remplir votre status academique");
        page2.add(luser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 330, 30));

        buttonpublique1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 20)); // NOI18N
        buttonpublique1.setForeground(new java.awt.Color(28, 120, 239));
        buttonpublique1.setSelected(true);
        buttonpublique1.setText("Université publique");
        buttonpublique1.setOpaque(false);
        buttonpublique1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpublique1ActionPerformed(evt);
            }
        });
        page2.add(buttonpublique1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 200, -1));

        buttonprivee.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 20)); // NOI18N
        buttonprivee.setForeground(new java.awt.Color(28, 120, 239));
        buttonprivee.setText("Université privée");
        buttonprivee.setOpaque(false);
        buttonprivee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpriveeActionPerformed(evt);
            }
        });
        page2.add(buttonprivee, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 180, -1));

        luser30.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 20)); // NOI18N
        luser30.setForeground(new java.awt.Color(28, 120, 239));
        luser30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser30.setText("Séléctionner votre université");
        page2.add(luser30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 260, 30));

        unicombo.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        unicombo.setBorder(null);
        unicombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unicomboActionPerformed(evt);
            }
        });
        page2.add(unicombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 230, 30));

        luser31.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 20)); // NOI18N
        luser31.setForeground(new java.awt.Color(28, 120, 239));
        luser31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser31.setText("Séléctionner les secteurs qui vous intérrèssent");
        page2.add(luser31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 420, 30));

        st.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        st.setForeground(new java.awt.Color(28, 120, 239));
        st.setSelected(true);
        st.setText("Sciences et Technologie");
        st.setBorder(null);
        st.setOpaque(false);
        st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stActionPerformed(evt);
            }
        });
        page2.add(st, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, -1));

        multimedia.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        multimedia.setForeground(new java.awt.Color(28, 120, 239));
        multimedia.setText("Multimedia");
        multimedia.setBorder(null);
        multimedia.setOpaque(false);
        multimedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multimediaActionPerformed(evt);
            }
        });
        page2.add(multimedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, -1));

        business.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        business.setForeground(new java.awt.Color(28, 120, 239));
        business.setText("Business");
        business.setBorder(null);
        business.setOpaque(false);
        business.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessActionPerformed(evt);
            }
        });
        page2.add(business, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        art.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        art.setForeground(new java.awt.Color(28, 120, 239));
        art.setText("Art et culture");
        art.setBorder(null);
        art.setOpaque(false);
        art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artActionPerformed(evt);
            }
        });
        page2.add(art, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 100, -1));

        ss.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ss.setForeground(new java.awt.Color(28, 120, 239));
        ss.setText("Sciences de la santé");
        ss.setBorder(null);
        ss.setOpaque(false);
        ss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssActionPerformed(evt);
            }
        });
        page2.add(ss, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 140, -1));

        sc.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        sc.setForeground(new java.awt.Color(28, 120, 239));
        sc.setText("Sciences de comptabilité");
        sc.setBorder(null);
        sc.setOpaque(false);
        sc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scActionPerformed(evt);
            }
        });
        page2.add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 180, -1));

        autre.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        autre.setForeground(new java.awt.Color(28, 120, 239));
        autre.setText("Autre");
        autre.setBorder(null);
        autre.setOpaque(false);
        autre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autreActionPerformed(evt);
            }
        });
        page2.add(autre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 60, -1));

        luser29.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 20)); // NOI18N
        luser29.setForeground(new java.awt.Color(28, 120, 239));
        luser29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser29.setText("Séléctionner votre niveau d'études");
        page2.add(luser29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 330, 30));

        licence.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        licence.setForeground(new java.awt.Color(28, 120, 239));
        licence.setSelected(true);
        licence.setText("Licence");
        licence.setBorder(null);
        licence.setOpaque(false);
        licence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenceActionPerformed(evt);
            }
        });
        page2.add(licence, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 70, -1));

        master.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        master.setForeground(new java.awt.Color(28, 120, 239));
        master.setText("Master");
        master.setBorder(null);
        master.setOpaque(false);
        master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterActionPerformed(evt);
            }
        });
        page2.add(master, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 80, -1));

        doctorat.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        doctorat.setForeground(new java.awt.Color(28, 120, 239));
        doctorat.setText("Doctorat");
        doctorat.setBorder(null);
        doctorat.setOpaque(false);
        doctorat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctoratActionPerformed(evt);
            }
        });
        page2.add(doctorat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 80, -1));

        signup.add(page2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 460));

        page3.setBackground(new java.awt.Color(247, 247, 247));
        page3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        luser27.setBackground(new java.awt.Color(28, 120, 239));
        luser27.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        luser27.setForeground(new java.awt.Color(28, 120, 239));
        luser27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser27.setText("Choisissez votre sexe");
        page3.add(luser27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, 30));

        radiomale.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        radiomale.setForeground(new java.awt.Color(28, 120, 239));
        radiomale.setSelected(true);
        radiomale.setText("Male");
        radiomale.setOpaque(false);
        radiomale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiomaleActionPerformed(evt);
            }
        });
        page3.add(radiomale, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        radiofemale.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        radiofemale.setForeground(new java.awt.Color(28, 120, 239));
        radiofemale.setText("Femelle");
        radiofemale.setOpaque(false);
        radiofemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiofemaleActionPerformed(evt);
            }
        });
        page3.add(radiofemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        luser28.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        luser28.setForeground(new java.awt.Color(28, 120, 239));
        luser28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        luser28.setText("Veuillez ajouter votre photo de profile");
        page3.add(luser28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 360, 30));

        imageAvatar1.setBorderSize(5);
        imageAvatar1.setBorderSpace(1);
        imageAvatar1.setGradientColor1(new java.awt.Color(153, 153, 153));
        imageAvatar1.setGradientColor2(new java.awt.Color(51, 51, 51));
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_male_127px.png"))); // NOI18N

        button1.setBackground(new java.awt.Color(28, 120, 239));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cam.png"))); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        imageAvatar1.add(button1);
        button1.setBounds(65, 150, 50, 50);

        page3.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 180, 200));

        buttonOutLine2.setBackground(new java.awt.Color(0, 255, 0));
        buttonOutLine2.setForeground(new java.awt.Color(0, 255, 0));
        buttonOutLine2.setText("S'inscrire");
        buttonOutLine2.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        buttonOutLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine2ActionPerformed(evt);
            }
        });
        page3.add(buttonOutLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 150, 50));

        signup.add(page3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 460));

        loading.setBackground(new java.awt.Color(247, 247, 247));
        loading.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        politics.setOpaque(false);
        politics.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt.setEditable(false);
        txt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt.setText("UEShare est une application qui promeut la paix, la solidarité et l'amitié.\nSi vous remarquez une présence de la violation des droits de l'utilisateur,\nveuillez signaler notre equipe d'aide et nous vous aidera tout de suite.\n\nAprès avoir se faire inscrire, l'utilisateur aura la capacité de contacter les autres\nutilisateurs, concerver les fichiers dans une base de données, télécharger\nles fichiers publiques publiés par les autres utilisateurs ou par notre equipe.\n\nLa sécurité est 100% assurée et aucun pourra avoir les informations d'autrui.\n\nNB: On ne supportera jamais la nudité ou tout ce qui est en relation avec la politique.\n\nEn cliquant sur Terminer, vous agréez aux conditions et politiques de notre application.\nMerci.");
        txt.setFocusable(false);
        txt.setOpaque(false);
        politics.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 490, 330));

        buttonCustom1.setBackground(new java.awt.Color(255, 0, 0));
        buttonCustom1.setText("Annuler");
        buttonCustom1.setColorHover(new java.awt.Color(231, 26, 26));
        buttonCustom1.setColorPressed(new java.awt.Color(231, 26, 26));
        buttonCustom1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonCustom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustom1ActionPerformed(evt);
            }
        });
        politics.add(buttonCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 120, 40));

        buttonCustom2.setText("Terminer");
        buttonCustom2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonCustom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustom2ActionPerformed(evt);
            }
        });
        politics.add(buttonCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 420, 120, 40));

        loading.add(politics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 460));

        results.setOpaque(false);
        results.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_checked_50px.png"))); // NOI18N
        results.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 100, 80));

        txt1.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        txt1.setForeground(new java.awt.Color(28, 120, 239));
        txt1.setText("Félicitation, votre compte est créer avec succès. Veuillez \nvous connecter afin d'avoir une éxperience éxtraordinaire.\nMerci!");
        txt1.setOpaque(false);
        results.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 450, 100));

        button2.setBackground(new java.awt.Color(0, 204, 0));
        button2.setText("Se connecter");
        button2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        results.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 130, 40));

        loading.add(results, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 450, 240));

        signup.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 460));
        signup.add(buttonspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        panelBorder1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 5, 510, 515));

        getContentPane().add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        if (signin.getWidth() == 0) {
            signin.setVisible(false);
            signup.setVisible(true);
        }
        MessageDialog obj = new MessageDialog(this);
        obj.showMessage("Attention", "Voulez-vous vraiment quitter l'application?");
        if (obj.getMessagetype() == MessageDialog.MessageType.OK) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cancel_35px_2.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cancel_35px_1.png")));
    }//GEN-LAST:event_closeMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setExtendedState(Loginpage.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_minus_35px_1.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_minus_35px.png")));
    }//GEN-LAST:event_jLabel2MouseExited

    private void sliderButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderButton1MouseClicked
        int length = signin.getWidth();
        if (sliderclick == 0) {
            signup.setSize(510, 515);
            signup.setVisible(true);
            if (page2.isVisible()) {

            }
            slidertext.setText("Créer le nouveau compte");
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 510; i >= 0; i--) {
                            Thread.sleep(1);
                            signin.setSize(i, 515);
                        }
                    } catch (InterruptedException e) {
                    }
                }
            };
            th.start();
            tname.requestFocus();
            sliderclick++;
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/less_than_45px.png")));
        } else {
            //Open the signin page to connect to your account
            signin.setSize(510, 515);
            signin.setVisible(true);
            slidertext.setText("Se connecter");
            Thread th1 = new Thread() {

                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= 510; i++) {
                            Thread.sleep(1);
                            signin.setSize(i, 515);
                            if (i == 500) {
                                signup.setVisible(false);

                            }
                        }
                    } catch (InterruptedException e) {
                    }
                }
            };
            th1.start();
            sliderclick--;
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/more_than_45px.png")));
        }
        if (signin.getWidth() == 0) {
            signin.setVisible(false);
        }


    }//GEN-LAST:event_sliderButton1MouseClicked

    private void temailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_temailKeyReleased

        int code = evt.getKeyCode();
        if (code == 38) {
            tcpassword.requestFocus();
        }
        if (temail.getText().length() == 0) {

        }
    }//GEN-LAST:event_temailKeyReleased

    private void tuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tuserKeyReleased
        int code = evt.getKeyCode();
        if (code == 40) {
            tpassword.requestFocus();
        } else if (code == 38) {
            tpname.requestFocus();
        }
        if (tuser.getText().length() == 0) {

        }
    }//GEN-LAST:event_tuserKeyReleased

    private void tnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnameKeyReleased
        int code = evt.getKeyCode();
        if (code == 40) {
            tpname.requestFocus();
        }
        if (tname.getText().length() == 0) {

        }
    }//GEN-LAST:event_tnameKeyReleased

    private void tpnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpnameKeyReleased
        int code = evt.getKeyCode();
        if (code == 40) {
            tuser.requestFocus();
        } else if (code == 38) {
            tname.requestFocus();
        }
        if (tpname.getText().length() == 0) {

        }
    }//GEN-LAST:event_tpnameKeyReleased

    private void tcpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcpasswordKeyReleased
        int code = evt.getKeyCode();

        if (code == 40) {
            temail.requestFocus();
            String pass = new String(tpassword.getPassword());
            String cpass = new String(tcpassword.getPassword());
            signin.setVisible(false);
            if (pass.equals(cpass)) {
                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_checkmark_25px.png")));
            } else {
                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_delete_25px.png")));
            }

        } else if (code == 38) {
            tpassword.requestFocus();

        }
        if (tcpassword.getPassword().toString().length() == 0) {

        }
    }//GEN-LAST:event_tcpasswordKeyReleased

    private void tpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpasswordKeyReleased
        String a = new String(tpassword.getPassword());

        int code = evt.getKeyCode();
        if (code == 40) {
            tcpassword.requestFocus();
            Thread th1 = new Thread() {

                @Override
                public void run() {

                    try {

                        for (int i = 0; i <= 30; i++) {

                            Thread.sleep(1);
                            jLabel10.setSize(i, 30);

                        }
                    } catch (InterruptedException e) {

                    }
                }
            };
            th1.start();
        } else if (code == 38) {
            tuser.requestFocus();
        }

        if (a.length() == 0) {

        }
    }//GEN-LAST:event_tpasswordKeyReleased

    private void datechooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datechooserMouseClicked

    }//GEN-LAST:event_datechooserMouseClicked

    private void buttonpublique1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpublique1ActionPerformed
        buttonpublique1.setSelected(true);
        buttonprivee.setSelected(false);
        Connector con = new Connector();
        con.setUniCombo("public");
    }//GEN-LAST:event_buttonpublique1ActionPerformed

    private void buttonpriveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpriveeActionPerformed
        buttonpublique1.setSelected(false);
        buttonprivee.setSelected(true);
        Connector con = new Connector();
        con.setUniCombo("private");
    }//GEN-LAST:event_buttonpriveeActionPerformed

    private void unicomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unicomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unicomboActionPerformed

    private void stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stActionPerformed
        if (st.isSelected()) {
            sc.setSelected(false);
            ss.setSelected(false);
            multimedia.setSelected(false);
            business.setSelected(false);
            art.setSelected(false);
            autre.setSelected(false);
            course = st.getText();
        }
    }//GEN-LAST:event_stActionPerformed

    private void multimediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multimediaActionPerformed
        if (multimedia.isSelected()) {
            sc.setSelected(false);
            st.setSelected(false);
            ss.setSelected(false);
            business.setSelected(false);
            art.setSelected(false);
            autre.setSelected(false);
            course = multimedia.getText();
        }
    }//GEN-LAST:event_multimediaActionPerformed

    private void businessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessActionPerformed
        if (business.isSelected()) {
            sc.setSelected(false);
            st.setSelected(false);
            multimedia.setSelected(false);
            ss.setSelected(false);
            art.setSelected(false);
            autre.setSelected(false);
            course = business.getText();
        }
    }//GEN-LAST:event_businessActionPerformed

    private void artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artActionPerformed
        if (art.isSelected()) {
            sc.setSelected(false);
            st.setSelected(false);
            multimedia.setSelected(false);
            business.setSelected(false);
            ss.setSelected(false);
            autre.setSelected(false);
            course = art.getText();
        }
    }//GEN-LAST:event_artActionPerformed

    private void ssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssActionPerformed
        if (ss.isSelected()) {
            sc.setSelected(false);
            st.setSelected(false);
            multimedia.setSelected(false);
            business.setSelected(false);
            art.setSelected(false);
            autre.setSelected(false);
            course = ss.getText();
        }
    }//GEN-LAST:event_ssActionPerformed

    private void scActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scActionPerformed
        if (sc.isSelected()) {
            ss.setSelected(false);
            st.setSelected(false);
            multimedia.setSelected(false);
            business.setSelected(false);
            art.setSelected(false);
            autre.setSelected(false);
            course = sc.getText();
        }
    }//GEN-LAST:event_scActionPerformed

    private void autreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autreActionPerformed
        if (autre.isSelected()) {
            sc.setSelected(false);
            st.setSelected(false);
            multimedia.setSelected(false);
            business.setSelected(false);
            art.setSelected(false);
            ss.setSelected(false);
            course = "autre";
        }
    }//GEN-LAST:event_autreActionPerformed

    private void licenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenceActionPerformed
        if (licence.isSelected()) {
            doctorat.setSelected(false);
            master.setSelected(false);
            year = licence.getText();
        }
    }//GEN-LAST:event_licenceActionPerformed

    private void masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterActionPerformed
        if (master.isSelected()) {
            doctorat.setSelected(false);
            licence.setSelected(false);
            year = master.getText();
        }
    }//GEN-LAST:event_masterActionPerformed

    private void doctoratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctoratActionPerformed
        if (doctorat.isSelected()) {
            licence.setSelected(false);
            master.setSelected(false);
            year = doctorat.getText();
        }
    }//GEN-LAST:event_doctoratActionPerformed

    private void radiomaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiomaleActionPerformed
        radiofemale.setSelected(false);
        sex = radiomale.getText();
    }//GEN-LAST:event_radiomaleActionPerformed

    private void radiofemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiofemaleActionPerformed

        radiomale.setSelected(false);
        sex = radiofemale.getText();
    }//GEN-LAST:event_radiofemaleActionPerformed

    private void buttonOutLine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOutLine2ActionPerformed
        page3.setVisible(false);
        loading.setVisible(true);
        if (loading.isVisible()) {
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 1; i <= 9; i++) {

                            Thread.sleep(100);

                        }
                    } catch (InterruptedException e) {
                    }
                }
            };
            th.start();
        }
        //  connection.newUser();
    }//GEN-LAST:event_buttonOutLine2ActionPerformed

    private void buttonOutLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOutLine1ActionPerformed
        ErrorMessage error1 = new ErrorMessage(this);
        Connector conne = new Connector();
        int name = tname.getText().length();
        int pnamee = tpname.getText().length();
        int user = tuser.getText().length();
        String dbusername = conne.getUsername(tuser.getText());
        String pass = new String(tpassword.getPassword());
        String cpassword = new String(tcpassword.getPassword());
        int password = new String(tpassword.getPassword()).length();
        int cpass = new String(tpassword.getPassword()).length();
        int email = temail.getText().length();
        if ((name == 0) || (pnamee == 0) || (user == 0) || (password == 0) || (cpass == 0) || (email == 0)) {

            error1.showMessage("Erreur!", "Remplir tous les zones est obligatoire!");

        } else if (!pass.equals(cpassword)) {
            error1.showMessage("Erreur!", "Les deux mots de passe doivent être les mêmes!");

        } else if ((password < 8) || (cpass < 8)) {
            error1.showMessage("Erreur!", "Le mot de passe doit contenir au moins 8 charactères");

        } else if (tuser.getText().equals(dbusername)) {
            error1.showMessage("Erreur!", "Le nom d'utilisateur existe");

        } else {

            if (temail.getText().contains("@gmail.com")) {
                VerificationMessage ver = new VerificationMessage(this);
                ver.showMessage();

            } else {
                error1.showMessage("Erreur!", "Il fault ecrire le vrai compte Gmail \n Exemple: ndayisabajean@gmail.com");

            }
        }
        signin.setVisible(false);


    }//GEN-LAST:event_buttonOutLine1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        JnaFileChooser chooser = new JnaFileChooser();
        chooser.showOpenDialog(this);
        File f = chooser.getSelectedFile();
        String profile = f.getAbsolutePath();

        ImageIcon ImageIcon = new ImageIcon(new ImageIcon(profile).getImage().getScaledInstance(280, 370, Image.SCALE_SMOOTH));
        imageAvatar1.setImage(ImageIcon);
        try {
            File image = new File(profile);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] bof = new byte[1024];
            for (int r; (r = fis.read(bof)) != -1;) {
                bos.write(bof, 0, r);
            }
            profilepic = bos.toByteArray();

        } catch (IOException e) {

        }

    }//GEN-LAST:event_button1ActionPerformed

    private void buttonCustom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustom1ActionPerformed

        MessageDialog obj = new MessageDialog(this);
        obj.showMessage("Attention", "Voulez-vous vraiment annuler la creation de votre compte?");
        if (obj.getMessagetype() == MessageDialog.MessageType.OK) {
            loading.setVisible(false);
            politics.setVisible(true);
            results.setVisible(false);
            page3.setVisible(true);
            buttonspanel.setVisible(true);
        }
    }//GEN-LAST:event_buttonCustom1ActionPerformed

    private void buttonCustom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustom2ActionPerformed
        politics.setVisible(false);
        results.setVisible(true);
    }//GEN-LAST:event_buttonCustom2ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        signin.setSize(510, 515);
        signin.setVisible(true);
        loguser.setTextFieldText("");
        logpass1.setPasswordText("");
        slidertext.setText("Se connecter");
        Thread th1 = new Thread() {

            @Override
            public void run() {
                try {
                    for (int i = 0; i <= 510; i++) {
                        Thread.sleep(1);
                        signin.setSize(i, 515);
                        if (i == 500) {
                            signup.setVisible(false);

                        }
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        th1.start();
        sliderclick--;
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/more_than_45px.png")));
        page1.setVisible(true);
        page3.setVisible(false);
    }//GEN-LAST:event_button2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox art;
    private javax.swing.JCheckBox autre;
    private javax.swing.JCheckBox business;
    private swing.Cards.Button button1;
    private swing.Cards.Button button2;
    private swing.Cards.Button button3;
    private swing.buttons.ButtonCustom buttonCustom1;
    private swing.buttons.ButtonCustom buttonCustom2;
    private swing.buttons.ButtonOutLine buttonOutLine1;
    private swing.buttons.ButtonOutLine buttonOutLine2;
    private javax.swing.JRadioButton buttonprivee;
    private javax.swing.JRadioButton buttonpublique1;
    public static final swing.buttons.buttonspanel.form buttonspanel = new swing.buttons.buttonspanel.form();
    private javax.swing.JLabel close;
    public static final com.toedter.calendar.JDateChooser datechooser = new com.toedter.calendar.JDateChooser();
    private javax.swing.JCheckBox doctorat;
    private swing.avatars.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JCheckBox licence;
    private javax.swing.JPanel loading;
    public static final swing.fields.passwordField logpass1 = new swing.fields.passwordField();
    public static final swing.fields.textField loguser = new swing.fields.textField();
    private javax.swing.JLabel luser10;
    private javax.swing.JLabel luser11;
    private javax.swing.JLabel luser12;
    private javax.swing.JLabel luser13;
    private javax.swing.JLabel luser14;
    private javax.swing.JLabel luser15;
    private javax.swing.JLabel luser16;
    private javax.swing.JLabel luser17;
    private javax.swing.JLabel luser18;
    private javax.swing.JLabel luser19;
    private javax.swing.JLabel luser2;
    private javax.swing.JLabel luser20;
    private javax.swing.JLabel luser21;
    private javax.swing.JLabel luser22;
    private javax.swing.JLabel luser23;
    private javax.swing.JLabel luser27;
    private javax.swing.JLabel luser28;
    private javax.swing.JLabel luser29;
    private javax.swing.JLabel luser3;
    private javax.swing.JLabel luser30;
    private javax.swing.JLabel luser31;
    private javax.swing.JLabel luser4;
    private javax.swing.JLabel luser5;
    private javax.swing.JLabel luser6;
    private javax.swing.JLabel luser7;
    private javax.swing.JLabel luser8;
    private javax.swing.JLabel luser9;
    private javax.swing.JCheckBox master;
    private javax.swing.JCheckBox multimedia;
    private javax.swing.JPanel page1;
    private javax.swing.JPanel page2;
    private javax.swing.JPanel page3;
    private swing.panels.PanelBorder panelBorder1;
    private javax.swing.JPanel pcpassword;
    private javax.swing.JPanel pemail;
    private javax.swing.JPanel pname;
    private javax.swing.JPanel pname1;
    private javax.swing.JPanel politics;
    private javax.swing.JPanel ppassword;
    private javax.swing.JPanel ppname;
    private javax.swing.JPanel puser;
    private javax.swing.JRadioButton radiofemale;
    private javax.swing.JRadioButton radiomale;
    private javax.swing.JPanel results;
    private javax.swing.JCheckBox sc;
    private javax.swing.JPanel signin;
    private javax.swing.JPanel signup;
    private swing.buttons.SliderButton sliderButton1;
    private swing.panels.PanelBorder sliderpane;
    private javax.swing.JLabel slidertext;
    private javax.swing.JCheckBox ss;
    private javax.swing.JCheckBox st;
    public static final javax.swing.JPasswordField tcpassword = new javax.swing.JPasswordField();
    public static final javax.swing.JTextField temail = new javax.swing.JTextField();
    public static final javax.swing.JTextField tname = new javax.swing.JTextField();
    public static final javax.swing.JPasswordField tpassword = new javax.swing.JPasswordField();
    public static final javax.swing.JTextField tpname = new javax.swing.JTextField();
    public static final javax.swing.JTextField tuser = new javax.swing.JTextField();
    private javax.swing.JTextPane txt;
    private javax.swing.JTextPane txt1;
    public static final javax.swing.JComboBox<String> unicombo = new javax.swing.JComboBox<>();
    // End of variables declaration//GEN-END:variables
}
