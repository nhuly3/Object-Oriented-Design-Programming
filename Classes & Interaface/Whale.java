public class Whale extends Animal implements Swimmer {
    public Whale(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //Swimmer
    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    public void move() {
        System.out.println("Moving");
    }

    public void sound() {
        System.out.println("Making noise");
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}