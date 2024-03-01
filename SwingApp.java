import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingApp extends JFrame {

     public SwingApp(){
        JFrame f = new JFrame("UpperCase Converter");
       JTextField  tf = new JTextField(20);
        JButton b= new JButton("Convert To Uppercase");

        f.add(b); f.add(tf);
        f.setSize(300, 150);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ConvertToUpperCase();
            }
        });   
    }
    private void ConvertToUpperCase(){
        String Otext=tf.getText();
        String Utext= Otext.toUpperCase();
        tf.setText(Utext);
    }
     
    public static void main(String[] args) {
        new SwingApp();
    }
    
}
