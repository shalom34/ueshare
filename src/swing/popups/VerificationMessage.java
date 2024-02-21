/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package swing.popups;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.UUID;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import swing.panels.utilities.Glass;

/**
 *
 * @author Shalom Geek
 */
public class VerificationMessage extends javax.swing.JDialog {
 private final JFrame fram;
    private Animator animator;
    private boolean show;
    private Glass glass;
    private MessageType messagetype=MessageType.CANCEL;
    
   public VerificationMessage(JFrame fram) {
        super(fram, true);
        this.fram = fram;
        initComponents();
        init();
        randomise();
    }
    
    private void init() {
        setBackground(new Color(0, 0, 0, 0));
       
        StyledDocument doc = txt.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        txt.setOpaque(false);
        txt.setBackground(new Color(0, 0, 0, 0));
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
 
    
  private void randomise(){
     String random = UUID.randomUUID().toString().substring(0, 6);
        code.setText(random);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.panels.PanelBorder();
        txt = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        Verifier = new swing.buttons.ButtonCustom();
        Verifier1 = new swing.buttons.ButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt.setEditable(false);
        txt.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        txt.setText("Pour continuer, ecrire le code que vous voyez ici pour comfirmer si vous êtes humain.");
        txt.setFocusable(false);
        panelBorder1.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 420, -1));

        code.setBackground(new java.awt.Color(51, 51, 51));
        code.setFont(new java.awt.Font("Bradley Hand ITC", 1, 40)); // NOI18N
        code.setForeground(new java.awt.Color(15, 15, 15));
        code.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        code.setText("ima10o");
        code.setOpaque(true);
        panelBorder1.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 190, 60));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_reset_30px.png"))); // NOI18N
        jLabel4.setText("Renvoyer le code");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        panelBorder1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 157, 40));

        tcode.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        tcode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tcode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelBorder1.add(tcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 420, 50));

        Verifier.setText("Verifier");
        Verifier.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Verifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifierActionPerformed(evt);
            }
        });
        panelBorder1.add(Verifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 188, 60));

        Verifier1.setBackground(new java.awt.Color(229, 0, 0));
        Verifier1.setText("Annuler");
        Verifier1.setColorHover(new java.awt.Color(255, 0, 0));
        Verifier1.setColorPressed(new java.awt.Color(255, 0, 0));
        Verifier1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Verifier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verifier1ActionPerformed(evt);
            }
        });
        panelBorder1.add(Verifier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 201, 60));

        getContentPane().add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        randomise();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void Verifier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verifier1ActionPerformed
      messagetype= MessageType.CANCEL;
      CloseMessage(); 
    }//GEN-LAST:event_Verifier1ActionPerformed

    private void VerifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifierActionPerformed
      int length= tcode.getText().length();
      if(length==0){
          ErrorMessage error= new ErrorMessage(fram);
          error.showMessage("Erreur", "Tu dois saisir au moins un caractere");
      }else{
          CloseMessage();
          Comfirmation comf= new Comfirmation(fram);
         comf.showMessage();
      }
    }//GEN-LAST:event_VerifierActionPerformed
public static enum MessageType{
  CANCEL,OK;  
}
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.buttons.ButtonCustom Verifier;
    private swing.buttons.ButtonCustom Verifier1;
    public static final javax.swing.JLabel code = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel4;
    private swing.panels.PanelBorder panelBorder1;
    public static final javax.swing.JTextField tcode = new javax.swing.JTextField();
    private javax.swing.JTextPane txt;
    // End of variables declaration//GEN-END:variables
}
