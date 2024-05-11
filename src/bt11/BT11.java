package bt11;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.Random;

public class BT11 extends JPanel {
    private static final int NUM_STARS = 20;
    private static final int STAR_RADIUS = 100;
    private static final int CIRCLE_RADIUS = 120;
    private static final Random random = new Random();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        for (int i = 0; i < NUM_STARS; i++) {
            double angle = 2 * Math.PI * i / NUM_STARS;
            int x = (int) (centerX + CIRCLE_RADIUS * Math.cos(angle));
            int y = (int) (centerY + CIRCLE_RADIUS * Math.sin(angle));

            // Random color 
            g2d.setColor(getRandomColor());

            // Rotate the star
            AffineTransform transform = new AffineTransform();
            transform.rotate(angle, x, y);
            Shape star = createStar(x, y);
            Shape rotatedStar = transform.createTransformedShape(star);

            g2d.fill(rotatedStar);
        }
    }

    private Color getRandomColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    private Shape createStar(int x, int y) {
        int[] xPoints = new int[10];
        int[] yPoints = new int[10];

        for (int i = 0; i < 10; i++) {
            double angle = 2 * Math.PI * i / 10;
            int radius = i % 2 == 0 ? STAR_RADIUS : STAR_RADIUS / 2;
            xPoints[i] = (int) (x + radius * Math.cos(angle));
            yPoints[i] = (int) (y + radius * Math.sin(angle));
        }

        return new Polygon(xPoints, yPoints, 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BT11");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BT11());
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
