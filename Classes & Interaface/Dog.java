public class Dog extends Animal implements Domesticated {
    public Dog(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //Domesticated
    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public void greetHuman() {
        System.out.println("Greeting people");
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

    public void bark() {
        System.out.println("Barking");
    }
}