/**
 * @author Nhu Ly
 * @since 10/02/2022
 */
public class PartTimeHourly extends Employee {
    private Double baseHourlyPay;

    public partTimeHourly() {
    }

    /**
     * 
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param address
     * @param baseHourlyPay
     */
    public PartTimeHourly(String firstName, String lastName, int age, String ssn, Address address,
            Double baseHourlyPay) {
        super(firstName, lastName, age, ssn, address, 0);
        this.baseHourlyPay = baseHourlyPay;
    }

    /**
     * Getter and Setter
     * @return
     */
    public Double getBaseHourlyPay() {
        return baseHourlyPay;
    }

    public void setBaseHourlyPay(Double baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }

    @Override
    public String toString() {
        return super.toString() +
                "baseHourlyPay=" + baseHourlyPay;
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println(this.getSsn());
        }
    }

    public Double computePay(int numHrs) {
        return numHrs * this.baseHourlyPay;
    }

}