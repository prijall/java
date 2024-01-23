public class Error {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=5;
        int x,y;

        try {
            x = a/(b-c);  //exception
        } catch (Exception e) {
           System.out.println("a is divided by zero");
        }
        y=a/(b+c); 
        System.out.println("Value of y is:" + y);
    }
}
