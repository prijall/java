public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", 4);

        // Calling methods from the parent class
        myCar.drive(); // Inherited method

        // Calling method specific to Car class
        myCar.displayDetails();
    }
}
