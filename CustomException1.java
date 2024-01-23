public class CustomException1 {
    public static void main(String[] args) {
        int marks =105;
        try{
            if(marks>100){
                throw new MyException("Invalid Marks");
            }
            System.out.println("Marks is:" + marks);
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
