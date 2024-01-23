public class VehicleInfo01 {
    public static void main(String[] args) {

        Car c1 = new Car("SUV", "BMW X7");
        c1.startEngine();
        c1.stopEngine();

        Motorcycle m1 = new Motorcycle("Dirt", 45);
        m1.startEngine();
        m1.stopEngine();
    }
}
