import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField radiusTextField;
    private JLabel resultLabel;

    public Calculator() {
        // Set up the JFrame
        setTitle("Circle Area Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        radiusTextField = new JTextField(10);
        JLabel radiusLabel = new JLabel("Enter Radius:");
        resultLabel = new JLabel("Area will be displayed here");

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateArea();
            }
        });

        // Set up layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(radiusLabel);
        add(radiusTextField);
        add(calculateButton);
        add(resultLabel);

        // Display the frame
        setVisible(true);
    }

    private void calculateArea() {
        try {
            // Get the radius from the text field
            double radius = Double.parseDouble(radiusTextField.getText());

            // Calculate the area of the circle
            double area = Math.PI * radius * radius;

            // Display the result in the label
            resultLabel.setText("Area: " + area);
        } catch (NumberFormatException ex) {
            // Handle the case where the input is not a valid number
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });
    }
}

