import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PieChartExample extends JFrame {
    private static final long serialVersionUID = 1L;

    private int[] data = { 30, 20, 50 }; // Sample data for the pie chart

    public PieChartExample() {
        setTitle("Pie Chart Example");
        setSize(400, 400);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        add(new PieChartPanel());

        setVisible(true);
    }

    class PieChartPanel extends JPanel {
        private static final long serialVersionUID = 1L;

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            int width = getWidth();
            int height = getHeight();
            int startAngle = 0;

            for (int i = 0; i < data.length; i++) {
                int arcAngle = (int) ((double) data[i] / getTotal() * 360);
                g.setColor(getRandomColor());
                g.fillArc(50, 50, width - 100, height - 100, startAngle, arcAngle);
                startAngle += arcAngle;
            }
        }

        private int getTotal() {
            int total = 0;
            for (int value : data) {
                total += value;
            }
            return total;
        }

        private Color getRandomColor() {
            return new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
        }
    }

    public static void main(String[] args) {
        new PieChartExample();
    }
}
