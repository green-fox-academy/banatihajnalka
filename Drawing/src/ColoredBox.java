import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        int side = 20;
        int padding = 40;

        graphics.setColor(Color.red);
        graphics.drawLine(padding, padding, padding + side, padding);
        graphics.setColor(Color.green);
        graphics.drawLine(padding, padding, padding, padding + side);
        graphics.setColor(Color.black);
        graphics.drawLine(padding + side, padding + side, padding , padding + side);
        graphics.setColor(Color.CYAN);
        graphics.drawLine(padding + side, padding, padding + side, padding + side);




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
