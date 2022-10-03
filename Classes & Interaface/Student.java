public class Student {
  //Variables
  String first;
  String last;
  int age;
  Float gpa;
  String major;
  String department;
  
/**
 * Constructor
 * @param first
 * @param last
 * @param age
 * @param gpa
 * @param major
 * @param department
 */
  public Student(String first, String last, int age, Float gpa, String major, String department) {
    this.first = first;
    this.last = last;
    this.age = age;
    this.gpa = gpa;
    this.major = major;
    this.department = department;
  }

  //Getters
  public String getFirst() {
    return first;
  }
  public String getLast() {
    return last;
  }
  public int getAge() {
    return age;
  }
  public Float getGPA() {
    return gpa;
  }
  public String getMajor() {
    return major;
  }
  public String getDepartment() {
    return department;
  }

  //Setters
  public void setFirst(String first) {
    this.first = first;
  }
  public void setLast(String last) {
    this.last = last;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setGPA(Float GPA) {
    this.gpa = GPA;
  }
  public void setMajor(String major) {
    this.major = major;
  }
  public void setdepartment(String department) {
    this.department = department;
  }

  //Course Inner Class
  class Course {
    public void printSchedule() {
      System.out.print("CS151   Tue/Thur 6-7:15\n");
      System.out.print("Eng101  Mon/Wed  10-11:15\n");
      System.out.print("Hist100 Tue/Thur 1:30-2:45\n");
    }
  }
}
