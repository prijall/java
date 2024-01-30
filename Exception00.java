import java.util.*;

public class Exception00 {
    public static void main(String[] args) {
        System.out.println("Enter an Integer:");
        Scanner a= new Scanner(System.in);
        int num = a.nextInt();

        try {
            if(num%2==0){
                System.out.println("The number is even");
            }
            else
            {
                System.out.println("The number is odd");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
