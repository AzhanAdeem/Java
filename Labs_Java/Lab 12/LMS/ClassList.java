
// Part of the LLM program; this is a list of all the studets in the class;
// Each student has his own course list and we are suppose to return the studentlist on demand;

import java.lang.Cloneable;

public class ClassList extends Object implements Cloneable {

    private Student[] stuArray = new Student[10];

    // ClassList Cons takes a Student class obj saves it in stuArray array;

    ClassList(Student stuObj) {

        super();
        this.setStuInClass(stuObj); 

    }

    // ==== ==== Setter and Getter

    void setStuInClass(Student stuObj) {

        // Constrctor did not handle it in the setter made a new func for it;
        if (Student.numOfStu < 31) {
            this.stuArray[Student.numOfStu - 1] = stuObj; // -1 as index starts from 0; 

        } else { // resize array;

            int newLen = (stuArray.length)+(stuArray.length/2)+1;
            Student[] stuArray2 = new Student[newLen];

            try {
                
                stuArray2 = (Student[]) stuArray.clone(); // Frame/ primitive clone;
            
                for (int i = 0 ; i < stuArray.length;i++) { // Deep clone of array of Students;

                    stuArray2 = (Student[]) this.stuArray[i].clone();
                }

                this.stuArray = stuArray2; 
                // Shallow copy; the varRef now points to a new obj on heap with increased size;

            } catch (CloneNotSupportedException e) {
                e.printStackTrace();

                System.out.println("\nClone Not Supported\n");
            } // try catch end
        }     // if else end
    }         // method end

    // ==== ==== Utility Methods

    // Method to get a student by index;

    public Student getStudent(int index) {

        if (index >= 0 && index < Student.numOfStu) {
            return stuArray[index];
        }

        return null;
    }

    // Method to get all students
    // Woun't toString work here?

    // public Student[] getAllStudents() {
    //     Student[] result = new Student[Student.numOfStu];

    //     //A built in java method to copy arrays;
    //     //.array(SourseArray, start copying from, Copy Array, pastfrom, stopAtInSourceArray);
    //     //System.arraycopy(stuArray, 0, result, 0, Student.numOfStu);

    //     return result;
    // }

    // Method to get current number of students
    public int getStudentCount() {
        return Student.numOfStu;
    }

    // ==== Overriding

    @Override
    protected Object clone() throws CloneNotSupportedException {

        ClassList classListClone = (ClassList) super.clone();
        // The primitive datatypes have been copied but obj get ref copied;

        classListClone.stuArray = (Student[]) this.stuArray.clone();
        //Array structure copied;

        //We can also make a method for this;
        for (int i = 0; i < Student.numOfStu; i++) { // loop is in the clone method now;

            if (this.stuArray[i] != null) { // Null value check;

                classListClone.stuArray[i] = (Student) this.stuArray[i].clone();

            }
        }

        return classListClone;
    }

    // Search the student;
    public Student search(int index) {

        return stuArray[index];
        // for (Student x : stuArray) {
        // }                           
    }

    @Override
    public String toString( ) {

        StringBuffer strBuff = new StringBuffer();
        
        for (int i = 0; i < Student.numOfStu; i++){ 

            if ( stuArray[i] != null) {

                 strBuff.append("Student :\n")
                 .append(i).append("Student Name"+stuArray[i].getName())
                 .append(" Course Code :"+ stuArray[i].getSeatNum()+"\n");
                 //all this is a singleLine;

                }
        }
        
        return strBuff.toString(); // stringBuffer's toString is called to print the buffer Obj;
    }
}
