public class StudentTest {
    public static void main(String[] args) {
        //Create a Student object
        Student student = new Student("John", "Smith", 20, 3.6f, "Compuert Science",
                "School of Computer Science department");
        //Create a Course object
        Student.Course course = student.new Course();
        course.printSchedule();
    }
}