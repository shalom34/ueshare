
package swing.Mainpage.components.interuniversitaire.swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import swing.Mainpage.components.interuniversitaire.events.publicEvent;


public class viewImage extends javax.swing.JComponent {
    private Icon image;
    public viewImage() {
        initComponents();
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
public void  viewImage(Icon image){
    this.image=image;
 pic.setImage(image);
 setVisible(true);
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new swing.Cards.Button();
        pic = new swing.Mainpage.components.interuniversitaire.swing.pictureBox();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(27, 120, 239));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/downloadpicture.png"))); // NOI18N
        button1.setEffectColor(new java.awt.Color(255, 255, 255));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(628, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
    if(SwingUtilities.isLeftMouseButton(evt)){
        setVisible(false);}
    }//GEN-LAST:event_formMousePressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        publicEvent.getInstance().getEventImageView().saveImage(image);
    }//GEN-LAST:event_button1ActionPerformed

    @Override
    protected void paintComponent(Graphics g) {
     Graphics2D g2= (Graphics2D)g;
     g2.setColor(new Color(0,0,0,150));
     g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g); 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Cards.Button button1;
    private swing.Mainpage.components.interuniversitaire.swing.pictureBox pic;
    // End of variables declaration//GEN-END:variables
}
