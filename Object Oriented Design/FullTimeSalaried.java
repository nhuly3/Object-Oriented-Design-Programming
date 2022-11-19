/**
 * @author Nhu Ly
 * @since 10/02/2022
 */
public class FullTimeSalaried extends FullTimeEmployee {
    public FullTimeSalaried() {
    }

    /**
     * 
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param a2
     * @param id
     * @param basePay
     */
    public FullTimeSalaried(String firstName, String lastName, int age, String ssn, Address a2, int id,
            Double basePay) {
        super(firstName, lastName, age, ssn, a2, id, basePay);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase Pay: " + this.getBasePay();
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println(this.getSSN());
        }
    }

    public Double computePay(int numWeeks) {
        return this.getBasePay() * (1 / 52.0) * numWeeks;
    }
}
