public class Animal06 {
    public void eats(){
        System.out.println("Animal eats food");
    }
}

class Cat extends Animal06{
    @Override
    public void eats(){
        System.out.println("cat eats biscuits");
    }
}

class Cow extends Animal06{

     @Override
    public void eats(){
        System.out.println("Cow eats grass");
    }
}