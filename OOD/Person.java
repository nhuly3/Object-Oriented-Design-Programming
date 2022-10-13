/**
 * @author Nhu Ly
 * @since 10/02/2022
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private Address address;

    public Person() {
    }

    /**
     * 
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param address
     */
    public Person(String firstName, String lastName, int age, String ssn, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
    }

    /**
     * Getters and Setters
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSSN() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * A String for Person
     * 
     * @return String for Person
     */
    @Override
    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nSSN: " + ssn
                + "\nAddress: " + address;
    }
}