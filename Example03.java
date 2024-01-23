import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Example03 {
    public static void main(String[] args) throws Exception {
        FileOutputStream q= new FileOutputStream("C://dell.txt");
        BufferedOutputStream k= new BufferedOutputStream(q);
        String s = "Hare Krishna";
        byte r[]=s.getBytes();
        k.write(r);
        k.close();
        q.close();
        System.out.println("Succes");
    }
}
