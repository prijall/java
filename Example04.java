import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Example04 {
    public static void main(String[] args) {
       try {
         FileInputStream a = new FileInputStream("C://dell.txt");
        BufferedInputStream b= new BufferedInputStream(a);

        int i=0;
        while((i=b.read())!=-1){
         System.out.println((char)i);
        b.close();
        a.close();

       }} catch (Exception e) {
       System.out.println(e);
       }

    
    }
}
