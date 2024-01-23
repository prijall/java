import java.io.FileInputStream;

public class Day01FileInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream q= new FileInputStream("C://hehe.txt");
            int i=0;
            while((i=q.read())!=-1){
                System.out.println((char)i);
            }
            q.close();
        } catch (Exception e) {
          System.out.println(e);
        }
    }
}
  
