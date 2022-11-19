/**
 * @author Nhu Ly
 * @since 10/02/2022
 */
public class Executive extends Employee {
    private Double yearlyBonus;
    private Double yearlyCompensation;

    public Executive() {
    }
    /**
     * 
     * @param firstName         First Name
     * @param lastName          Last Name
     * @param age               Age
     * @param ssn               SSN Number
     * @param address           Address
     * @param id                Employee ID
     * @param pay               Yearly Compensation
     * @param yearlyBonus       Yearly Bonus
     */
    public Executive(String firstName, String lastName, int age, String ssn, Address address, int id, Double pay,
            Double yearlyBonus) {
        super(firstName, lastName, age, ssn, address, id);
        this.yearlyCompensation = pay;
        this.yearlyBonus = yearlyBonus;
    }

    /**
     * Getter and Setter
     * @return
     */
    public Double getBonus() {
        return yearlyBonus;
    }

    public void setBonus(Double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nYearly Bonus: " + yearlyBonus +
                ", Yearly Compensation: " + yearlyCompensation;
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println(this.getSSN());
        }
    }

    public Double computePay() {
        return this.yearlyCompensation + this.getBonus();
    }
}