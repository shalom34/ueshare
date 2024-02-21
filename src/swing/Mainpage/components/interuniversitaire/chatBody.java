
package swing.Mainpage.components.interuniversitaire;

import java.awt.Adjustable;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;


public class chatBody extends javax.swing.JPanel {

    
    public chatBody() {
        initComponents();
        init();
 //addItemLeft("hello man\n how are you? hgdshhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh","Geek",new ImageIcon(getClass().getResource("/draft/icon/mybusinessLogo.png")),new ImageIcon(getClass().getResource("/draft/icon/mybusinessLogo.png")));
//        
  //    addItemRight("hello\n aaaaa urakomey man?");
//         addItemRight("hello\n aaaaa urakomey man?");
//         addDate("23/01/2001");
  //String img[]={"L04:fVt003N7~coG8:Sl8wt1_6M,","LFD^h{zu8S4.^ANZ+RE1GpEd~EX+"};
//         addItemLeft("nifresh tu\n nta bishasha?","Geek", new ImageIcon(getClass().getResource("/draft/icon/mybusinessLogo.png")),new ImageIcon(getClass().getResource("/draft/icon/mybusinessLogo.png")));
      addItemRight("hello\n aaaaa urakomey man?");
 //addItemLeft("nifresh tu\n nta bishasha?","Geek",new ImageIcon(getClass().getResource("/icons/emptyBox.png")));
//         addItemLeft("","Jonathan", new ImageIcon(getClass().getResource("/draft/icon/mybusinessLogo.png")));
//         addDate("Today");
//        addItemRight("hello\n aaaaa urakomey man?", new ImageIcon(getClass().getResource("/draft/icon/kugasaka.png")),new ImageIcon(getClass().getResource("/draft/icon/zzi1ld14.jpg")));
// addItemLeft("nifresh tu\n nta bishasha?","Geek",img);
//        addItemFileLeft("Accep this file man","Geek","my document.pdf","2 MB");
//        addItemFileRight("","text.docx","10 MB");
//   
    }

  private void init(){
      body.setLayout(new MigLayout("fillx","","5[]5"));
  sp.getVerticalScrollBar().setBackground(new Color(249,249,249));
  }
  public void addItemLeft(String text, String user, Icon ... image){
      chatLeft_with_Profile item= new chatLeft_with_Profile ();
     item.setImageProfile(new ImageIcon(getClass().getResource("/draft/icon/mybusinessLogo.png")));
      item.setText(text);
     item.setUserProfile(user);
      item.setImage(image);
      item.setTime();
       body.add(item,"wrap, w 100::80%");
      body.repaint();
      body.revalidate();
  }
  public void addItemLeft(String text, String user, String ... image){
      chatLeft_with_Profile item= new chatLeft_with_Profile ();
     item.setImageProfile(new ImageIcon(getClass().getResource("/draft/icon/mybusinessLogo.png")));
      item.setText(text);
     item.setUserProfile(user);
      item.setImage(image);
      item.setTime();
       body.add(item,"wrap, w 100::80%");
      body.repaint();
      body.revalidate();
  }
   public void addItemFileLeft(String text, String user, String fileName,String size){
      chatLeft_with_Profile item= new chatLeft_with_Profile ();
     item.setImageProfile(new ImageIcon(getClass().getResource("/draft/icon/mybusinessLogo.png")));
      item.setText(text);
     item.setUserProfile(user);
      item.setFile(fileName, size);
      item.setTime();
       body.add(item,"wrap, w 100::80%");
      body.repaint();
      body.revalidate();
  }
  public void addItemRight(String text, Icon ... image){
      chatRight item= new chatRight();
      item.setText(text);
       item.setImage(image);
      body.add(item,"wrap, al right, w 100::80%");
      body.repaint();
      body.revalidate(); 
      item.setTime();
      scrollToBottom();
  }
   public void addItemFileRight(String text,String fileName, String size){
      chatRight item= new chatRight();
      item.setText(text);
       item.setFile(fileName, size);
      body.add(item,"wrap, al right, w 100::80%");
      body.repaint();
      body.revalidate(); 
  }
  public void addDate(String date){
      chatDate item=new chatDate();
      item.setDate(date);
      body.add(item,"wrap, al center");
      body.repaint();
      body.revalidate();
  }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new swing.panels.ScrollPaneWin11();
        body = new javax.swing.JPanel();

        sp.setBackground(new java.awt.Color(249, 249, 249));
        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(249, 249, 249));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
private void scrollToBottom() {
    JScrollBar verticalBar = sp.getVerticalScrollBar();
    AdjustmentListener downScroller = new AdjustmentListener() {
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            Adjustable adjustable = e.getAdjustable();
            adjustable.setValue(adjustable.getMaximum());
            verticalBar.removeAdjustmentListener(this);
        }
    };
    verticalBar.addAdjustmentListener(downScroller);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private swing.panels.ScrollPaneWin11 sp;
    // End of variables declaration//GEN-END:variables
}
