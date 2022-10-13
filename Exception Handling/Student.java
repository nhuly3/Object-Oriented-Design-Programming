/**
 * @author Nhu Ly
 * @date 2022-10-12
 */
public class Student implements Cloneable {
    private String firstName;
    private String lastName;
    private int age;
    private float gpa;
    private String major;
    private String department;
    private Course course;

    /**
     * Constructor
     * @param firstName
     * @param lastName
     * @param age
     * @param gpa
     * @param major
     * @param department
     * @param course
     */
    public Student(String firstName, String lastName, int age, float gpa, String major, String department,
            Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.course = course;
    }

    /**
     * Getters method
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public float getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String getDepartment() {
        return department;
    }

    public Course getCourse() {
        return course;
    }

    /**
     * Setters method
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * Overriding clone method for deep copy
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }

    /**
     * Use printInfo() method to print Student and Course details
     */
    public void printInfo() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Major: " + this.major);
        System.out.println("Department: " + this.department);
        System.out.println("Course Name: " + this.course.getCourseName());
        System.out.println("Course Description: " + this.course.getCourseDesc());
        System.out.println("Department: " + this.course.getDepartment());
        System.out.println("Time: " + this.course.getTime());
        System.out.println("Day: " + this.course.getWeekDay());
    }
}