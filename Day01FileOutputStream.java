import java.io.FileOutputStream;

public class Day01FileOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream a=new FileOutputStream("C://hehe.txt");
            String b= "Life is very Beautiful if lived Wholeheartedly";
            byte c[]= b.getBytes();
            a.write(c);
            a.close();
            System.out.println("You're done");
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
