import java.io.*;

class Student1 implements Serializable {
    private int roll;
    private String name;
    private String address;

    public Student1(int roll, String name, String address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    // Getters and setters (not necessary for serialization, but good practice)
    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", Address: " + address;
    }
}

public class SerializeDemo {
    public static void main(String[] args) {
        // Create a Student object
        Student1 student = new Student1(101, "John Doe", "123 Main St");

        // Serialize the object and write it to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"))) {
            oos.writeObject(student);
            System.out.println("Object has been serialized and written to student.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
