
// This file is part of the mini LLM project.
// This is a list of all the courses that the student is studying.

public class CourseList {

    // How to take multi input from a user and get muti course name and codes?
    // Scanner ??? No Scanner only works in main(); .add() .add() .add()

    String[] courselist = new String[6];
    int maxAllow =  courselist.length;
    int addInvock = 0; // course counter / the size;
    static int numOfObj = 0;  // Obj counter;

    CourseList() {
        numOfObj++;
    }

    // ========= Utility Methods 
    // ==== ==== Settter for adding elements in the array;

    void add(int index, String name, String code) {
        
        String concatedString = name + ":\t" + code;
        if (this.checkSpace() == true) {
            if (this.checkIndfree(index) == true) {  

                this.courselist[index] = concatedString;
                ++addInvock;
            } else {
                System.out.println("Index occupied");
            }

        } else {

            System.out.println("Max Length has reached. No more then six elements.\n Can't add 7th entry.\n");
        }
    }

    void add(String name, String code) {

        String concatedString = name + ":\t" + code;

        if (this.checkSpace() == true) {
            if (this.checkIndfree(addInvock) == true) {  

                this.courselist[addInvock] = concatedString;
                ++addInvock; 

            } else {
                System.out.printf("index: %d is occupied", addInvock);
            }
        } else {
            System.out.println("Max Length has reached. No more then six elements.\n Can't add after 6th entry.\n");
        }
    }

    // ==== ==== Getter

    String getCourse(int index) {
        String valueAt = this.courselist[index];
        return valueAt;
    }

    // ==== ==== Method to check if array full;

    public boolean checkSpace() {

        if (addInvock > courselist.length) {
            return true;
        }
        return false;
    }

    // Method to check if index Occupied;

    public boolean checkIndfree(int index) {

        if (this.courselist[index] == null) {
            return true;
        }
        return false;
    }

    // Replace: to replace the entry;   
    // reverse loop; 1) take index 2) shift till that index, the value at that index wil also be shifted.

    public void replace(int index, String name, String code) {

        String concatedString = name+":\t"+code;

        for (int i = addInvock-1; i >= index; i--) {
            this.courselist[i] = this.courselist[i++];
        }
        this.courselist[index] = concatedString;

        return;
    }
 
    // ==== ==== Delete;

    public String delete(int index) {
        
        String delItem = this.courselist[index];
        this.courselist[index] = null;

        return delItem;
    }

    // === ==== Interprise Methods overridden;

    @Override
    public String toString() {

        for (String i : courselist) { // loop through the list and show every item of the list;
            System.out.printf("\t%s", i);
        }
        System.out.println("\n\t"+courselist.length);

        return "\t----// End of List \\\\----";
        // return this.getCourseName()+"\t"+this.getCourseCode()+"\n";
        // return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

}