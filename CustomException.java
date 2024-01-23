
class MyException extends Exception {

    MyException(String message){
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int marks = 105;

        try {
            if (marks > 100) {
                // Throw the custom exception when marks are greater than 100
                throw new MyException("Inavild marks");
            }
            // This code should not be reachable if an exception is thrown
            System.out.println("Marks is " + marks);
        } catch (MyException e) {
            // Catch and handle the custom exception
            System.out.println(e.getMessage());
        }
    }
}
