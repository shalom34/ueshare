package swing.ProgressBar;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class LiquidProgressUI extends BasicProgressBarUI {

    private final LiquidProgress pro;
    private Thread thread;
    private boolean start;
    private float location1 = -1f;
    private float location2;

    public LiquidProgressUI(LiquidProgress pro) {
        this.pro = pro;
        init();
    }

    private void init() {
        start();
    }

    public void start() {
        if (!start) {
            start = true;
            thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (start) {
                        location1 += 0.01f;
                        location2 += 0.01f;

                        if (location1 > 1f) {
                            location1 = -1f;
                        }
                        if (location2 > 1f) {
                            location2 = -1f;
                        }
                        pro.repaint();
                        sleep();
                    }
                }
            });
            thread.start();
        }
    }

    public void stop() {
        start=false;
    }

    private void sleep() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = c.getWidth();
        int height = c.getHeight();
        int size = Math.min(width, height);
        int x = (width - size) / 2;
        int y = (height - size) / 2;
        g2.setColor(pro.getBorderColor());
        g2.fillOval(x, y, size, size);
        int borderSize = pro.getBordersize();
        size -= borderSize * 2;
        g2.setColor(pro.getBackground());
        g2.fillOval(x + borderSize, y + borderSize, size, size);
        int spaceSize = pro.getSpacesize();
        borderSize += spaceSize;
        size -= spaceSize * 2;
        createAnimation(g2, x + borderSize, y + borderSize, size);
        if(progressBar.isStringPainted()){
           // paintString(g);
        }
        g2.dispose();
    }

    private void createAnimation(Graphics2D grphcs, int x, int y, int size) {
        BufferedImage img = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Ellipse2D circle = new Ellipse2D.Double(0, 0, size, size);
        g2.fill(circle);
        g2.setComposite(AlphaComposite.SrcIn);
        int Value = (int) (size * progressBar.getPercentComplete());
        int waterStyleHeight = (int) (size * 0.07f);
        g2.setColor(pro.getAnimateColor());
        g2.fillRect(0, size-Value, size, size);
        g2.fill(new ModelLiquid(new Rectangle((int) (location1 * size), size - Value - waterStyleHeight, size, waterStyleHeight)).createWaterStyle());
        g2.fill(new ModelLiquid(new Rectangle((int) (location2 * size), size - Value - waterStyleHeight, size, waterStyleHeight)).createWaterStyle());
        g2.dispose();
        grphcs.drawImage(img, x, y, null);
    }
    private void paintString(Graphics g1){
      Insets b= progressBar.getInsets();
      int barRectWidth= progressBar.getWidth()-b.right-b.left;
      int barRectHeight=progressBar.getHeight()-b.top-b.bottom;
      g1.setColor(progressBar.getForeground());
      paintString(g1,b.left,b.top, barRectWidth, barRectHeight, 0, b);
    }
}
