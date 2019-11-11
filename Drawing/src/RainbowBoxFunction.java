import javax.swing.*;
import javax.swing.colorchooser.ColorChooserComponentFactory;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        int size = WIDTH;
        Color[] rainbow = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.white, Color.gray};

        Color i = new Color(83, 0, 217, 255);
        Color v = new Color(66, 0, 132, 255);

        for (int z = 1; z < 8; z++) {
                drawRainbow(size / z, rainbow, graphics);
            }
        }

    private static void drawRainbow(int size, Color[] rainbow, Graphics graphics) {
        Random random = new Random();
        graphics.setColor((rainbow[random.nextInt(7)]));
        graphics.fillRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
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