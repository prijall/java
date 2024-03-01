//flag of Nepal

import java.awt.*;

public class practice33 extends Frame {
    
    practice33(){
        this.setSize(700, 700);
      
    }
       @Override
       public void paint(Graphics g){

        //for holding stick
        g.setColor(Color.BLACK);
        g.fillRect(30, 30, 10, 600);

        //for blue part
        g.setColor(Color.BLUE);
        int x1_points[]={40, 340, 123, 530, 40,44};
        int y1_points[]={30, 300, 100, 440, 330, 30};
        g.fillPolygon(x1_points, y1_points, 5);

        //for red part
        g.setColor(Color.RED);
        int x2_points[]={50, 320, 90, 505, 50,50};
        int y2_points[]={50, 220, 220, 520, 520, 50};
        g.fillPolygon(x2_points, y2_points, 5);

        //for sun
        g.setColor(Color.WHITE);
        g.fillArc(100, 350, 125, 0, 360, ABORT);


        //for moon
        g.setColor(Color.WHITE);
        g.fillArc(100, 155, 100, 35, 0, -180); 
       }
    

       public static void main(String[] args) {
        new practice33();
               
       }
     
}