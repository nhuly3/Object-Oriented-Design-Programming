/**
 * @Author Nhu Ly
 * @Date 10/20/2022
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    /**
     * 
     * @param firstName   First name of a person
     * @param lastName    Last name of a person
     * @param age         Age of a person
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * Getters of all attributes
     */
    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public int getAge() {

        return this.age;
    }

    /**
     * Setters for all attributes
     */
    public void setFirstName(String first) {

        this.firstName = first;
    }

    public void setLastName(String last) {

        this.lastName = last;
    }

    public void setAge(int newAge) {

        this.age = newAge;
    }
}