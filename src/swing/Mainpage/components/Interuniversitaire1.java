
package swing.Mainpage.components;

import java.awt.Color;
import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import swing.Mainpage.components.interuniversitaire.MenuList;
import swing.Mainpage.components.interuniversitaire.swing.viewImage;
import swing.panels.PanelBorder;


public class Interuniversitaire1 extends javax.swing.JPanel {
private viewImage viewImage;
private  Component chatpane;
    public Interuniversitaire1() {
        initComponents();
        init();
    }
private void init(){
   //menuList1.showPeople();
    this.add(new MenuList());
    scrollpane.getViewport().setBackground(new Color(249,249,249));
    
}
 
public void initEvents(){
    chatBody.events();
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollpane = new swing.panels.ScrollPaneWin11();
        chatBody = new swing.Mainpage.components.interuniversitaire.chat();

        setBackground(new java.awt.Color(249, 249, 249));

        scrollpane.setBackground(new java.awt.Color(249, 249, 249));
        scrollpane.setBorder(null);
        scrollpane.setOpaque(false);

        chatBody.setBackground(new java.awt.Color(249, 249, 249));
        chatBody.setPreferredSize(new java.awt.Dimension(828, 630));
        scrollpane.setViewportView(chatBody);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Mainpage.components.interuniversitaire.chat chatBody;
    private swing.panels.ScrollPaneWin11 scrollpane;
    // End of variables declaration//GEN-END:variables
}
