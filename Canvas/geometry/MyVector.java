
import java.util.ArrayList; //  Collection
import java.util.*; //  Collection
import java.lang.*;

// Prob vector is pre defined in java.util;   package.
public class MyVector {

    private double x;
    private double y;

    // ===================================== An array list for storing the vectors.
    private ArrayList<Double> listOfVec = new ArrayList<Double>();

    // ==================================== Constructors
    // =================== Null Constructor
    public MyVector() {
        this.x = 0;
        this.y = 0;
    }

    // ================== Copy Cons

    public MyVector(MyVector other) {

        // while (Double[] x : other.getVector(0)){
        // }
         this.x = other.getVector(0);
         this.y = other.getVector(0);
    }

    // =================================== Getter and setters

    public void setVector(int index, double x) {

        /*
         * used double wrapper class as I have to store an array into the ArrayList.
         * As ArrayList only stores objs.
         * Wrapper class will convert double primitive to Double obj. 
         * Through AutoBoxing;
         */

        // ===== Declaration of ref var:
        Double arrForSet;

        // ===== Instantiation (creating an obj in memory);
        arrForSet = Double.valueOf(x);
 
        // ===== Initialization (1st value assigned)
        arrForSet = x;

        listOfVec.add(index, arrForSet);
    }

    public Double getVector(int x) {
        return listOfVec.get(x);
    }

    // ===================================== To String method

    @Override
    public String toString() {
        int i = 0;
        return "Abisa:" + this.getVector(i) + "\t" + "Ordinate:" + this.getVector(i) + "\n";
    }

    // ============ Tell the number of dimentions;
    
    void lengthTell() {  
    
    // ===== Declaration  (Ref Var)            ========= Instantiation ( Created Obj on Heap)
     ArrayList<ArrayList<Double>> multiArray = new ArrayList<ArrayList<Double>>();
    // ======== This only created a multiArray ArrayList, it did not create sub arrays;

        Double[] D2 = { 23.96, 34.99 };
        int[] list = { 0, 1, 2, 3, 4 };

        // ============== Creating Instances/Obj inside the (multiArray) sub arrays;
        multiArray.add(new ArrayList<Double>()); // R1 row1
        multiArray.add(new ArrayList<Double>()); // R2 
        multiArray.add(new ArrayList<Double>()); // R3
        multiArray.add(new ArrayList<Double>()); // R4
        multiArray.add(new ArrayList<Double>()); // R5

        for (int x : list) {
            multiArray.get(x).add(getDouble(D2));
            // Calling the subArray and appending the values;
        }

        // double[][] subInd = new double[10][2];

        // try {

        //     subInd[i][i] = this.getVector(i); // This will give you an array [];
        //     System.out.printf("Dimention = %d", subInd.length + 1);

        //     if (subInd.length == 1) {
        //         System.out.print("2 Dimaentional");
        //     } else if (subInd.length == 2) {
        //         System.out.print("3 Dimaentional");
        //     } else {
        //         System.out.println("Index out of bound error.");
        //     }

        //     return "Dimention = %d" + subInd.length + 1;

        // } catch (Exception e) {

        //     throw new IndexOutOfBoundsException();
        //     // System.out.println("Re-run the code and use a smaller index.");

        // }

        }

    // ========================= For cloning vector
    @Override
    public object clone() throws CloneNotSupportedExceptionError{
        return ;
    }

    // ========================= For checking equality
     void equals(MyVector other){
        if (other.x == this.x) {
            System.out.printf("They %f %f are equal: \n", this.x, other.y );
        } else {
            System.out.println("They are not equal.");
        }

    }

    // ======================================== Vector testing main method
    static Double getDouble(Double[] arr) {
        Double ans = null;
        for (Double x : arr) {
            ans = x;
        }
        return ans;
    }
    public static void main(String[] args) {

        MyVector vector1 = new MyVector();
        vector1.setVector(0, 34.099);

        MyVector vector2 = new MyVector(vector1);

        System.out.println(vector2.toString());
        System.out.println(vector1.toString());

    }
}