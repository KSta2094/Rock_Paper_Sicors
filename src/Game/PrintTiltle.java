package Game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PrintTiltle {
private static char[][] logo;
private static BufferedImage image;
    public static void load() throws IOException {
        File file = new File("/Users/konstantinasz/Downloads/Rock Paper Sicors/src/Rock_Paper.png");
     image = ImageIO.read(file);
        // Getting pixel color by position x and y
        Color color = new Color(image.getRGB(0,0));
       logo = new char[image.getWidth()][image.getHeight()];
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                if(color.getRed() == 255){
                    logo[i][j] = '.';
                }else {
                    logo[i][j] = '#';
                }

            }

        }


    }
    public static void print(){
        for (int i = 0; i < image.getWidth(); i++) {
            System.out.println("\n");
            for (int j = 0; j < image.getHeight(); j++) {
               System.out.println(logo[i][j]);
            }

        }
    }
    }

