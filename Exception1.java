//write a program that takes an integer  as parameteer through exception if it is odd
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
      System.out.println("Enter an Integer:");
      Scanner val = new Scanner(System.in);
      int num = val.nextInt();
     

      try {
        if(num%2!=0){
            System.out.println("Odd value[Handle with care]");
        }
        else{
            System.out.println("Entered number is even");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
     

  }
}
     
      
