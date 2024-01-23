// Parent class (Superclass)
class Vehicle {
    protected String brand;

    public void drive() {
        System.out.println("The vehicle is being driven.");
    }
}

// Child class (Subclass) inheriting from Vehicle
class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, int numOfDoors) {
        this.brand = brand;
        this.numOfDoors = numOfDoors;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Number of doors: " + numOfDoors);
    }
}

