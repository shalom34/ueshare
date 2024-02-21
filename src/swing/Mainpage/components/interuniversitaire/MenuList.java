/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing.Mainpage.components.interuniversitaire;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.miginfocom.swing.MigLayout;
import service.Model_User_Account;

import swing.Mainpage.components.interuniversitaire.events.EventMenu;
import swing.Mainpage.components.interuniversitaire.events.publicEvent;

public class MenuList extends javax.swing.JPanel {
private List<Model_User_Account> userAccount;
    public MenuList() {
        initComponents();
        init();
    }

    private void init() {
        menulist.setLayout(new MigLayout("fillx","0[]0","0[]0"));
        setOpaque(false);
        scrollPane.getViewport().setBackground(new Color(0, 0, 0, 0));
        userAccount= new ArrayList<>();
        publicEvent.getInstance().addEventMenu(new EventMenu() {
            @Override
            public void newUser(List<Model_User_Account> users) {
                for(Model_User_Account d:users){
                    userAccount.add(d);
                    menulist.add(new Itempeople(null,d.getName()),"wrap");
                }
            }
        });
        
    }

    public void showPeople() {


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        scrollPane = new swing.panels.ScrollPaneWin11();
        menulist = new swing.panels.LayeredPaneUI();

        setBackground(new java.awt.Color(255, 175, 0));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Les membres actifs");

        scrollPane.setBorder(null);
        scrollPane.setOpaque(false);

        menulist.setBackground(new java.awt.Color(231, 231, 231));

        javax.swing.GroupLayout menulistLayout = new javax.swing.GroupLayout(menulist);
        menulist.setLayout(menulistLayout);
        menulistLayout.setHorizontalGroup(
            menulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        menulistLayout.setVerticalGroup(
            menulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        scrollPane.setViewportView(menulist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private swing.panels.LayeredPaneUI menulist;
    private swing.panels.ScrollPaneWin11 scrollPane;
    // End of variables declaration//GEN-END:variables
}
