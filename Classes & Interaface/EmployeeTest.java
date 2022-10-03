public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Smith", 30, "11111111", "Duncan Hall", "Male", 80, 01, "Contractor", 60);
        Employee e2 = new Employee("Lisa", "Gray", 23, "2222222", "Concert Hall", "Female", 56, 02, "Full Time",
                110000);
        Employee e3 = new Employee("Timothy", "Briggs", 32, "33333333", "Clark Hall", "Male", 70, 03, "Full Time",
                80000);
        Employee e4 = new Employee("George", "Wallace", 40, "44444444", "MacQuarrie Hall", "Male", 67, 04, "Part Time",
                20);
        Employee e5 = new Employee("Amy", "Student", 25, "55555555", "Sweeney Hall", "Female", 50, 05, "Contractor",
                45);

        e1.introduce();
        System.out.println("Salary: $" + e1.calculatePay(30));
        System.out.println();

        e2.introduce();
        System.out.println("Salary: $" + e2.calculatePay(2));
        System.out.println();

        e3.introduce();
        System.out.println("Salary: $" + e3.calculatePay(4));
        System.out.println();

        e4.introduce();
        System.out.println("Salary: $" + e4.calculatePay(25));
        System.out.println();

        e5.introduce();
        System.out.println("Salary: $" + e5.calculatePay(45));
        System.out.println();
    }
}