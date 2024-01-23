import java.io.FileOutputStream;

public class Lab03 {
    public static void main(String[] args) {
        try {
            FileOutputStream f= new FileOutputStream("C://prijal.txt");
            String s= "Prijal is hero";
            byte a[]= s.getBytes();
        f.write(a);
        f.close();
        System.out.println("Congratulations!!!!");
        } catch (Exception e) {
            System.out.println(e);
        }
        }
}
