public class Employee extends Person {
    // Variables
    private int id;
    private String status;
    private double pay;

    /**
     * 
     * @param first
     * @param last
     * @param age
     * @param ssn
     * @param address
     * @param gender
     * @param weight
     * @param id
     * @param status
     * @param pay
     */
    public Employee(String first, String last, int age, String ssn, String address, String gender, double weight,
            int id,
            String status, double pay) {
        super(first, last, age, ssn, address, gender, weight);
        this.id = id;
        this.status = status;
        this.pay = pay;
    }

    // Getters
    public int getID() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public double getPay() {
        return pay;
    }

    // Setters
    public void setID(int id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public void introduce() {
        System.out.println(toString());
    }

    public double calculatePay(double unit) {
        if (status.equalsIgnoreCase("Part time")) {
            return pay * unit;
        } else if (status.equalsIgnoreCase("Full time")) {
            return pay * 1 / 52 * unit;
        } else {
            return pay * unit;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployee ID: " + id + "\nStatus: " + status + "\nBase Pay: $" + pay;
    }
}