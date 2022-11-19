/**
 * @author Nhu Ly
 * @since 10/02/2022
 */
public class Contractor extends Employee {
    private Double basePay;

    public Contractor() {
        super();
    }
    /**
     * 
     * @param firstName   First Name of Contractor
     * @param lastName    Last Name of Contractor
     * @param age         Age of Contractor
     * @param ssn         SSN number of Contractor
     * @param address     Address of Contractor
     * @param basePay     Base Pay of Contractor
     * @param id          Employee ID of Contractor
     */
    public Contractor(String firstName, String lastName, int age, String ssn, Address address, Double basePay, int id) {
        super(firstName, lastName, age, ssn, address, id);
        this.basePay = basePay;
    }
    /**
     * Getter and Setter of basePay
     */
    public Double getBasePay() {
        return basePay;
    }

    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }

    /**
     * A String for Contractor
     * 
     * @return String for Contractor
     */
    @Override
    public String toString() {
        return super.toString() +
                ", basePay=" + basePay;
    }

    /**
     * Use introduce() method to display SSN number
     */
    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println(this.getSsn());
        }
    }

    public Double computePay(int numHrs) {
        return numHrs * this.basePay;
    }
}