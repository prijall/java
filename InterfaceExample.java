// Main class to demonstrate the usage of interfaces
public class InterfaceExample {
    public static void main(String[] args) {
        // Creating objects of classes that implement the Printable interface
        MyClass obj1 = new MyClass();
        YourClass obj2 = new YourClass();

        // Calling the print() method of the implemented classes
        obj1.print(); // Output: Printing from MyClass
        obj2.print(); // Output: Printing from YourClass
    }
}