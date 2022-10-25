/**
 * @Author Nhu Ly
 * @Date 10/20/2022
 */
import java.util.ArrayList;
import java.util.Comparator;

public class PersonTest {
    /**
     * Main method for Person class
     * @param args
     */

    public static void main(String[] args) {

        ArrayList<Object> persons = new ArrayList<Object>();

        /**
         * Create new ArrayList persons
         */
        Person p1 = new Person("Joe", "Smith", 40);
        Person p2 = new Person("Amy", "Gold", 32);
        Person p3 = new Person("Tony", "Stork", 21);
        Person p4 = new Person("Sean", "Irish", 24);
        Person p5 = new Person("Tina", "Brock", 28);
        Person p6 = new Person("Lenny", "Hep", 18);

        /**
         * Add person objects
         */
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);

        /**
         * Print unsorted list
         */
        for (int i = 0; i < persons.size(); i++) {
            System.out.print(((Person) persons.get(i)).getFirstName());
            System.out.print(" " + ((Person) persons.get(i)).getLastName() + ", ");
            System.out.print(((Person) persons.get(i)).getAge() + "\n");

        }

        /**
         * Sorting ArrayList by firstName in ascending and descending order
         */
        persons.sort(((o1, o2) -> (((Person) o1).getFirstName().compareTo(((Person) o2).getFirstName()))));

        System.out.println("\n" + "-----Sorting by First Name in ascending order-----" + "\n");

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(((Person) persons.get(i)).getFirstName() + " " + ((Person) persons.get(i)).getLastName()
                    + ", " + ((Person) persons.get(i)).getAge());
        }

        persons.sort(((o2, o1) -> (((Person) o1).getFirstName().compareTo(((Person) o2).getFirstName()))));

        System.out.println("\n" + "------Sorting by First Name in descending order-----" + "\n");

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(((Person) persons.get(i)).getFirstName() + " " + ((Person) persons.get(i)).getLastName()
                    + ", " + ((Person) persons.get(i)).getAge());
        }

        /**
         * Sorting ArrayList by the length of their lastName in ascending and descending order
         */
        persons.sort(((o1,
                o2) -> (Integer.compare(((Person) o1).getLastName().length(), ((Person) o2).getLastName().length()))));

        System.out.println("\n" + "-----Sorting by length of Last Name in ascending order-----" + "\n");

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(((Person) persons.get(i)).getFirstName() + " " + ((Person) persons.get(i)).getLastName()
                    + ", " + ((Person) persons.get(i)).getAge());
        }

        persons.sort(((o2,
                o1) -> (Integer.compare(((Person) o1).getLastName().length(), ((Person) o2).getLastName().length()))));

        System.out.println("\n" + "-----Sorting by length of Last Name by descending order-----" + "\n");

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(((Person) persons.get(i)).getFirstName() + " " + ((Person) persons.get(i)).getLastName()
                    + ", " + ((Person) persons.get(i)).getAge());
        }

        /**
         * Sorting ArrayList by Age in ascending and descending order
         */
        persons.sort(((o1, o2) -> (Integer.compare(((Person) o1).getAge(), ((Person) o2).getAge()))));

        System.out.println("\n" + "-----Sorting by Age in ascending order-----" + "\n");

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(((Person) persons.get(i)).getFirstName() + " " + ((Person) persons.get(i)).getLastName()
                    + ", " + ((Person) persons.get(i)).getAge());
        }

        persons.sort(((o2, o1) -> (Integer.compare(((Person) o1).getAge(), ((Person) o2).getAge()))));

        System.out.println("\n" + "-----Sorting by Age by descending order-----" + "\n");

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(((Person) persons.get(i)).getFirstName() + " " + ((Person) persons.get(i)).getLastName()
                    + ", " + ((Person) persons.get(i)).getAge());
        }
    }
}