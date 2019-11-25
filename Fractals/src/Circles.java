import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Circles {

    public static void mainDraw(Graphics graphics){
        int radius = 300;
        drawCircle(WIDTH / 2 - radius / 2, HEIGHT / 2 - radius / 2, radius,  radius, graphics);

    }

    private static void drawCircle(int x, int y, int radius,  int radius1, Graphics g) {
        g.drawOval(x, y, radius, radius1);
        g.drawOval(x + WIDTH / 4, y, radius /2, radius/2);
        g.drawOval(x + WIDTH / 4 + WIDTH / 8, y, radius /4, radius/4);

        g.drawOval(x, y + HEIGHT / 7,radius / 2, radius/2);
  //      g.drawOval(x, y + 3 * WIDTH / 8,radius /4, radius/4);

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
