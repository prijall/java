abstract class Vehicle01 {
    private String type;

    abstract void startEngine(); //abstract method
    abstract void stopEngine();  

    Vehicle01(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }
}

class Car extends Vehicle01{
    private String name;

    Car(String type, String name){
        super(type);
        this.name=name;
    }

    @Override
    public void startEngine(){
        System.out.println("Engine Started:" + getType() + name);
    }

    @Override
    public void stopEngine(){
        System.out.println("Engine Stopped: "+ getType() + name);
    }
}

class Motorcycle extends Vehicle01{
    private int model;

    Motorcycle(String type, int model){
        super(type);
        this.model=model;
    }

    @Override
    public void startEngine(){
        System.out.println("Engine start:" + getType() + model);
    }

    @Override
    public void stopEngine(){
        System.out.println("Engine stopped:" + getType() +  model);
    }
}