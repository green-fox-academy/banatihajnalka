import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FourRectangles {
    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        int x = 40;
        int y = 60;
        int size = 20;
       for (int i = 0; i < 4; i++) {
           drawRectangleFunction ((int) (Math.random() * (320 + 1)), (int) (Math.random() * (320 + 1)), (int) (Math.random() * (320 + 1)), graphics);
       }

    }
    public static void drawRectangleFunction (int x, int y, int size, Graphics graphics) {
        graphics.setColor(new Color((int) (Math.random() * 256), ((int) (Math.random() * 256)), ((int) (Math.random() * 256))));
        graphics.fillRect(x, y, size, size);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
