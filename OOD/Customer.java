/**
 * @author Nhu Ly
 * @since 10/02/2022
 */
public class Customer extends Person {

    private int customerID;
    private String paymentPreference;

    public Customer() {
        super();
    }

    /**
     * 
     * @param firstName              First Name of Customer
     * @param lastName               Last Name of Customer
     * @param age                    Age of Customer
     * @param ssn                    SSN Number of Customer
     * @param a1                     Address of Customer
     * @param customerID             Customer ID
     * @param paymentPreference      Customer's Payment Preference
     */
    public Customer(String firstName, String lastName, int age, String ssn, Address a1, int customerID,
            String paymentPreference) {
        super(firstName, lastName, age, ssn, a1);
        this.customerID = customerID;
        this.paymentPreference = paymentPreference;
    }

    /**
     * Getters and Setters
     * @return
     */
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getPaymentPreference() {
        return paymentPreference;
    }

    public void setPaymentPreference(String paymentPreference) {
        this.paymentPreference = paymentPreference;
    }

    /**
     * A String for Customer
     * 
     * @return String for Customer
     */
    @Override
    public String toString() {
        return super.toString() + "\nCustomer ID: " + customerID +
                "\nPayment Preference: " + paymentPreference;
    }

    public void makePayment() {
        System.out.println(this.paymentPreference);
    }
}