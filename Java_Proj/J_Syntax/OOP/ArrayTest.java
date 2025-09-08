
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTast {
    public static void main(String[] args) {

        /*
         * I am trying to write a code that takes in two values stores it in a ArrayList
         * and prints out the array, or uses that array to perform opperations.
         */

        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter two +ve integers");
        int index = scanObj.nextInt();
        double vecX = scanObj.nextDouble();
        
        Vector vec1 = new Vector(index, vecX);

        // ========= Prevant leaks; free up old stored value.
        scanObj.close();
    }
}

class Vector {
    int index;
    double x;
    static int numOfVectors = -1;

    Vector(int x, double y) {
        this.index = x;
        this.x = y;

        numOfVectors++;
    }

    ArrayList<Double[]> arrList = new ArrayList<Double[]>();

    Double[] doubObjArr = new Double[2];
    
    /* 
    For every vecObj there will be a new array Index;
    The DoubleArrObj index is equal to the vector index;
    */

    void set(int index, double val) {

        Double autoBoxValue = this.x;

        doubObjArr[numOfVectors] = autoBoxValue;

        arrList.add(numOfVectors, doubObjArr);


    }
}