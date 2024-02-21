package pages;
import io.socket.emitter.Emitter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import net.miginfocom.swing.MigLayout;
import service.Service;
import swing.Mainpage.components.Accueil;
import swing.Mainpage.components.MainForm;
import swing.Mainpage.components.MenuCustomsComponents.EventMenuSelected;
import swing.Mainpage.components.Deconnexion;
import swing.Mainpage.components.Interuniversitaire1;
import swing.panels.utilities.ComponentResizer;

public class Mainpage extends javax.swing.JFrame {

    private MigLayout layout;
    private MainForm main;
    private int x, y;
    private static Mainpage mainpage;
    private Interuniversitaire1 interuniversitaire;
    public Mainpage() {
        initComponents();
        init();
        initprofile();
        menuEvents();
        header1.initEvents(Mainpage.this, profilemenu);

    }

    private void init() {
        ComponentResizer com = new ComponentResizer();
        com.registerComponent(this);
        com.setMinimumSize(new Dimension(600, 500));
        com.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        com.setSnapSize(new Dimension(10, 10));
        setBackground(new Color(0, 0, 0, 0));
        layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
        main = new MainForm();
        mainpage = this;
       
    }

    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }

    public static Mainpage getMain() {
        return mainpage;
    }

    private void initprofile() {
        profilemenu.setBackground(new Color(0, 0, 0, 0));
        StyledDocument doc = name.getStyledDocument();
        StyledDocument doc1 = user1.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc1.setParagraphAttributes(0, doc1.getLength(), center, false);
        name.setOpaque(false);
        name.setBackground(new Color(0, 0, 0, 0));
        user1.setOpaque(false);
        user1.setBackground(new Color(0, 0, 0, 0));
    }

    private void menuEvents() {
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (index == 0) {
                    showForm(new Accueil());
                } else if (index == 8 && indexSubMenu == 1) {
                    showForm(new Deconnexion());
                }else if(index==1&&indexSubMenu==3){
                    interuniversitaire= new Interuniversitaire1();
                    interuniversitaire.initEvents();
               showForm(interuniversitaire);
                    Emitter emit= Service.getInstance().getClient().emit("list_user", Service.getInstance().getUser().getUserID());
                }
            }
        });
        menu.setSelectedIndex(0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooserBeanInfo1 = new com.toedter.calendar.JDateChooserBeanInfo();
        panelBorder1 = new swing.Mainpage.components.Background();
        header1 = new swing.Mainpage.components.Header();
        scrollPaneWin112 = new swing.panels.ScrollPaneWin11();
        body = new javax.swing.JPanel();
        mainmenu = new javax.swing.JPanel();
        profilemenu = new javax.swing.JPanel();
        user1 = new javax.swing.JTextPane();
        name = new javax.swing.JTextPane();
        imageAvatar1 = new swing.avatars.ImageAvatar();
        jLabel1 = new javax.swing.JLabel();
        menupanel = new javax.swing.JPanel();
        menu = new swing.Mainpage.components.MenuCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(215, 153, 112));

        header1.setBackground(new java.awt.Color(226, 226, 226));

        scrollPaneWin112.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneWin112.setBorder(null);

        body.setBackground(new java.awt.Color(249, 249, 249));
        body.setLayout(new java.awt.BorderLayout());
        scrollPaneWin112.setViewportView(body);

        mainmenu.setBackground(new java.awt.Color(249, 249, 249));

        profilemenu.setBackground(new java.awt.Color(249, 249, 249));

        user1.setEditable(false);
        user1.setBackground(new java.awt.Color(244, 244, 244));
        user1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        user1.setForeground(new java.awt.Color(100, 100, 100));
        user1.setText("@username");
        user1.setFocusable(false);
        user1.setOpaque(false);

        name.setEditable(false);
        name.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        name.setText("full name");
        name.setToolTipText("");
        name.setFocusable(false);
        name.setOpaque(false);

        imageAvatar1.setGradientColor1(new java.awt.Color(199, 210, 199));
        imageAvatar1.setGradientColor2(new java.awt.Color(0, 204, 0));

        jLabel1.setBackground(new java.awt.Color(28, 120, 239));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(28, 120, 239));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ueshare");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout profilemenuLayout = new javax.swing.GroupLayout(profilemenu);
        profilemenu.setLayout(profilemenuLayout);
        profilemenuLayout.setHorizontalGroup(
            profilemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilemenuLayout.createSequentialGroup()
                .addGroup(profilemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addComponent(user1)
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        profilemenuLayout.setVerticalGroup(
            profilemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilemenuLayout.createSequentialGroup()
                .addGroup(profilemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(profilemenuLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menupanel.setBackground(new java.awt.Color(249, 249, 249));

        menu.setBackground(new java.awt.Color(249, 249, 249));

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainmenuLayout = new javax.swing.GroupLayout(mainmenu);
        mainmenu.setLayout(mainmenuLayout);
        mainmenuLayout.setHorizontalGroup(
            mainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profilemenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainmenuLayout.setVerticalGroup(
            mainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainmenuLayout.createSequentialGroup()
                .addComponent(profilemenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                    .addComponent(scrollPaneWin112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollPaneWin112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(mainmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        this.setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
    }//GEN-LAST:event_jLabel1MouseDragged

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
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private swing.Mainpage.components.Header header1;
    private swing.avatars.ImageAvatar imageAvatar1;
    private com.toedter.calendar.JDateChooserBeanInfo jDateChooserBeanInfo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainmenu;
    private swing.Mainpage.components.MenuCustom menu;
    private javax.swing.JPanel menupanel;
    private javax.swing.JTextPane name;
    private swing.Mainpage.components.Background panelBorder1;
    private javax.swing.JPanel profilemenu;
    private swing.panels.ScrollPaneWin11 scrollPaneWin112;
    private javax.swing.JTextPane user1;
    // End of variables declaration//GEN-END:variables
}
