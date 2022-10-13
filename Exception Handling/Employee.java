/**
 * @author Nhu Ly
 * @date 2022-10-12
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int pay;
    private int id;

    /**
     * Constructor
     * @param firstName
     * @param lastName
     * @param pay
     * @param id
     */

    public Employee(String firstName, String lastName, int pay, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pay = pay;
        this.id = id;
    }

    /**
     * Getters method
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastNam() {
        return lastName;
    }

    public int getPay() {
        return pay;
    }

    public int getId() {
        return id;
    }

    /**
     * Setters method
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Implementing computerPay() method 
     */
    public float computePay(int hours) {
        /**
         * If the number of hours is invalid
         */
        try {
            if (hours < 0)
                throw new NumberFormatException();
        } catch (NumberFormatException n) {
            System.out.println("The number of hours is invalid");
            return 0;
        }

        /**
         * If the number of hours is over 40
         */
        try {
            if (hours > 40)
                throw new TooManyHoursWorkedException("The number of hours is over 40");
        } catch (TooManyHoursWorkedException t) {
            System.out.println("Exception: " + t.getMessage());
            return 0;
        }

        /**
         * Print the final result
         */
        return this.pay * hours;
    }

    /**
     * Print Employee Details
     */
    @Override
    public String toString(){
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nEmployee ID: " + id + "\nHourly Pay: " + pay;
    }
}