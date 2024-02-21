
package swing.Mainpage.components.interuniversitaire;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class chatLeft_with_Profile extends javax.swing.JLayeredPane {

    public chatLeft_with_Profile() {
        initComponents();
        txt.setBackground(new Color(242,242,242));
    }
    public void setUserProfile(String user){
     txt.setUserProfile(user);
    }
    public void setImageProfile(ImageIcon image){
        Image im = image.getImage();
                    Image im1 = im.getScaledInstance(31, 31, Image.SCALE_SMOOTH);
                  ImageIcon  newImage = new ImageIcon(im1);
                   IaImage.setImage(newImage);
    }
public void setText(String text){
   
    if(text.equals("")){
     txt.hideText();
    }else{
     txt.setText(text);    
    }
    
    
}
public void setImage(Icon ...image){
    txt.setImage(false, image);
}
public void setImage(String...image){
    txt.setImage(false, image);
}
public void setFile(String fileName, String size){
  txt.setFile(fileName, size);
}
public void setTime(){
    txt.setTime("16:05");
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        IaImage = new swing.avatars.ImageAvatar();
        txt = new swing.Mainpage.components.interuniversitaire.chatItem();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        IaImage.setBorderSize(0);
        IaImage.setBorderSpace(0);
        IaImage.setMaximumSize(new java.awt.Dimension(31, 31));
        IaImage.setMinimumSize(new java.awt.Dimension(31, 31));

        jLayeredPane1.setLayer(IaImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(IaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        add(jLayeredPane1);
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.avatars.ImageAvatar IaImage;
    private javax.swing.JLayeredPane jLayeredPane1;
    private swing.Mainpage.components.interuniversitaire.chatItem txt;
    // End of variables declaration//GEN-END:variables
}
