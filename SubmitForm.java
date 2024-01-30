import javax.swing.*;
import java.awt.event.*;

public class SubmitForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Password Field Example");

        JLabel label1 = new JLabel("Username");
        label1.setBounds(20,20, 80,30);
        JTextField usernameField = new JTextField();
        usernameField.setBounds(100, 75, 100, 30);

        JLabel label2 = new JLabel("Password:");
        label2.setBounds(20, 75, 80, 30);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 150, 100, 30);

        JButton b = new JButton("Login");
        b.setBounds(100, 200, 80, 30);

        JTextField text = new JTextField();
        text.setBounds(100,20, 100,30);

        f.add(label1);
        f.add(usernameField);
        f.add(label2);
        f.add(passwordField);
        f.add(b);
        f.add(text);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Username: " + usernameField.getText();
                data += ", Password: " + new String(passwordField.getPassword());
                label1.setText(data);
            }
        });
    }
}