import javax.swing.*;
import java.awt.event.*;

public class Upper01 extends JFrame{
    private JTextField tf;

    public Upper01(){
        JFrame f= new JFrame();
        tf= new JTextField(20);
        JButton b= new JButton("Convert to Uppercase");

        f.add(b); f.add(tf);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                  ConvertToUpperCase();
            }
        });
    }

    private void ConvertToUpperCase(){
        String Otext= tf.getText();
        String Utext=Otext.toUpperCase();
        tf.setText(Utext);
    }

    public static void main(String[] args){
        new Upper01();
    }

}
