public class Fruit {
    private String name;
    private int price;

    Fruit(String name, int price){
        this.name=name;
        this.price=price;
    }

    public void DisplayInfo(){
        System.out.println("Name: "  + name + ",Price: " + price);
    }
}

class Tasty extends Fruit{
    private float size;

    Tasty(String name, int price, float size){
        super(name, price);
        this.size=size;
    }

    public void Display(){
        DisplayInfo();
        System.out.println("Size:" + size);
    }
}