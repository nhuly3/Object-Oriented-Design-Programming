/**
 * @author Nhu Ly
 * @date 2022-10-12
 */
public class EmployeeTest {
    public static void main(String[] args) {
        /**
         * Eemployee Object
         */
        Employee e = new Employee("John", "Smith", 35, 101);

        /**
         * Print Employee Details
         */
        System.out.println("********Employee Details********");
        System.out.println(e);
        System.out.println();

        /**
         * Use computePay() method to print how much employee earned
         */
        System.out.println("********Employee Earned********");
        System.out.println(e.computePay(40));
        System.out.println(e.computePay(23));
        System.out.println(e.computePay(1));
        System.out.println(e.computePay(0));
        System.out.println(e.computePay(-5));
        System.out.println(e.computePay(45));

        return;
    }
}