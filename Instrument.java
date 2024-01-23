public class Instrument {
    private String name;
    private double price;

    Instrument(String name, double price)
    {
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void Display(){
        System.out.println("The Instrument Name is:" + name);
        System.out.println("The price for an instrument is:" + price);
    }
}
  
class Guitar extends Instrument{
    private float height;

    Guitar(String name, double price, float height){
        super(name, price);
        this.height=height;
    }

     @Override
    public void Display(){
        System.out.println("The Instrument Name is:" + getName());
        System.out.println("The price for an instrument is:" + getPrice());
        System.out.println("The height of an instrument is:" + height);
    }
}
