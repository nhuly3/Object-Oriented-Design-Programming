public class Racoon extends Animal implements Scratcher {
    public Racoon(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //Scratcher
    @Override
    public void scratch() {
        System.out.println("Scratching");
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