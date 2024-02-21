/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing.Mainpage.components.accueil;


public class usersPanel extends javax.swing.JPanel {

    
    public usersPanel() {
        initComponents();
        setOpaque(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.panels.PanelBorder();
        user_card2 = new swing.Cards.User_card();
        user_card6 = new swing.Cards.User_card();
        user_card3 = new swing.Cards.User_card();
        user_card5 = new swing.Cards.User_card();
        user_card4 = new swing.Cards.User_card();
        user_card1 = new swing.Cards.User_card();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setBorderRadius(15);
        panelBorder1.setLayout(new java.awt.GridLayout(1, 10, 6, 10));
        panelBorder1.add(user_card2);
        panelBorder1.add(user_card6);
        panelBorder1.add(user_card3);
        panelBorder1.add(user_card5);
        panelBorder1.add(user_card4);
        panelBorder1.add(user_card1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.panels.PanelBorder panelBorder1;
    private swing.Cards.User_card user_card1;
    private swing.Cards.User_card user_card2;
    private swing.Cards.User_card user_card3;
    private swing.Cards.User_card user_card4;
    private swing.Cards.User_card user_card5;
    private swing.Cards.User_card user_card6;
    // End of variables declaration//GEN-END:variables
}
