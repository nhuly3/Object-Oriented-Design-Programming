
/**
 * @author Nhu Ly
 * @since 12/09/2022
 */
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileInput {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("quote.txt");
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
