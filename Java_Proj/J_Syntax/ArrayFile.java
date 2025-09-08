
// ================  Java file to test how arrays are added in ArrayList

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Scanner;
// import java.util.Vector;
// import java.io.File;
// import java.io.FileWriter;

public class ArrayFile {

    public static void main(String[] args) {

        ArrayList<ArrayList<Double>> multiArray = new ArrayList<ArrayList<Double>>();

        Double[] D2 = { 23.96, 34.99 };
        int[] list = { 0, 1, 2, 3, 4 };

        multiArray.add(new ArrayList<Double>());
        multiArray.add(new ArrayList<Double>());
        multiArray.add(new ArrayList<Double>());
        multiArray.add(new ArrayList<Double>());
        multiArray.add(new ArrayList<Double>());

        for (int x : list) {
            multiArray.get(x).add(getDouble(D2));
        }
    }

    static Double getDouble(Double[] arr) {
        Double ans = null;
        for (Double x : arr) {
            ans = x;
        }
        return ans;
    }

    // ========================= We can also add arraylists to the array list
    // directly;
    //
    // ArrayList<Double> array = new ArrayList(); ArrayList<>() ArrayList<Double>();
    //
    // ArrayList< Arraylist<Double> > multiArr = new ArrayList< Arraylist<Double>()
    // >();
    //
    // multiArr.add(array);
    //
    //
    // multiArr.get(0).get(0);
}
