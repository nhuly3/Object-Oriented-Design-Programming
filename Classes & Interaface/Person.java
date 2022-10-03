public class Person {
    private String first;
    private String last;
    private int age;
    private String ssn;
    private String address;
    private String gender;
    private double weight;

    public Person(String first, String last, int age, String ssn, String address, String gender, double weight) {
        this.first = first;
        this.last = last;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
    }

    // Getters
    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public int getAge() {
        return age;
    }

    public String getSSN() {
        return ssn;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    // Setters
    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void introduce() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Name: " + first + " " + last + "\nAge: " + age + "\nSSN: " + ssn + "\nAddress: " + address
                + "\nGender: "
                + gender + "\nWeight: " + weight;
    }
}