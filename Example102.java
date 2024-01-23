import javax.swing.*;

public class Example102{
    public static void main(String[] args){
        JFrame f = new JFrame("Swing Example");
        JButton b= new JButton("Click Here");
        b.setBounds(100, 95, 95, 40);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
    }
}