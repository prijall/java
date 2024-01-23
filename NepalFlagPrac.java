import java.awt.*;


public class NepalFlagPrac extends Frame {
    NepalFlagPrac(){
        this.setSize(700, 700);
        this.setVisible(true);
    }


    public void paint(Graphics g){

        //for stick to hold the flag
        g.setColor(Color.BLACK); 
        g.fillRect(30, 30, 10, 600);

        //Outer part of the flag
        g.setColor(Color.BLUE);
        int x_point[]={50, 350, 125, 540, 40, 40};
        int y_point[]={30, 230, 230, 530, 530, 30};
        g.fillPolygon(x_point, y_point, 5);

        g.setColor(Color.RED);
        int x1_point[]={50, 350, 125, 540, 40, 40};
        int y1_point[]={30, 230, 230, 530, 530, 30};
        g.fillPolygon(x1_point, y1_point, 5);

        g.setColor(Color.WHITE);
        g.fillArc(100, 250, 125, 134, 0, 360);
        g.fillArc(100, 155, 100, 35, 0, -180);

        g.setColor(Color.BLUE);
    }

    public static void main(String[] args) {
        new NepalFlagPrac();
    }
}
