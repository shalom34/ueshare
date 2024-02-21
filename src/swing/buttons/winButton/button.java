
package swing.buttons.winButton;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class button extends JButton {
 public button(){
     setContentAreaFilled(false);
     setBorder(new EmptyBorder(6,6,6,6));
     setCursor(new Cursor(Cursor.HAND_CURSOR));
     
 }   
 @Override
 public void paint(Graphics g){
   Graphics2D g2= (Graphics2D)g.create();
  g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
  int width= getWidth();
  int height= getHeight();
  int size= Math.min(width, height);
  int x= (width-size)/2;
  int y= (height-size)/2;
  g2.setColor(getBackground());
  g2.fillOval(x, y, size, size);
  super.paint(g);
 }
}
