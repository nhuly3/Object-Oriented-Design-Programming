/**
 * @author Nhu Ly
 * @since 10/02/2022
 */
public abstract class Employee extends Person {
    private int id;
    private String educationalLevel;
    private boolean directDeposit;

    public Employee() {
        super();
        this.id = 0;
        this.educationalLevel = "";
        this.directDeposit = false;
    }
    
    /**
     * 
     * @param firstName         First Name of Employee       
     * @param lastName          Last Name of Employee
     * @param age               Age of Employee
     * @param ssn               SSN Number of Employee
     * @param a2                Address of Employee
     * @param id                Employee ID
     */
    public Employee(String firstName, String lastName, int age, String ssn, Address a2, int id) {
        super(firstName, lastName, age, ssn, a2);
        this.id = id;
    }

    /**
     * Getters and Setters
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    public boolean isDirectDeposit() {
        return directDeposit;
    }

    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
    }

    /**
     * A String for Employee
     * 
     * @return Strinf for Employee
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployee ID: " + id + "\nEducational Level: " + educationalLevel
                + "\nDirect Deposit: "
                + directDeposit;
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println(this.getSSN());
        }
    }
}