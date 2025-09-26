//import java.util.ArrayList;

public class LLMDriver {

     public static void main(String[] args) {

        CourseList courseList = new CourseList();
        courseList.add(0, "Math", "CS123");

        //courseList.toString();
        System.out.println();
        System.out.println(courseList);
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
