public class PersonInfo {
    public static void main(String[] args) {
        Athlete a1 = new Athlete("Prijal", 72.5f);
        a1.eat();
        a1.exercise();

        LazyPerson l1 = new LazyPerson("Harry", "Infection");
        l1.eat();
        l1.exercise();
    }
}
