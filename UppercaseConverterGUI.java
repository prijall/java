import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UppercaseConverterGUI extends JFrame {
    private JTextField textField;

    public UppercaseConverterGUI() {
        // Set up the frame
        setTitle("Uppercase Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new FlowLayout());

        // Create components
        textField = new JTextField(20);
        JButton convertButton = new JButton("Convert to Uppercase");

        // Add components to the frame
        add(textField);
        add(convertButton);

        // Add action listener to the button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertToUppercase();
            }
        });
    }

    private void convertToUppercase() {
        String originalText = textField.getText();
        String uppercaseText = originalText.toUpperCase();

        textField.setText(uppercaseText);
        textField.setBackground(Color.YELLOW); // Change background color
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UppercaseConverterGUI().setVisible(true);
            }
        });
    }
}
