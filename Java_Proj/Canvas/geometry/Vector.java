
import java.util.ArrayList; //  Collection

public class Vector {

    private double x;
    private double y;

    int i; 
    //index of where the value is suppose to be;

    private ArrayList<Double> listOfVec = new ArrayList<>();

    public Vector ( ) { 
        this.x = 0;
        this.y = 0;
    } // Null Constructor

    // Copy Cons
    public Vector(Vector obj) {
           this.x = obj.x;
           this.y = obj.y;
    }

    public void setVector (int index, double x) {

        double[] subArr = {2};
        subArr[index] = x;
        listOfVec.set(index, x);
    }
    
    public double getVector (int x) {
        return listOfVec.get(x);
    }

    @Override
    public String toString ( ) {

        return "Adisa:"+this.x +"\t"+"Ordinate:"+this.y+"\n";
    }
    public String length(int i) {

        double[] subInd = new double[25];

        subInd[i] = this.getVector(i);
        System.out.printf("Dimention = %d", subInd.length);

        if ( subInd.length == 2  ) {
            System.out.print("2 Dimaentional");
        } else if (subInd.length == 3) { 
            System.out.print("3 Dimaentional");
        }

        return "Dimention = %d"+subInd.length;
    }
    public static void main (String[] args) {

        Vector vector1 = new Vector();

        vector1.setVector(0, 34.099);

        System.out.println(vector1);
    }

}