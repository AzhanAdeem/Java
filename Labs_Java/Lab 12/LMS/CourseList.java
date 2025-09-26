// This file is part of the mini LLM project.
// This is a list of all the courses that the student is studying.


    public class CourseList {

    // How to take multi input from a user and get muti course name and codes?
    // Scanner ??? No Scanner only works in main();

    String[] courselist = new String[6];

    static int numOfObj = 0;

    CourseList () {
    }

    // ========= Utility Methods for adding elements in the array;

    void add(int index, String name, String code) {

        String concatedString = name +"\t"+ code;
        this.courselist[index] = concatedString;

    }

    String get(int index){
        String valueAt = this.courselist[index];
        return valueAt;
    }

    // === Interprise Methods overridden;

    @Override
    public String toString() {
        //String show = "----//\t End of List";
        String show;

        for(String i : courselist) {
            show = i;
            System.out.printf("\t %s", show);
            //return show;
        }

        return "\t----// End of List \\\\----";
        //return this.getCourseName()+"\t"+this.getCourseCode()+"\n";
        //return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

}
