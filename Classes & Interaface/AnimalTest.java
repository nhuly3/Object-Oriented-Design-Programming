public class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog("Domestic", "Dog", 2, "Female", "Home", 26);
        Cat c = new Cat("Domestic", "Cat", 11, "Female", "Home", 30);
        Racoon r = new Racoon("Wild", "Racoon", 5, "Male", "Forest", 10);
        Whale w = new Whale("Aquatic", "Whale", 4, "Male", "Ocean", 35);

        System.out.println();
        System.out.println(d.toString());
        d.bark();
        d.eat();
        d.greetHuman();
        d.move();
        d.sleep();
        d.sound();
        d.walk();

        System.out.println();
        System.out.println(c.toString());
        c.eat();
        c.greetHuman();
        c.move();
        c.scratch();
        c.sleep();
        c.sound();
        c.walk();

        System.out.println();
        System.out.println(r.toString());
        r.eat();
        r.move();
        r.scratch();
        r.sleep();
        r.sound();

        System.out.println();
        System.out.println(w.toString());
        w.eat();
        w.move();
        w.sleep();
        w.sound();
        w.swim();

    }
}