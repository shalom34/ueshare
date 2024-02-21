
package swing.panels;

import swing.Cards.*;
import javax.swing.ImageIcon;

import swing.panels.utilities.*;

/**
 *
 * @author Shalom Geek
 */
public class form_menu extends javax.swing.JPanel {

    public form_menu() {
        initComponents();
        init();
    }
private void init(){
  panel.setLayout(new WrapLayout(WrapLayout.LEADING));
  jScrollPane1.setVerticalScrollBar(new ScrollBar());
  
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(239, 239, 239));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        panel.setBackground(new java.awt.Color(239, 239, 239));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(panel);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 840, 530));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JPanel panel = new javax.swing.JPanel();
    // End of variables declaration//GEN-END:variables
}
