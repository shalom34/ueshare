package swing.ProgressBar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JProgressBar;

public class LiquidProgress extends JProgressBar {

    private final LiquidProgressUI ui;
    int bordersize = 5;
    int spacesize = 5;
    Color animateColor = new Color(125, 216, 255);
    Color borderColor = new Color(0, 178, 255);

    public int getBordersize() {
        return bordersize;
    }

    public void setBordersize(int bordersize) {
        this.bordersize = bordersize;
    }

    public int getSpacesize() {
        return spacesize;
    }

    public void setSpacesize(int spacesize) {
        this.spacesize = spacesize;
    }

    public Color getAnimateColor() {
        return animateColor;
    }

    public void setAnimateColor(Color animateColor) {
        this.animateColor = animateColor;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public LiquidProgress() {
        ui = new LiquidProgressUI(this);
        setOpaque(false);
        setFont(new Font(getFont().getFamily(), 1, 20));
        setPreferredSize(new Dimension(100, 100));
        setBackground(Color.WHITE);
        setForeground(new Color(0, 178, 255));
        setUI(ui);
        setStringPainted(true);

    }
    public void sartAnimation(){
        ui.start();
    }
    public void stopAnimation(){
        ui.stop();
    }
}
