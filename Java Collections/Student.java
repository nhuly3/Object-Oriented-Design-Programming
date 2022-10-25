/**
 * @Author Nhu Ly
 * @Date 10/20/2022
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private float gpa;
    private String major;
    private String department;
    private LinkedList<Course> courses;

    /**
     * 
     * @param firstName     First name of a student
     * @param lastName      Last name of a student
     * @param age           Age of a student
     * @param gpa           GPA of a student
     * @param major         Major of a student
     * @param department    Department of a student
     */
    public Student(String firstName, String lastName, int age, float gpa, String major, String department,
            LinkedList<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.courses = courses;
    }

    /**
     * Getters of all attributes
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

    public float getGPA() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String getDepartment() {
        return department;
    }

    public LinkedList<Course> getCourses() {
        return courses;
    }

    /**
     * Setters of all attributes
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

    public void setGPA(float gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(LinkedList<Course> courses) {
        this.courses = courses;
    }

    /**
     * Add a course to the list
     * @param course
     */
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    /**
     * Remove a course to the list
     * @param course
     */
    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
        }
    }

    /**
     * Create ranking date for the week
     * Assume that Sunday will be before Monday
     * @param date
     * @return
     */
    public Integer getDate(String date) {
        /**
         * Define a ranking date HashMap.
         */
        HashMap<String, Integer> dateRanking = new HashMap<String, Integer>();
        dateRanking.put("sunday", 0);
        dateRanking.put("monday", 1);
        dateRanking.put("tuesday", 2);
        dateRanking.put("wednesday", 3);
        dateRanking.put("thursday", 4);
        dateRanking.put("friday", 5);
        dateRanking.put("saturday", 6);
        String d = date.toLowerCase().replace(" ", "");
        if (dateRanking.containsKey(d)) {
            return dateRanking.get(d);
        } else {
            return -1;
        }
    }

    /**
     * Sorting the courses list
     * @param ascending    True if the list is sorted in ascending order
     * @param attribute    Attributes that needed to be sorted
     */
    public void sortCourses(boolean ascending, String attribute) {
        System.out.println(
                "-----Sorting by " + attribute + " in " + (ascending ? "ascending" : "descending") + " order-----");

        /**
         * Sort the courses by attributes
         */
        Comparator<Course> courseComparator = new Comparator<Course>() {
            @Override
            public int compare(Course course1, Course course2) {
                switch (attribute) {
                    case "name":
                        return course1.getName().compareTo(course2.getName());
                    case "department":
                        return course1.getDepartment().compareTo(course2.getDepartment());
                    case "description":
                        return course1.getDescription().compareTo(course2.getDescription());
                    case "startTime":
                        return course1.getStartTime().compareTo(course2.getStartTime());
                    case "weekday":
                        int course1DateRanking = getDate(course1.getWeekday());
                        int course2DateRanking = getDate(course2.getWeekday());
                        if (course1DateRanking == -1 || course2DateRanking == -1) {
                            System.out.println("Invalid date.");
                            return 0;
                        } else {
                            return course1DateRanking - course2DateRanking;
                        }
                    default:
                        System.out.println("Invalid attribute.");
                        return 0;
                }
            }
        };

        /**
         * Sorting the courses based on ascending 
         * Sorting the course in descending order
         */
        if (ascending) {
            Collections.sort(courses, courseComparator);
        } else {
            Collections.sort(courses, Collections.reverseOrder(courseComparator));
        }
    }
}
