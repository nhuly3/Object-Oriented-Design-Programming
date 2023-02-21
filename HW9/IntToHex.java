
/**
 * @author Nhu Ly
 * @since 12/09/2022
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        try {
            int num = sc.nextInt();
            System.out.println("The hexadecimal value of " + num + " is " + Integer.toHexString(num));
        } catch (InputMismatchException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        sc.close();
    }
}
