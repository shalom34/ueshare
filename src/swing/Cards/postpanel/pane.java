package swing.Cards.postpanel;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;

public class pane extends javax.swing.JPanel {
    private boolean isFull=true;
    private String paneText;
    private Icon panePhoto;
    private int pictureWidth, pictureHeight;
    
    public int getPictureWidth() {
        this.pictureWidth = photo.getWidth();
        return pictureWidth;
    }
    
    public void setPictureWidth(int pictureWidth) {
        this.pictureWidth = pictureWidth;
    }
    
    public int getPictureHeight() {
        this.pictureHeight = photo.getHeight();
        return pictureHeight;
    }
    
    public void setPictureHeight(int pictureHeight) {
        this.pictureHeight = pictureHeight;
    }
    
    public String getPaneText() {
        return paneText;
    }
    
    public void setPaneText(String paneText) {
        this.paneText = paneText;
        txt.setText(paneText);
    }
    
    public Icon getPanePhoto() {
        return panePhoto;
    }
    
    public void setPanePhoto(Icon panePhoto) {
        this.panePhoto = panePhoto;
        photo.setIcon(panePhoto);
    }
    
    public pane() {
        initComponents();
        txt.setOpaque(false);
        jPanel2.setOpaque(false);
        
        
    }

    public void initEvents(String user, String text) {
        txt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
               if(isFull==true){
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db", "root", "");
                    PreparedStatement pst = con.prepareStatement("select post_text from user,posts where user.id=posts.user_id and user.username=? and posts.post_text=?");
                    pst.setString(1, user);
                    pst.setString(2, text);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        txt.setText(rs.getString("post_text"));
                        isFull=false;
                    }
                } catch (ClassNotFoundException | SQLException e) {
                    
                }                
            }else{
                    try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db", "root", "");
                    PreparedStatement pst = con.prepareStatement("select post_text from user,posts where user.id=posts.user_id and user.username=? and posts.post_text=?");
                    pst.setString(1, user);
                    pst.setString(2, text);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                     String text=  rs.getString("post_text");
                        text = text.substring(0, Math.min(text.length(), 20));
                    text= text+"...";
                    txt.setText(text);
                    isFull=true;
                    }
                } catch (ClassNotFoundException | SQLException e) {
                    
                } 
            
        } 
            }
        });
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        jPanel1.setOpaque(false);

        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        txt.setEditable(false);
        txt.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        txt.setFocusable(false);
        txt.setOpaque(false);
        txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMousePressed
        
    }//GEN-LAST:event_txtMousePressed

    private void txtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMouseReleased
        
    }//GEN-LAST:event_txtMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel photo;
    private javax.swing.JTextPane txt;
    // End of variables declaration//GEN-END:variables
}
