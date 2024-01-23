import java.io.BufferedOutputStream;
import java.io.FileOutputStream;;

public class Example07 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout= new FileOutputStream("C://exam.txt");
        BufferedOutputStream bout= new BufferedOutputStream(fout);
    }
}
