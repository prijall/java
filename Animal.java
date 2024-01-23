// Parent class (Superclass)
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    private double height;

    public Dog(String name, int age, double height) {
        super(name, age);
        this.height = height;
    }

    public void displayDogInfo() {
        displayInfo(); // accessing method from the superclass
        System.out.println("Height: " + height);
    }
}

