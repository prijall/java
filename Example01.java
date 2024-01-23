import java.io.FileOutputStream;

public class Example01 {
 public static void main(String[] args) {
    try {
        FileOutputStream f= new FileOutputStream("C://dell.txt");
        String s = "Dell is the best pc company";
        byte g[]= s.getBytes();

        f.write(g);
        f.close();
        System.out.println("Congratulations");
    } catch (Exception e) {
        System.out.println(e);
    }
 }   
}
