import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame f= new JFrame("Button Example");
        JTextField tf = new JTextField();
        JButton b = new JButton("Click Here");
        b.setBounds(130, 100, 100, 50);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Hello! Please Enter");
            }
        });
        f.add(b);
        f.add(f);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
