abstract class Person {
    private String name;

    Person(String name){
        this.name= name;
    }
    
    abstract void eat();
    abstract void exercise();

    public String getName(){
        return name;
    }

}

class Athlete extends Person{
    private float weight;

    Athlete(String name, float weight){
        super(name);
        this.weight=weight;
    }

    @Override
    public void eat(){
        System.out.println("Athlete:" + getName() + "Eats Healthy Foods and has Weight:" +weight );
    }

    @Override
    public void exercise(){
        System.out.println("Athlete:" + getName() + "Sleps well");
    }
}

class LazyPerson extends Person{
    private String disease;

    LazyPerson(String name, String disease){
        super(name);
        this.disease=disease;
    }

    @Override
    public void eat(){
        System.err.println("Lazy Man: " + getName() + "Eats Junk");
    }

    @Override
    public void exercise(){
        System.out.println((getName() + "has" + disease));
    }
}
