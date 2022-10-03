public class Animal {
    //Variables
    private String type;
    private String name;
    private int age;
    private String gender;
    private String environment;
    private int speed;

    public Animal(String type, String name, int age, String gender, String environment, int speed) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.environment = environment;
        this.speed = speed;
    }

    // Getters
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEnvironment() {
        return environment;
    }

    public int getSpeed() {
        return speed;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Type of animal: " + type + "\nName: " + name + "\nAge: " + age + "\nGender: " + gender
                + "\nEnvironment: " + environment + "\nSpeed: " + speed;
    }
}