package swing.Cards;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Shalom Geek
 */
public class file_card extends javax.swing.JPanel {

    private Color color1, color2;
   private Icon Image;
   private String type;
   private int fileNumber;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        ltitle.setText("Documents "+type);
    }

    public int getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(int fileNumber) {
        this.fileNumber = fileNumber;
        lvalues.setText(""+fileNumber+" Fichiers disponibles");
    }
   

    public Icon getImage() {
        return Image;
    }

    public void setImage(Icon Image) {
        this.Image = Image;
        licon.setIcon(Image);
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public file_card() {
        initComponents();
        setOpaque(false);
        color1=Color.BLACK;
        color2= Color.WHITE;
    }

    public void setDataModel(file_Model_Card data) {
        licon.setIcon(data.getIcon());
        ltitle.setText(data.getTitle());
        lvalues.setText(data.getValues() + " fichiers");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        licon = new javax.swing.JLabel();
        ltitle = new javax.swing.JLabel();
        lvalues = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        licon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        licon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_pdf_100px.png"))); // NOI18N
        add(licon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 90, 142));

        ltitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        ltitle.setForeground(new java.awt.Color(255, 255, 255));
        ltitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ltitle.setText("Documents pdf");
        add(ltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 56, 235, 39));

        lvalues.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lvalues.setForeground(new java.awt.Color(255, 255, 255));
        lvalues.setText("Fichiers disponibles");
        add(lvalues, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 149, 300, 43));
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
    }//GEN-LAST:event_formMousePressed
@Override
    protected void paintComponent(Graphics grphcs) {
Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g= new GradientPaint(0,0,color1,0,getHeight(),color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255,255,255,50));
        g2.fillOval(getWidth()-(getHeight()/2), 10, getHeight(),getHeight());
        g2.fillOval(getWidth()-(getHeight()/2)-20, getHeight()/2+20, getHeight(),getHeight());
        
        super.paintComponent(grphcs);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel licon;
    private javax.swing.JLabel ltitle;
    private javax.swing.JLabel lvalues;
    // End of variables declaration//GEN-END:variables
}
