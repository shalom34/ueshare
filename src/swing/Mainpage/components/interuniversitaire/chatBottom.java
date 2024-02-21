package swing.Mainpage.components.interuniversitaire;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import swing.Cards.Button;
import swing.Mainpage.components.interuniversitaire.events.publicEvent;
import swing.fields.JIMSendTextPane;
import swing.panels.ScrollPaneWin11;
import swing.panels.utilities.ScrollBar;

public class chatBottom extends javax.swing.JPanel {

    public chatBottom() {
        initComponents();
        init();
    }

    private void init() {
        setLayout(new MigLayout("fillx,filly", "0[fill]0[]0[]2", "2[fill]2"));
        ScrollPaneWin11 scroll = new ScrollPaneWin11();
        scroll.setBorder(null);
        JIMSendTextPane txt = new JIMSendTextPane();
        txt.setFont(new Font("Yu Gothic UI",1,14));
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                refresh();
                
            }
        });
        txt.setBorder(new EmptyBorder(5,5,5,5));
        
        scroll.setViewportView(txt);
        add(scroll, "w 100%");
        JPanel panel = new JPanel();
        panel.setLayout(new MigLayout("filly", "0[]0", "0[bottom]0"));
        panel.setPreferredSize(new Dimension(30,28));
        panel.setBackground(Color.WHITE);
        Button cmd= new Button();
        cmd.setBackground(Color.WHITE);
        cmd.setEffectColor(Color.green);
        cmd.setContentAreaFilled(false);
        cmd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmd.setIcon(new ImageIcon(getClass().getResource("/icons/send.png")));
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=txt.getText().trim();
                if(!text.equals("")){
                    publicEvent.getInstance().getEventChat().sendMessage(text);
                  txt.setText("");
                  txt.grabFocus();
                  refresh();
                }else{
                    txt.grabFocus();
                }
               }
        });
        panel.add(cmd);
        add(panel);
    }

    private void refresh() {
        revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(249, 249, 249));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
