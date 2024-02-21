package swing.Cards.postpanel;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class postHeader extends javax.swing.JPanel {

    public postHeader() {
        initComponents();
    }

    public void setHeader(String name, String time, ImageIcon icon) {
        lbName.setText(name);
        lbTime.setText(time);
        Image im = icon.getImage();
        Image im1 = im.getScaledInstance(70, 85, Image.SCALE_SMOOTH);
        ImageIcon newImage = new ImageIcon(im1);
        lbPic.setImage(newImage);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPic = new swing.avatars.ImageAvatar();
        lbName = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lbPic.setBackground(new java.awt.Color(255, 255, 255));
        lbPic.setBorderSize(2);
        lbPic.setBorderSpace(2);
        lbPic.setGradientColor1(new java.awt.Color(233, 232, 232));
        lbPic.setGradientColor2(new java.awt.Color(233, 232, 232));

        lbName.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbName.setText("Name");

        lbTime.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        lbTime.setForeground(new java.awt.Color(60, 60, 60));
        lbTime.setText("Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbPic, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lbTime, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPic, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbName;
    private swing.avatars.ImageAvatar lbPic;
    private javax.swing.JLabel lbTime;
    // End of variables declaration//GEN-END:variables
}
