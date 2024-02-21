/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing.Mainpage.components.Models.jTableModel;

import java.sql.*;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import swing.Mainpage.components.Models.jTableModel.StatusType;
import swing.panels.utilities.ScrollBar;

/**
 *
 * @author Shalom Geek
 */
public class test extends javax.swing.JFrame {

    private int positionx, positiony;

    public test() {
        initComponents();
        setBackground(Color.WHITE);
        init();
        initConnect();
    }

    private void init() {
        sptable.setVerticalScrollBar(new ScrollBar());
        sptable.getVerticalScrollBar().setBackground(Color.WHITE);
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0, 0));
//        sptable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
//        table2.addRow(new Object[]{"aaaa", "bbbbbbbbbbb", "12345", "fgggggggg", StatusType.APPROVED});
//        table2.addRow(new Object[]{"aaaa", "bbbbbbbbbbb", "12345", "fgggggggg", StatusType.PENDING});
//        table2.addRow(new Object[]{"aaaa", "bbbbbbbbbbb", "12345", "fgggggggg", StatusType.REJECT});
//        table2.addRow(new Object[]{"aaaa", "bbbbbbbbbbb", "12345", "fgggggggg", StatusType.APPROVED});
        sptable.getViewport().setBackground(Color.WHITE);

    }
private void initConnect(){
    try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db","root","");
       PreparedStatement pst= con.prepareStatement("select * from user");
       ResultSet rs= pst.executeQuery();
       int i=1;
       while(rs.next()){
        String fullname= rs.getString("first_name")+" "+rs.getString("last_name");
        String username= rs.getString("username");
        String uni= rs.getString("university");
        if(i%2==0){
        table2.addRow(new Object[]{i,fullname,username,uni,StatusType.APPROVED});}
        else{
          table2.addRow(new Object[]{i,fullname,username,uni,StatusType.REJECT});  
        }
        i++;
       }
    }catch(ClassNotFoundException | SQLException e){
        
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        sptable = new javax.swing.JScrollPane();
        table2 = new swing.Mainpage.components.Models.jTableModel.Table();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 590, 40));

        sptable.setBorder(null);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        table2.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        sptable.setViewportView(table2);

        jPanel1.add(sptable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 680, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        setLocation(evt.getXOnScreen() + 50 - positionx, evt.getYOnScreen() - positiony);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        positionx = evt.getX() - 90;
        positiony = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane sptable;
    private swing.Mainpage.components.Models.jTableModel.Table table2;
    // End of variables declaration//GEN-END:variables
}
