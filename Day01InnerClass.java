public class Day01InnerClass {
    private int data = 40;

    class hehe{
        void msg(){
            System.out.println("The Value is:" + data);
        }
    }

    public static void main(String[] args) {
        Day01InnerClass i = new Day01InnerClass();
        Day01InnerClass.hehe h = i.new hehe();
        h.msg();
    }
}
