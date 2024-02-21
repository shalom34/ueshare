package swing.buttons.winButton;

import java.awt.Color;
import java.awt.Dimension;
import swing.panels.PanelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import swing.popups.MessageDialog;

public class WinButton extends javax.swing.JPanel {
 private ComponentResizer resizer;
   private JFrame fram;
    private JPanel panel;
    private int x;
    private int y;
    private boolean register = true;
    public WinButton() {
        initComponents();
       
        setOpaque(false);
       
        refresh.setBackground(new Color(0,0,0,0));
       close.setBackground(new Color(0,0,0,0));
       min.setBackground(new Color(0,0,0,0));
       max.setBackground(new Color(0,0,0,0));

    }
public void initJFram(JFrame fram) {
        this.fram = fram;
        resizer = new ComponentResizer();
        resizer.setSnapSize(new Dimension(10, 10));
        resizer.setMinimumSize(new Dimension(800, 600));
        resizer.registerComponent(fram);
        fram.addWindowStateListener(new WindowStateListener() {
            @Override
            public void windowStateChanged(WindowEvent e) {
                if (e.getNewState() == JFrame.MAXIMIZED_BOTH) {
                    resizer.deregisterComponent(fram);
                    register = false;
                } else if (e.getNewState() == JFrame.NORMAL) {
                    if (register == false) {
                        resizer.registerComponent(fram);
                        register = true;
                    }
                }
            }
        });
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (fram.getExtendedState() == JFrame.NORMAL && SwingUtilities.isLeftMouseButton(e)) {
                    x = e.getX() + 3;
                    y = e.getY() + 3;
                }
            }
        });
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    if (fram.getExtendedState() == JFrame.NORMAL) {
                        fram.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
                    }
                }
            }
        });
    }
    public void initEvent(JFrame fram) {
        this.fram = fram;
        resizer = new ComponentResizer();
        resizer.setSnapSize(new Dimension(10,10));
        resizer.setMinimumSize(new Dimension(800, 600));
        resizer.registerComponent(fram);
        fram.addWindowStateListener(new WindowStateListener() {
            @Override
            public void windowStateChanged(WindowEvent e) {
                if (e.getNewState() == JFrame.MAXIMIZED_BOTH) {
                    resizer.deregisterComponent(fram);
                    register = false;
                } else if (e.getNewState() == JFrame.NORMAL) {
                    if (register == false) {
                        resizer.registerComponent(fram);
                        register = true;
                    }
                }
            }
        });
        
        close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MessageDialog obj = new MessageDialog(fram);
                obj.showMessage("Attention", "Voulez-vous vraiment quitter l'application?");
                if (obj.getMessagetype() == MessageDialog.MessageType.OK) {
                    System.exit(0);
                }
            }
        });
        
        min.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                fram.setState(JFrame.ICONIFIED);
            }
        });
         max.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(fram.getExtendedState()==JFrame.MAXIMIZED_BOTH){
                    fram.setExtendedState(JFrame.NORMAL);
                    max.setToolTipText("Maximiser");
                }else{
                    fram.setExtendedState(JFrame.MAXIMIZED_BOTH);
                     max.setToolTipText("Normaliser");
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refresh = new swing.Cards.Button();
        min = new swing.Cards.Button();
        max = new swing.Cards.Button();
        close = new swing.Cards.Button();

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_restart_26px.png"))); // NOI18N
        refresh.setEffectColor(new java.awt.Color(255, 255, 255));

        min.setBackground(new java.awt.Color(0, 255, 0));
        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_horizontal_line_26px.png"))); // NOI18N
        min.setEffectColor(new java.awt.Color(0, 255, 0));

        max.setBackground(java.awt.Color.yellow);
        max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_full_image_26px.png"))); // NOI18N
        max.setEffectColor(java.awt.Color.yellow);

        close.setBackground(new java.awt.Color(255, 0, 0));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_delete_26px.png"))); // NOI18N
        close.setEffectColor(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(max, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Cards.Button close;
    private swing.Cards.Button max;
    private swing.Cards.Button min;
    private swing.Cards.Button refresh;
    // End of variables declaration//GEN-END:variables
}
