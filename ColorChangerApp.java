import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangerApp implements ActionListener {

    private JFrame frame;
    private JButton button1, button2, button3;

    private Color favoriteColor1 = Color.BLUE; // Replace with your favorite color
    private Color favoriteColor2 = Color.GREEN; // Replace with your favorite color
    private Color favoriteColor3 = Color.RED; // Replace with your favorite color

    public ColorChangerApp() {
        frame = new JFrame("Color Changer");

        button1 = new JButton("Color 1");
        button1.setBackground(favoriteColor1);
        button1.addActionListener(this);

        button2 = new JButton("Color 2");
        button2.setBackground(favoriteColor2);
        button2.addActionListener(this);

        button3 = new JButton("Color 3");
        button3.setBackground(favoriteColor3);
        button3.addActionListener(this);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        frame.getContentPane().setBackground(clickedButton.getBackground());
    }

    public static void main(String[] args) {
        new ColorChangerApp();
    }
}
