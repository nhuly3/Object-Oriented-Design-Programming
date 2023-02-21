
/**
 * @author Nhu Ly
 * @since 12/09/2022
 */
import java.io.*;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args) {
        /**
         * Create command_line_input.txt
         */
        try {
            File myObj = new File("command_line_input.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            /**
             * write to the file
             */
            try {
                FileOutputStream fos = new FileOutputStream("command_line_input.txt");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the data to be written to the file (@q to quit):");
                /**
                 * read data
                 */
                String str = sc.nextLine();
                while (!str.equalsIgnoreCase("@q")) {
                    fos.write(str.getBytes());
                    /**
                     * write a new line
                     */
                    fos.write(System.getProperty("line.separator").getBytes());
                    str = sc.nextLine();
                }
                fos.close();
                sc.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}