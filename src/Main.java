import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Read in a file to BufferedImage
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(args[0]));
        } catch (IOException e) {

        }
    }
}