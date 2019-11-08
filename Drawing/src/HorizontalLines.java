import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class HorizontalLines {
        public static void mainDraw(Graphics graphics) {
            // Create a function that draws a single line and takes 3 parameters:
            // The x and y coordinates of the line's starting point and the graphics
            // and draws a 50 long horizontal line from that point.
            // Draw at least 3 lines with that function using a loop.

            int x = 20;
            int y = 40;

            drawHorizontalLines(x, y, graphics);
            for (int i = 0; i < 3; i++) {
                drawHorizontalLines((int) (Math.random() * (321 + 1)), (int) (Math.random() * (321 + 1)), graphics);
            }
        }

    public static void drawHorizontalLines (int x, int y, Graphics graphics) {
        graphics.drawLine(x, y, x + 50, y );

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
