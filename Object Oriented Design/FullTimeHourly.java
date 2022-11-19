/**
 * @author Nhu Ly
 * @since 10/02/2022
 */
public class FullTimeHourly extends FullTimeEmployee {
    private Double overtimePay;

    public FullTimeHourly() {
    }

    /**
     * 
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param a3
     * @param id
     * @param basePay
     * @param overtimePay
     */
    public FullTimeHourly(String firstName, String lastName, int age, String ssn, Address a3, int id,
            Double basePay, Double overtimePay) {
        super(firstName, lastName, age, ssn, a3, id, basePay);
        this.overtimePay = overtimePay;
    }

    /**
     * Getter and Setter
     * @return
     */
    public Double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(Double overtimePay) {
        this.overtimePay = overtimePay;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBase Pay: " + this.getBasePay() +
                ", Overtime Pay: " + overtimePay;
    }

    public Double computePay(int numHrs) {
        return this.getBasePay() * (numHrs + this.getOvertimePay());
    }
}