
package swing.buttons;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonCustom extends JButton{
 private Color background= new Color(69,191,71);
 private Color colorHover= new Color(76,206,78);
 private Color colorPressed= new Color(63,175,65);
 private boolean mouseOver= true;

    public ButtonCustom() {
        init();
    }
 private void init(){
     setContentAreaFilled(false);
     setCursor(new Cursor(Cursor.HAND_CURSOR));
     setBackground(background);
     setForeground(Color.WHITE);
     setOpaque(true);
    addMouseListener(new MouseAdapter(){
       @Override
       public void mouseEntered(MouseEvent e){
        mouseOver=true;   
        ButtonCustom.super.setBackground(getColorHover());
       }
       @Override
       public void mouseExited(MouseEvent e){
        mouseOver=false;   
        ButtonCustom.super.setBackground(background);
       }
       @Override
       public void mousePressed(MouseEvent e){
        
        ButtonCustom.super.setBackground(getColorPressed());
       }
       
       @Override
       public void mouseReleased(MouseEvent e){
       if(mouseOver){
        ButtonCustom.super.setBackground(getColorHover());
       }else{
           ButtonCustom.super.setBackground(background);
       }
       }
    });
 }

 @Override
    public void setBackground(Color background) {
        
        this.background = background;
        super.setBackground(background);
    }

    public Color getColorHover() {
        return colorHover;
    }

    public void setColorHover(Color colorHover) {
        this.colorHover = colorHover;
    }

    public Color getColorPressed() {
        return colorPressed;
    }

    public void setColorPressed(Color colorPressed) {
        this.colorPressed = colorPressed;
    }

    public boolean isMouseOver() {
        return mouseOver;
    }

    public void setMouseOver(boolean mouseOver) {
        this.mouseOver = mouseOver;
    }
 
}
