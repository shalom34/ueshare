
package swing.Mainpage.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class Menuitem extends JButton{
private int index;
private boolean subMenuAble;
private int subMenuIndex;
private int length;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isSubMenuAble() {
        return subMenuAble;
    }

    public void setSubMenuAble(boolean subMenuAble) {
        this.subMenuAble = subMenuAble;
        
    }

    public int getSubMenuIndex() {
        return subMenuIndex;
    }

    public void setSubMenuIndex(int subMenuIndex) {
        this.subMenuIndex = subMenuIndex;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Menuitem(String name, int index, boolean subMenuAble) {
        super(name);
        this.index=index;
        this.subMenuAble=subMenuAble;
         setContentAreaFilled(false);
         setForeground(new Color(230,230,230));
         setHorizontalAlignment(SwingConstants.LEFT);
         setIconTextGap(10);
         setBorder(new EmptyBorder(9,10,9,10));
         setFont(new Font("Yu Gothic UI",1,14));
        
        
    }
    public void initSubMenu(int subMenuIndex, int length){
        this.subMenuIndex=subMenuIndex;
        this.length=length;
        setContentAreaFilled(false);
        setBackground(new Color(22,57,124,80));
         setFont(new Font("Yu Gothic UI",1,12));
         setOpaque(true);
         
    }
   
}
