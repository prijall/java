public class Main2 {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog("Buddy", 3, 0.6);

        // Calling method from the superclass via the subclass method
        myDog.displayDogInfo();
    }
}
