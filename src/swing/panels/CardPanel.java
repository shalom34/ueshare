package swing.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Shalom Geek
 */
public class CardPanel extends JPanel {
    private String Title;
    private Color gradientColor;
    private Font TitleFont;
    private JLabel label=new JLabel();
    private Color TitleForeground;

    public Font getTitleFont() {
        return TitleFont;
    }

    public void setTitleFont(Font TitleFont) {
        this.TitleFont = TitleFont;
        label.setFont(TitleFont);
    }

    public Color TitleForeground() {
        return TitleForeground;
    }

    public void setTextForeground(Color TextForeground) {
        this.TitleForeground = TextForeground;
        label.setForeground(TextForeground);
    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String TextLabel) {
        this.Title = TextLabel;
        label.setText(TextLabel);
    }

    public Color getGradientColor() {
        return gradientColor;
    }

    public void setGradientColor(Color gradientColor) {
        this.gradientColor = gradientColor;
    }

    public CardPanel() {
        setOpaque(false);
        gradientColor = new Color(255, 255, 255);
        setBackground(new Color(241, 212, 62));
       label.setFont(new java.awt.Font("segoe UI", Font.PLAIN, 12)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Title");
        
        
       
        add(label,new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 60));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        float dist[] = {0f, 1f};
        Color colors[] = {gradientColor, getBackground()};
        RadialGradientPaint gra = new RadialGradientPaint(new Point(getWidth() / 2, 0), getHeight(), dist, colors);
        g2.setPaint(gra);
        g2.fillRoundRect(0,0, getWidth(),getHeight(), 30, 30);
    }
}
