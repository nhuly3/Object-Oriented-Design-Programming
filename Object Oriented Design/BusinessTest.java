/**
 * @author Nhu Ly
 * @since 10/02/2022
 */
public class BusinessTest {
    public static void main(String[] args) {
        /**
         * Instances for Executive, Customer, FullTimeSalaried Employee, FullTimeHourly Employee
         * 
         * Set Educational Level and Direct Deposit for each class
         */
        Address address = new Address(111, "Duncan Hall", "San Jose", "1111", "CA");
        Executive e = new Executive("Nhu", "Ly", 21, "112233", address, 001, 3000.0, 790.0);
        e.setEducationalLevel("Undergraduate");
        e.setDirectDeposit(false);

        Address a1 = new Address(222, "Clark Hall", "San Francisco", "2222", "CA");
        Customer c = new Customer("John", "Smith", 34, "223344", a1, 002, "Cash");

        Address a2 = new Address(333, "Sweeney Hall", "New York", "3333", "NY");
        FullTimeSalaried s = new FullTimeSalaried("Amelia", "Jones", 23, "334455", a2, 003, 34.0);
        s.setEducationalLevel("Master");
        s.setDirectDeposit(true);

        Address a3 = new Address(444, "Tower Hall", "Chicago", "4444", "Illinois");
        FullTimeHourly h = new FullTimeHourly("Aoife", "Faul", 24, "445566", a3, 4, 50.0, 10.0);
        h.setEducationalLevel("Undergraduate");
        h.setDirectDeposit(true);
        
        /**
         * Print intances above
         */
        System.out.println(e);
        System.out.println();
        System.out.println(c);
        System.out.println();
        System.out.println(s);
        System.out.println();
        System.out.println(h);
        e.introduce(true);
        e.computePay();
        s.introduce(true);

    }
}