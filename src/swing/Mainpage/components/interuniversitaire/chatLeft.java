package swing.Mainpage.components.interuniversitaire;

import java.awt.Color;
import javax.swing.Icon;

public class chatLeft extends javax.swing.JLayeredPane {

    public chatLeft() {
        initComponents();
        txt.setBackground(new Color(242, 242, 242));
    }

    public void setText(String text) {

        if (text.equals("")) {
            txt.hideText();
        } else {
            txt.setText(text);
        }

    }

    public void setFile(String fileName, String size) {
        txt.setFile(fileName, size);
    }

    public void setImage(Icon... image) {
        txt.setImage(false, image);
    }

    public void setImage(String... image) {
        txt.setImage(false, image);
    }

    public void setTime() {
        txt.setTime("16:05");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new swing.Mainpage.components.interuniversitaire.chatItem();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Mainpage.components.interuniversitaire.chatItem txt;
    // End of variables declaration//GEN-END:variables
}
