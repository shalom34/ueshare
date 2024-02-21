package swing.Mainpage.components.interuniversitaire;

import java.awt.Color;

public class chatTitle extends javax.swing.JPanel {

    /**
     * Creates new form chatTitle
     */
    public chatTitle() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    public void setUserName(String username) {
        lbname.setText(username);
    }

    public void statusActive() {
        lbStatus.setText("Active now");
        lbStatus.setForeground(new Color(31, 210, 31));
    }

    public void setStatusText(String text) {
        lbStatus.setText(text);
        lbStatus.setForeground(new Color(160, 160, 160));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lbname = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        setOpaque(false);

        jLayeredPane1.setLayout(new java.awt.GridLayout(0, 1));

        lbname.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lbname.setText("name");
        jLayeredPane1.add(lbname);

        lbStatus.setBackground(new java.awt.Color(46, 151, 54));
        lbStatus.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(31, 210, 31));
        lbStatus.setText("Actif");
        jLayeredPane1.add(lbStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbname;
    // End of variables declaration//GEN-END:variables
}
