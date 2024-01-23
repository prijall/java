package inheritance;

class Programmer extends Employee{
    int bonus= 10000;
     public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer Bonus is:" + p.bonus);
        System.out.println("The Salary of an employee is :" + p.salary);
}

   
    }

