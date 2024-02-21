package swing.Mainpage.components;


import java.sql.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import swing.Cards.Button;
import swing.Cards.User_card;
import swing.panels.utilities.WrapLayout;

public final class Accueil extends javax.swing.JPanel {

    public Accueil() {
        initComponents();
       // init();
//        initEvents();
//        addUsercard();
//        addPostcard();
    }

    public void addUsercard() {
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db", "root", "");
            PreparedStatement pst = con.prepareStatement("select * from user");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                User_card card = new User_card();
                ImageIcon newImage;
                String fullname = rs.getString("first_name") + " " + rs.getString("last_name");
                int nameLength = fullname.length();
                if (nameLength <= 15) {
                    card.setFontSize(16);
                } else if (nameLength > 15 && nameLength <= 18) {
                    card.setFontSize(14);
                } else if (nameLength > 18) {
                    fullname = rs.getString("first_name") + " " + rs.getString("last_name").charAt(0) + ".";
                }
                String username = rs.getString("username");
                byte[] img = rs.getBytes("picture");
                if (img != null) {
                    ImageIcon imge = new ImageIcon(img);
                    Image im = imge.getImage();
                    Image im1 = im.getScaledInstance(300, 370, Image.SCALE_SMOOTH);
                    newImage = new ImageIcon(im1);
                    card.setIcon(newImage);
                } else {
                    card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/noprofile.png")));
                }

                card.setName(fullname);
                card.setDescription(username);
               // userpane.add(card);

            }

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }

    private void addPostcard() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db", "root", "");
            PreparedStatement pst = con.prepareStatement("select picture,username,post_file,post_text,date from user,posts where user.id=posts.user_id");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
               
                ImageIcon newImage;
                ImageIcon newImageAvatar;
                String username = rs.getString("username");
                String text = rs.getString("post_text");
                String fulltext = rs.getString("post_text");
                if (text.length() >= 20) {
                    text = text.substring(0, Math.min(text.length(), 20));
                    text = text + "...";
                }
                java.util.Date date = rs.getDate("date");
                byte[] img = rs.getBytes("post_file");
                byte[] imgAvatar = rs.getBytes("picture");
                if(imgAvatar==null){
                    
                }
                ImageIcon imgeAvatar = new ImageIcon(imgAvatar);
                Image imAvatar = imgeAvatar.getImage();
                Image imAvatar1 = imAvatar.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
               
                newImageAvatar = new ImageIcon(imAvatar1);
                 //card.setPosterAvatar(newImageAvatar);
                if (img != null) {
                    ImageIcon imge = new ImageIcon(img);
                    Image im = imge.getImage();
                    Image im1 = im.getScaledInstance(461, 385, Image.SCALE_SMOOTH);
                    newImage = new ImageIcon(im1);
                   // card.setPostPicture(newImage);
                } else {
                    //card.setPostPicture(new javax.swing.ImageIcon(getClass().getResource("/icons/noprofile.png")));
                }
               // card.setDateText("" + date);
               // card.setPosterName(username);
                //card.setPostText(text);
               
            }

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

//    private void init() {
//        userpane.setLayout(new WrapLayout(WrapLayout.LEADING));
//        postpane.setLayout(new WrapLayout(WrapLayout.LEADING));
//        user_scrollpane.setBackground(new Color(0, 0, 0, 0));
//        panelBorder1.setBackground(new Color(139, 176, 253, 140));
//        panelBorder2.setBackground(new Color(139, 176, 253, 140));
//        userpane.setBackground(new Color(0, 0, 0, 0));
//        post_scrollpane.setBackground(new Color(0, 0, 0, 0));
//        postpane.setBackground(new Color(0, 0, 0, 0));
//    }
//
//    public void initEvents() {
//        postpanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent evt) {
//                postpanel.setBackground(new Color(204, 204, 204, 80));
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent evt) {
//                postpanel.setBackground(new Color(204, 204, 204));
//            }
//        });
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(249, 249, 249));

        jLabel1.setBackground(new java.awt.Color(28, 120, 239));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(28, 120, 239));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Accueil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 899, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(923, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
