/**
 * @author Nhu Ly
 * @date 2022-10-12
 */
public class StudentTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * Course Object
         */
        Course course = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue");

        /**
         * Student Object
         */
        Student student = new Student("John", "Smith", 20, 3.6f, "Computer Science", "School of Computer Science",
                course);
        
        /** 
         * Cloning Student Object
         */ 
        Student student1 = (Student) student.clone();

        /**
         * Print Student Details
         */
        System.out.println("********Student Details************");
        student.printInfo();
        System.out.println();

        /**
         * Print Cloned Student Details
         */
        System.out.println("********Cloned Student Details******");
        student1.printInfo();
    }
}