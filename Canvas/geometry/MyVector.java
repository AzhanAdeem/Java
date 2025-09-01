
import java.util.ArrayList; //  Collection


// Prob vector is pre defined in java.util;   package.
public class MyVector {

    private double x;
    private double y;

    //=====================================  An array list for storing the vectors.
    private ArrayList<Double[]> listOfVec = new ArrayList<Double[]>();

    // ==================================== Constructors
    // ===================  Null Constructor 
    public MyVector ( ) { 
        this.x = 0;
        this.y = 0;
    } 

    // ================== Copy Cons
    public MyVector(MyVector obj) {
           this.x = obj.getVector(0);
           this.y = obj.getVector(0);
    }

    // ===================================  Getter and setters

    public void setVector (int index, double x) {

    /* 
        usig double wrapper class as I have to store an array into the ArrayList. 
        As ArrayList only stores objs.
        Wrapper class will convert double primitive to Double obj. Through AutoBoxing;
    */

        listOfVec.add(index, x);
    }
    
    public double getVector (int x) {
        return listOfVec.get(x);
    }

    // =====================================   To String method
    @Override
    public String toString ( ) {
        int i = 0;
        return "Abisa:"+this.getVector(i) +"\t"+"Ordinate:"+this.getVector(i)+"\n";
    }

    public String length(int i) {

        double[] subInd = new double[25];

        subInd[i] = this.getVector(i);
        System.out.printf("Dimention = %d", subInd.length + 1);

        if ( subInd.length == 1  ) {
            System.out.print("2 Dimaentional");
        } else if (subInd.length == 2) { 
            System.out.print("3 Dimaentional");
        }

        return "Dimention = %d"+subInd.length + 1;
    }

    // =========================  For cloning vector
    //void clone(){};

    // ========================= For checking equality
    //void equals(){};

    // ========================================  Vector testing main method
    public static void main (String[] args) {

        MyVector vector1 = new MyVector();
        vector1.setVector(0,34.099);

        MyVector vector2 = new MyVector(vector1);
        System.out.println(vector2.toString());

        System.out.println(vector1.toString());
    }

}