import java.util.LinkedList;

public class StudentTest {
    public static void main(String[] args) {
        Course course1 = new Course("CS 47", "Computer Science", "Introduction to Computer System", "16:00",
                "TUesday");
        Course course2 = new Course("CS 151", "Computer Science", "Object Oriented Design & Programming", "17:00",
                "Monday");
        Course course3 = new Course("PHIL 134", "Philosophy", "Computers, Ethics, Society", "12:00", "Thursday");
        Course course4 = new Course("METR 10", "Meteorology", "Weather and Climate", "8:00", "Friday");
        LinkedList<Course> courses = new LinkedList<Course>();
        Student student = new Student("Nhu", "Ly", 21, 3.8f, "Computer Science", "CS", courses);
        student.addCourse(course1);
        student.addCourse(course2);
        student.addCourse(course3);
        student.addCourse(course3);
        student.addCourse(course4);

        String attributes[] = { "name", "name", "description", "description",
                "department", "department", "startTime", "startTime",
                "weekday", "weekday" };
        boolean ascending = true;
        for (String attribute : attributes) {
            student.sortCourses(ascending, attribute);
            printCourses(student);
            ascending = !ascending;
        }
    }

    public static void printCourses(Student student) {
        for (Course c : student.getCourses()) {
            System.out.println("Course name: " + c.getName() + ", Department: " + c.getDepartment() + ", Description: "
                    + c.getDescription() + ", Starting time: " + c.getStartTime() + ", Week Day: " + c.getWeekday());
        }
        System.out.println();
    }
}
