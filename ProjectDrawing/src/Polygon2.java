import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Polygon2 {
    public static void mainDraw (Graphics graphics) {

        graphics.setColor(Color.black);
        int side = (int) Math.sqrt((Math.pow(HEIGHT, 2) + Math.pow(WIDTH, 2)));

        int x = WIDTH;
        int y = HEIGHT;

        for (int i = 1; x <= WIDTH; i++) {
            
        }
        int leftX = x - WIDTH /2;
        int leftY =
    }
 /*     graphics.drawPolygon(new int[]{WIDTH / 2, 0, WIDTH}, new int[]{0, HEIGHT, HEIGHT}, 3);
        graphics.drawPolygon(new int[]{WIDTH / 4, WIDTH / 4 * 3, WIDTH / 2}, new int[]{HEIGHT / 2, HEIGHT / 2, HEIGHT}, 3);
        graphics.drawPolygon(new int[]{WIDTH / 4, WIDTH / 4 * 3, WIDTH / 2}, new int[]{HEIGHT / 2, HEIGHT / 2, HEIGHT}, 3);
        graphics.drawPolygon(new int[]{WIDTH / 8, WIDTH / 8 * 3, WIDTH / 4}, new int[]{HEIGHT / 4 * 3, HEIGHT / 4 * 3, HEIGHT}, 3);
*/



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
};