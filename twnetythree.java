import javax.swing.*;

public class twnetythree extends JFrame {
    twnetythree(){
        setSize(600, 600);
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
      JFrame f = new JFrame();
    JButton b= new JButton("Button 1");
    JButton b1= new JButton("Button 2");
    JButton b2= new JButton("Long Button");
    JButton b3 = new JButton("S");
    f.add(b);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    
    f.setVisible(true);

    }

    public static void main(String[] args) {
        new twnetythree();
    }

   

}
