/**
 * @Author Nhu Ly
 * @Date 10/20/2022
 */
public class Course {
    private String name;
    private String description;
    private String department;
    private String startTime;
    private String weekday;

    /**
     * 
     * @param name             Course Name
     * @param description      Course Description
     * @param department       Course Department
     * @param startTime        Time the course starts
     * @param weekday          Week Day the course is held on      
     */
    public Course(String name, String description, String department, String startTime, String weekday) { 
        super();
        this.name = name;
        this.description = description;
        this.department = department;
        this.startTime = startTime;
        this.weekday = weekday;
    }

    /**
     * Getters and setters of all attributes
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
}