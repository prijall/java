public class Men {
    private String name;

    Men(String name){
        this.name=name;
    }

    public void eat(){

    }

    public String getName(){
        return name;
    }
}

class Boy extends Men{
    private int age;

    Boy(String name, int age){
        super(name);
        this.age=age;
    }

    @Override
    public void eat(){
        System.out.println(getName()  +" " of age" +" " age + "Eats Healthy food");
    }
}

