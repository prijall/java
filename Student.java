public class Student {
    private int roll;

    Student(int roll){
        this.roll=roll;
    }

    public void Display(){
        System.out.println("The Roll no is:" + roll);
    }

    public int getRoll(){
        return roll;
    }
}

class Test extends Student{
    private float m1, m2;

    Test(int roll, float m1, float m2){
        super(roll);
        this.m1=m1;
        this.m2=m2;
    }

    @Override
    public void Display(){
        System.out.println("The Roll no is:" + getRoll());
        System.out.println("The Marks of a first student is:"+ m1);
        System.out.println("The Marks of a second student is:"+ m2);
    }

    public float getM1(){
        return m1;
    }

    public float getM2(){
        return m2;
    }
}



