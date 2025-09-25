// This file is part of the mini LLM project.
// This is a list of all the courses that the student is studying.

    //import java.util.Scanner;

    public class CourseList {

    // How to take multi input from a user and get muti course name and codes?
    // Scanner ???

    private String courseName;
    private String courseCode;
    String[] courselist = new String[6];

    static int numOfObj = 0;

    CourseList () {
    }

    CourseList(String name, String code) {

        this.setCourseName(name);
        this.setCourseCode(code);
        this.add(numOfObj);

        ++numOfObj;
    }

    // ==== Setters and Getters;

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public void setCourseCode(String code) {
        this.courseCode = code;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    // ========= Utility Methods for adding elements in the array;

    void add(int index) {

        for (int i = 0; i <= courselist.length; i++){

            System.out.println("Enter the six couses you have selected:");
            //Scanner scanner = new Scanner();
            courselist[i] = this.nameAndCodeConcatter();
        }
    }

    String nameAndCodeConcatter() {
        this.getCourseCode();
        this.getCourseName();
        String concatedString = this.getCourseName() + "\t" + this.getCourseCode();
        return concatedString;
    }


    // === Interprise Methods overridden;

    @Override
    public String toString() {
        return this.getCourseName()+"\t"+this.getCourseCode()+"\n";
        //return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

}
