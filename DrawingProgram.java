import javax.swing.*;
import java.awt.*;

public class DrawingProgram extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set up Graphics2D for smoother drawing
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Square dimensions
        int squareX = 100;
        int squareY = 100;
        int squareSize = 200;

        // Draw the red square
        g2d.setColor(Color.RED);
        g2d.fillRect(squareX, squareY, squareSize, squareSize);

        // Circle dimensions (centered within the square)
        int circleX = squareX + squareSize / 4;  
        int circleY = squareY + squareSize / 4;
        int circleDiameter = squareSize / 2;

        // Draw the green circle
        g2d.setColor(Color.GREEN);
        g2d.fillOval(circleX, circleY, circleDiameter, circleDiameter);

        // Text
        g2d.setColor(Color.BLACK); //  Black text for visibility 
        g2d.setFont(new Font("Arial", Font.BOLD, 18));
        String text = "All the best";
        FontMetrics fm = g2d.getFontMetrics();

        // Center the text above the circle
        int textX = circleX + (circleDiameter - fm.stringWidth(text)) / 2;
        int textY = circleY - fm.getHeight();

        g2d.drawString(text, textX, textY);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawing");
        frame.add(new DrawingProgram());
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
