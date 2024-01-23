import java.io.FileOutputStream;

public class Game {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("pablo.txt");
            f.write(65);
            f.close();
            System.out.println("Sucessss");
        } catch (Exception e) {
            System.out.println(e);
    }
}
}
