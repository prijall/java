import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OddEvenChecker {

    public static void main(String[] args) {
        // Create Swing components
        JFrame frame = new JFrame("Odd or Even Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel numberLabel = new JLabel("Enter number:");
        JTextField numberField = new JTextField(10);
        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);  // Make result field non-editable
        JButton checkButton = new JButton("Check");

        // Create layout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(numberLabel);
        panel.add(numberField);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(checkButton);

        // Add action listener to check button
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String numberStr = numberField.getText();

                    // Ensure input is a valid integer
                    int number = Integer.parseInt(numberStr);

                    // Check if odd or even
                    String result = (number % 2 == 0) ? "Even number" : "Odd number";

                    // Display result in result field
                    resultField.setText(result);
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    resultField.setText("Invalid input: Please enter a valid integer.");
                }
            }
        });

        // Add panel to frame and display
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
