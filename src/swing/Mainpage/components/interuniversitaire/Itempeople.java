/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing.Mainpage.components.interuniversitaire;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Itempeople extends javax.swing.JPanel {
 private Color initColor, pictureInitColor,initForeground;
    private Icon initAvatar,actionAvatar;
    public Itempeople(ImageIcon peopleAvatar, String peopleName) {
        initComponents();
        setOpaque(false);
         if (peopleAvatar == null) {
            ImageIcon Actionicon=new ImageIcon(getClass().getResource("/icons/ActionUser.png"));
            ImageIcon initicon=new ImageIcon(getClass().getResource("/icons/user_25px.png"));
            Image im = Actionicon.getImage();
            Image imAction = initicon.getImage();
                    Image im1 = im.getScaledInstance(55, 45, Image.SCALE_SMOOTH);
                    Image im2 = imAction.getScaledInstance(55, 45, Image.SCALE_SMOOTH);
                  ImageIcon  newActionImage = new ImageIcon(im1);
                  ImageIcon  newInitImage = new ImageIcon(im2);
            actionAvatar=newActionImage;
          initAvatar= newInitImage;
        }else{
            Image im = peopleAvatar.getImage();
                    Image im1 = im.getScaledInstance(55, 45, Image.SCALE_SMOOTH);
                  ImageIcon  newImage = new ImageIcon(im1);
            actionAvatar=newImage;
            initAvatar=newImage;
        }
        picture.setImage(initAvatar);
        name.setText(peopleName);
        init();
    }

    private void init() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                initColor = getBackground();
                
                pictureInitColor = picture.getGradientColor2();
                initAvatar= picture.getImage();
                picture.setGradientColor2(Color.RED);
                setBackground(new Color(28, 120, 239, 150));
                name.setForeground(Color.WHITE);
                picture.setImage(actionAvatar);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                setBackground(initColor);
                picture.setImage(initAvatar);
                picture.setGradientColor2(pictureInitColor);
                name.setForeground(Color.BLACK);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picture = new swing.avatars.ImageAvatar();
        name = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 246, 246));

        picture.setBorderSize(3);
        picture.setBorderSpace(1);
        picture.setGradientColor1(new java.awt.Color(192, 218, 251));

        name.setBackground(new java.awt.Color(246, 246, 246));
        name.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        name.setText("name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
 @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel name;
    private swing.avatars.ImageAvatar picture;
    // End of variables declaration//GEN-END:variables
}
