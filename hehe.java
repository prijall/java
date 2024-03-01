import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class hehe extends JFrame {

    private final int[] data = {30, 20, 50}; // Example data for pie chart segments

    public hehe() {
        setTitle("Pie Chart Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PieChartPanel pieChartPanel = new PieChartPanel();
        add(pieChartPanel);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    class PieChartPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int total = 0;
            for (int value : data) {
                total += value;
            }

            int startAngle = 0;
            int arcAngle;
            int diameter = Math.min(getWidth(), getHeight());

            for (int i = 0; i < data.length; i++) {
                arcAngle = (int) Math.round((double) data[i] / total * 360);

                g2d.setColor(getRandomColor());
                g2d.fillArc((getWidth() - diameter) / 2, (getHeight() - diameter) / 2, diameter, diameter, startAngle, arcAngle);

                startAngle += arcAngle;
            }
        }

        private Color getRandomColor() {
            // Generates a random color for each pie chart segment
            return new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
        }
    }

    public static void main(String[] args) {
        new hehe();
    }
}
