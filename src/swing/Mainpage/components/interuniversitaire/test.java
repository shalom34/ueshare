package swing.Mainpage.components.interuniversitaire;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import swing.BlurHash.BlurHash;

public class test {

    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("F:\\snake.jpg"));
            String blurhashStr = BlurHash.encode(image);
            System.out.println(blurhashStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
