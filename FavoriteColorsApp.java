import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FavoriteColorsApp extends JFrame {
    public FavoriteColorsApp() {
        // Set up the frame
        setTitle("Favorite Colors");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout
        setLayout(new BorderLayout());

        // Create buttons
        JButton redButton = createColorButton("Red", Color.RED);
        JButton greenButton = createColorButton("Green", Color.GREEN);
        JButton blueButton = createColorButton("Blue", Color.BLUE);

        // Add buttons to the frame
        add(redButton, BorderLayout.WEST);
        add(greenButton, BorderLayout.CENTER);
        add(blueButton, BorderLayout.EAST);
    }

    private JButton createColorButton(String buttonText, Color backgroundColor) {
        JButton button = new JButton(buttonText);

        // Set button background color
        button.setBackground(backgroundColor);

        // Add action listener to change background color on button click
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(backgroundColor);
            }
        });

        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FavoriteColorsApp().setVisible(true);
            }
        });
    }
}
