import javax.swing.*;
import java.awt.*;

public class NepalFlag1 extends JFrame {

    public NepalFlag1() {
        setTitle("Flag of Nepal");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Set crimson background
        g.setColor(new Color(206, 17, 38));

        // Define a polygon for the upper section (moon)
       int[] upperXPoints = {210, 360, 210}; // Adjusted points for a triangular shape
        int[] upperYPoints = {30, 170, 170}; // Adjusted points for a triangular shape
        g.fillPolygon(upperXPoints, upperYPoints, 3); // Draw the upper section

        // Define a polygon for the lower section (sun)
        int[] lowerXPoints = {210, 390, 210}; // Adjusted points for a triangular shape
        int[] lowerYPoints = {170, 350, 350}; // Adjusted points for a triangular shape
        g.fillPolygon(lowerXPoints, lowerYPoints, 3); // Draw the lower section

        // Draw standing rod
        g.setColor(new Color(0, 0, 139)); // Dark blue color for the rod
        g.fillRect(190, 0, 20, 400); // Adjusted position and size for better proportions

        // For moon
        // One Oval overlaps other Oval to form a Crescent moon; I was unable to learn drawArc() at this moment.

        g.setColor(Color.white);
        g.drawArc(240, 90, 40, 40, 360, -180); // Draw a crescent moon
        g.fillArc(240, 90, 40, 40, 360, -180); // Fill the crescent moon

        // For star
        int starX[] = {240,250,255,260,270,265,270,260,255,250,240,245};
        int starY[] = {260,260,250,260,260,270,280,280,290,280,280,270}; // Starting is 240
        Polygon star = new Polygon(starX,starY,12);
        g.drawPolygon(star);
        g.setColor(Color.white);
        g.fillPolygon(star);
    }

    public static void main(String[] args) {
        new NepalFlag1();
    }
}