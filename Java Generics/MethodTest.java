import java.util.ArrayList;
import java.util.Arrays;

public class MethodTest {
    public static <T> int count(ArrayList<T> list) {
        return list.size();
    }

    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>(Arrays.asList("CS", "Computer", "Science", "Department", "151"));
        ArrayList<Integer> i = new ArrayList<>(Arrays.asList(6, 9, 5, 8, 4, 34));
        ArrayList<Double> d = new ArrayList<>(Arrays.asList(6.7, 3.5, 2.4, 7.0, 9.4, 5.4, 11.8, 345.6));

        System.out.println();
        System.out.println("String List has " + count(s) + " counts.");
        System.out.println("Integer List has " + count(i) + " counts.");
        System.out.println("Double List has " + count(d) + " counts.");
    }
}