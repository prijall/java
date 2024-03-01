import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {
    JFrame f;

    BoxLayoutExample() {
        f = new JFrame();

        // Creating buttons
        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");

        // Creating panels for each direction
        JPanel northPanel = createPanel(b1, Color.RED);
        JPanel southPanel = createPanel(b2, Color.GREEN);
        JPanel eastPanel = createPanel(b3, Color.BLUE);
        JPanel westPanel = createPanel(b4, Color.YELLOW);
        JPanel centerPanel = createPanel(b5, Color.ORANGE);

        // Set layout manager to BoxLayout for the content pane
        Container contentPane = f.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        // Add panels to the frame in the specified order
        contentPane.add(northPanel);
        contentPane.add(Box.createVerticalGlue()); // Add spacing
        contentPane.add(centerPanel);
        contentPane.add(Box.createVerticalGlue()); // Add spacing
        contentPane.add(southPanel);
        contentPane.add(westPanel);

        f.setSize(300, 300);
        f.setVisible(true);
    }

    private JPanel createPanel(JButton button, Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(Box.createHorizontalGlue()); // Add spacing
        panel.add(button);
        panel.add(Box.createHorizontalGlue()); // Add spacing
        return panel;
    }

    public static void main(String[] args) {
        new BoxLayoutExample();
    }
}
