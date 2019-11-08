import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Triangle {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.black);
        graphics.drawPolygon(new int[]{WIDTH / 2, 0, WIDTH}, new int[]{0, HEIGHT, HEIGHT}, 3);
        double side = Math.sqrt((Math.pow(HEIGHT, 2) + Math.pow(WIDTH, 2)));

        for (int i = 1; i <= 15; i++) {
            graphics.drawLine(WIDTH / 2 - i * WIDTH / 32, 0 + i * HEIGHT / 16, WIDTH / 2 + i * WIDTH / 32, 0 + i * HEIGHT / 16);
        }
        for (int i = 1; i <= 15; i++) {
            graphics.drawLine(WIDTH / 2 - i * WIDTH / 32, 0 + i * HEIGHT / 16, WIDTH - i * WIDTH /16, HEIGHT);
        }
        for (int i = 1; i <= 15; i++) {
            graphics.drawLine(WIDTH / 2 + i * WIDTH / 32, 0 + i * HEIGHT / 16, 0 + i * HEIGHT / 16, HEIGHT);
        }
    }
        // Don't touch the code below
        static int WIDTH = 320;
        static int HEIGHT = 320;

        public static void main (String[]args){
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
