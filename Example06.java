import java.io.FileInputStream;
public class Example06 {
    public static void main(String[] args) {
      try {
           FileInputStream f= new FileInputStream("C://exam.txt");
            int i=0;
            while((i=f.read())!=-1){
                System.out.println((char)i);
            }
            f.close();
      } catch (Exception e) {
        System.out.println(e);
      }
    }
}
