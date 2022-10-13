/**
 * @author Nhu Ly
 * @since 10/02/2022
 */
public abstract class FullTimeEmployee extends Employee {
    private Double basePay;

    public FullTimeEmployee() {
    }

    /**
     * 
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param address
     * @param id
     * @param basePay
     */
    public FullTimeEmployee(String firstName, String lastName, int age, String ssn, Address address, int id,
            Double basePay) {
        super(firstName, lastName, age, ssn, address, id);
        this.basePay = basePay;
    }

    /**
     * Getter and Setter
     * @return
     */
    public Double getBasePay() {
        return basePay;
    }

    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }
}
