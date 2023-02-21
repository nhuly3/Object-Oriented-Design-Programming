/**
 * 
 * @author Nhu Ly
 * @since 12/09/2022
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private Address address;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.ssn = "";
        this.address = null;
    }

    /**
     * 
     * @param firstName The first name
     * @param lastName  The last name
     * @param address   The address
     * @param ssn       The social security number
     */
    public Person(String firstName, String lastName, Address address, String ssn, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.ssn = ssn;
        this.age = age;
    }

    /**
     * A string representation
     */
    @Override
    public String toString() {
        return "Person:\n" + "Name: " + firstName + " " + lastName + "\nAge: " + age + "\nSSN: " + ssn + "\nAddress: "
                + address;
    }

    /**
     * Getters
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    public Address getAddress() {
        return address;
    }

    /**
     * Setters
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}