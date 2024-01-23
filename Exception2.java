import java.util.Scanner;

class Exception2{
    public static void main(String[] args) {
        System.out.println("Enter an Integer:");
        Scanner a = new Scanner(System.in); 
        int num = a.nextInt();

        try {
            if(num%2==0){
                System.out.println("Integer is even number[Congratulations]");
            }
            else{
                System.out.println("Integer is odd[Handle with Care]");
            }
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }

    }
}
