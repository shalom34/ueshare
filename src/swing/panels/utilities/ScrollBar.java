
package swing.panels.utilities;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBar extends JScrollBar{


public ScrollBar(){
     setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(6, 6));
        setForeground(new Color(48, 144, 216));
        setBackground(new Color(0, 0, 0,0));
        
    
}    
}
