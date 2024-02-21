
package swing.popups;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.lang.Thread.sleep;
import java.util.UUID;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import pages.Loginpage;
import swing.panels.utilities.Glass;
import static swing.popups.VerificationMessage.code;
import static swing.popups.VerificationMessage.tcode;

/**
 *
 * @author Shalom Geek
 */
public class Comfirmation extends javax.swing.JDialog {
 private final JFrame fram;
    private Animator animator;
    private boolean show;
    private Glass glass;
    private MessageType messagetype=MessageType.CANCEL;
    
   public Comfirmation(JFrame fram) {
        super(fram, true);
        this.fram = fram;
        initComponents();
        init();
       pbThread p= new pbThread();
p.start();
resultbutton.setVisible(false); 
    }
    
    private void init() {
        setBackground(new Color(0, 0, 0, 0));
       
        
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                CloseMessage();                
            }            
        });
        animator = new Animator(350, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                float f = show ? fraction : 1f - fraction;
                glass.setAlpha(f - f * 0f);
                setOpacity(f);
            }            

            @Override
            public void end() {
                if (show == false) {
                    dispose();
                    glass.setVisible(false);
                    
                }
            }            
        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        setOpacity(0f);
        glass = new Glass();
        
    }
    
    public void showMessage() {
        fram.setGlassPane(glass);
        glass.setVisible(true);
        setLocationRelativeTo(fram);
        startAnimator(true);
        setVisible(true);
        
    }
    
    public void CloseMessage() {
        startAnimator(false);        
    }

    private void startAnimator(boolean show) {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
        this.show = show;
        animator.start();
    }
   class pbThread extends Thread {

        pbThread() {

        }

        @Override
        public void run() {
            int min = 0;
            int max = 2;

            for (int i = min; i <= max; i++) {
                if (i % 2 == 0) {
                    resultSymbol.setIcon(new ImageIcon(getClass().getResource("/icons/sand_down_75px.png")));
                } else {
                   resultSymbol.setIcon(new ImageIcon(getClass().getResource("/icons/sand_up_75px.png")));
                  
                }
                try {
                    sleep(1000);

                } catch (InterruptedException ex) {
JOptionPane.showMessageDialog(null, ex);
                }

            }
            String n1= code.getText();
            String n2=tcode.getText();
            if(n1.equals(n2)){
            resultSymbol.setIcon(new ImageIcon(getClass().getResource("/icons/ok_70px.png")));
jLabel3.setText("CORRECT");
jLabel3.setForeground(Color.green);
resultbutton.setText("Continuer");
Loginpage.buttonspanel.setVisible(true);

resultbutton.setForeground(Color.green);
resultbutton.setVisible(true);
            }else{
            resultSymbol.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_cancel_70px.png")));
jLabel3.setText("INCORRECT");  
jLabel3.setForeground(Color.red);
resultbutton.setText("Réessayer");
resultbutton.setForeground(Color.red);
resultbutton.setVisible(true);
            }
        }

    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.panels.PanelBorder();
        resultSymbol = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resultbutton = new swing.buttons.ButtonOutLine();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder1.setBackground(new java.awt.Color(232, 232, 232));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultSymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultSymbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sand_up_75px.png"))); // NOI18N
        panelBorder1.add(resultSymbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, 110));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Verification en cours...");
        panelBorder1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, 40));

        resultbutton.setText("text");
        resultbutton.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        resultbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultbuttonActionPerformed(evt);
            }
        });
        panelBorder1.add(resultbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 110, 50));

        getContentPane().add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultbuttonActionPerformed
        String n1= resultbutton.getText();
        if(n1.equals("Continuer")){
          messagetype= MessageType.CANCEL;
      CloseMessage();   
        }else{
            CloseMessage();
        VerificationMessage ver= new VerificationMessage(fram);
        ver.showMessage();
        
        
            
        }
    }//GEN-LAST:event_resultbuttonActionPerformed
public static enum MessageType{
  CANCEL,OK;  
}
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private swing.panels.PanelBorder panelBorder1;
    private javax.swing.JLabel resultSymbol;
    private swing.buttons.ButtonOutLine resultbutton;
    // End of variables declaration//GEN-END:variables
}
