// Define an interface named Printable
interface Printable {
    void print(); // Abstract method declaration without implementation
}

// Implementing class that implements the Printable interface
class MyClass implements Printable {
    // Implementing the print() method as required by the Printable interface
    public void print() {
        System.out.println("Printing from MyClass");
    }
}

// Another class implementing the Printable interface
class YourClass implements Printable {
    // Implementing the print() method as required by the Printable interface
    public void print() {
        System.out.println("Printing from YourClass");
    }
}


