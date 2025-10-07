//import java.util.ArrayList;

public class LLMDriver {

     public static void main(String[] args) {

        // ==== ==== Testing Course List Class

        CourseList courseList = new CourseList();

        System.out.println(courseList.courselist.length);
        System.out.println(courseList.addInvock);

        courseList.add(0, "Math", "CS123");
        courseList.add("Science", "CS345");
        courseList.add("Eng", "CS345");
        courseList.add("Pro Fund", "CS345");
        courseList.add("Isl", "CS345");
        courseList.add("Pst", "CS345");
        courseList.add("Calcu", "CS345");

        System.out.println("\n"+ courseList);

        // ==== ==== Testing Student Class

        // Student stu1 = new Student("Saad", "25SP-001-CS");
        // stu1.add("Math", "CS233");
        // stu1.add("Eng", "CS234");
        // stu1.add("PST", "CS007");
        // stu1.add("Phy", "CS304");
        // stu1.add("Chem", "CS450");

        // System.out.println(stu1);

        // ==== ==== Testing ClassList Class

        //ClassList class1 = new ClassList(stu1);

    }

    // // ================== Old code for custom Array list Dynamic;
    // // =========== To make the var global we made it static.

    // static intList intListRefVarFrObj;

    // public static void main(String[] args) {

    //     System.out.println("I have been compiled");

    //     // intList intListRefVarFrObj;
    //     boolean error;

    //     try {  

    //         intListRefVarFrObj = new intList(23);

    //     } catch ( ArrayIndexOutOfBoundsException e) {

    //         e.printStackTrace();
    //         error = true;
    //         intListRefVarFrObj.autoSize();
    //     }

    //     System.out.println(Math.PI);
    // }
}
