
// This is the student class that uses the courselist class 
// The Student class is associatied with the courselist class

// Each student will create it's own object and have their separate courses.

public class Student {

    // ====  ====  Attributes

    private String stuName;
    private String seatNum;
    CourseList stuCourseList = new CourseList();

    // When the constructor runs add a func that takes all the course values and adds it in the list;
    public Student(String name, String snum) {

        this.setName(name);
        this.setSeatNum(snum);
        //this.stuCourseList.add();

    }


    // ====  ==== Setters and Getters

    void setName(String name){
        this.stuName = name;
    }

    void setSeatNum(String num){
        this.seatNum = num;
    }

    String getName(){
        return this.stuName;
    }

    String getSeatNum() {
        return this.seatNum;
    }

    // ==== ===== Utility method 
    void add(String courseName, String courseCode){
        this.stuCourseList.add(courseName, courseCode);
    }


    //@Overriding interprise methods;

    @Override
    public String toString(){

        System.out.printf("Student Name: %s, Student SeatNum: %s\n", this.getName(), this.getSeatNum());
        System.out.println("Courses Enrolled:");
        for (String i : this.stuCourseList.courselist) {
            System.out.printf("%s\t",i);
        }
        return "//====== End +=====\\\\";
    }



    
}
