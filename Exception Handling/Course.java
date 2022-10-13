/**
 * @author Nhu Ly
 * @date 2022-10-12
 */
public class Course implements Cloneable {
    private String courseName;
    private String courseDesc;
    private String department;
    private String time;
    private String weekday;

    public Course() {
    }

    /**
     * Constructor
     * @param courseName
     * @param courseDesc
     * @param department
     * @param time
     * @param weekday
     */

    public Course(String courseName, String courseDesc, String department, String time, String weekday) {
        this.courseName = courseName;
        this.courseDesc = courseDesc;
        this.department = department;
        this.time = time;
        this.weekday = weekday;
    }

    /**
     * Getters method
     */
    public String getCourseName() {
        return courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public String getDepartment() {
        return department;
    }

    public String getTime() {
        return time;
    }

    public String getWeekDay() {
        return weekday;
    }

    /**
     * Setters method
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setWeekDay(String weekday) {
        this.weekday = weekday;
    }

    /**
     * Print Course details
     */
    @Override
    public String toString() {
        return "Course: " + courseName + "\nDescription: " + courseDesc + "\nDepartment: " + department
                + "\nTime the Course starts: " + time + "\nDay: " + weekday;
    }

    /**
     * Clone method for deep copy
     */
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}