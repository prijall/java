import java.io.FileInputStream;

public class Example02 {
    public static void main(String[] args) {
       try {
         FileInputStream a= new FileInputStream("C://dell.txt");
         int i=0;
         while((i=a.read())!=-1){
            System.out.println((char)i);
        }
        a.close();
       } catch (Exception e) {
       System.out.println(e);
       }
    }
}
