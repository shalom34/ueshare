
package swing.Mainpage.components.interuniversitaire;

import java.awt.Component;
import javax.swing.Icon;
import net.miginfocom.swing.MigLayout;
import swing.Mainpage.components.interuniversitaire.events.EventChat;
import swing.Mainpage.components.interuniversitaire.events.EventImageView;
import swing.Mainpage.components.interuniversitaire.events.publicEvent;
import swing.Mainpage.components.interuniversitaire.swing.viewImage;


public class chat extends javax.swing.JPanel {

 
    public chat() {
        initComponents();
        setOpaque(false);
        viewImage.setVisible(false);
        chatpane.setVisible(true);
        menuList1.showPeople();
        init();
    }
    public void events(){
       
    publicEvent.getInstance().addEventImageView(new EventImageView(){
        @Override
        public void viewImage(Icon image){
       viewImage.viewImage(image);
        }
        public void saveImage(Icon image){
            System.out.println("saving image...");
        }
    });
}
    
public viewImage getViewImage(){
    return this.viewImage;
}
 public Component getChatpane(){
    return this.chatpane;
} 
 private void init(){
   chat.setLayout(new MigLayout("fillx","0[fill]0","[]0[100%, bottom]0[shrink 0]"));
   chatBody chatbody= new chatBody();
   chatTitle chattitle= new chatTitle();
   chatBottom chatbottom= new chatBottom();
   publicEvent.getInstance().addEventChat(new EventChat() {
       @Override
       public void sendMessage(String text) {
           chatbody.addItemRight(text);
           }
   });
   chat.add(chattitle,"wrap");
   chat.add(chatbody,"wrap");
   chat.add(chatbottom,"h :: 50%");
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layeredpane = new javax.swing.JLayeredPane();
        viewImage = new swing.Mainpage.components.interuniversitaire.swing.viewImage();
        chatpane = new swing.panels.PanelBorder();
        menuList1 = new swing.Mainpage.components.interuniversitaire.MenuList();
        chat = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(828, 661));

        layeredpane.setBackground(new java.awt.Color(249, 249, 249));
        layeredpane.setLayout(new java.awt.CardLayout());
        layeredpane.setLayer(viewImage, javax.swing.JLayeredPane.POPUP_LAYER);
        layeredpane.add(viewImage, "card3");

        chatpane.setBackground(new java.awt.Color(249, 249, 249));
        chatpane.setBorderRadius(0);
        chatpane.setOpaque(true);

        menuList1.setBackground(new java.awt.Color(255, 175, 0));
        menuList1.setOpaque(true);

        chat.setBackground(new java.awt.Color(249, 249, 249));

        javax.swing.GroupLayout chatLayout = new javax.swing.GroupLayout(chat);
        chat.setLayout(chatLayout);
        chatLayout.setHorizontalGroup(
            chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        chatLayout.setVerticalGroup(
            chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout chatpaneLayout = new javax.swing.GroupLayout(chatpane);
        chatpane.setLayout(chatpaneLayout);
        chatpaneLayout.setHorizontalGroup(
            chatpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chatpaneLayout.createSequentialGroup()
                .addComponent(menuList1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        chatpaneLayout.setVerticalGroup(
            chatpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuList1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layeredpane.add(chatpane, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredpane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(layeredpane)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chat;
    private swing.panels.PanelBorder chatpane;
    private javax.swing.JLayeredPane layeredpane;
    private swing.Mainpage.components.interuniversitaire.MenuList menuList1;
    private swing.Mainpage.components.interuniversitaire.swing.viewImage viewImage;
    // End of variables declaration//GEN-END:variables
}
