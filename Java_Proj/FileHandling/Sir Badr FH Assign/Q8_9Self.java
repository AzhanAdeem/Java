import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;

public class Q8_9Self{
    public static void main(){ 

            // QUESTION 8:
            // Suppose that each splitted line contains following Six  fields:
            //     ItemCode    ItemDescription    UnitPrice        Quantity         Date        SalesPersonI
            // Write code that prints the amount that the buyer has to pay for the item described in the line.

            // QUESTION 9:
            // Write a loop to read each line from the file and print the total of all the items purchased.

            // QUESTION 10:
            // Write code that asks the user for an itemCode and prints the total of the quantity of that item purchased by any of the customer.

            //================================ To split the Fields of the file INCOMPLETE! ========================
            
            File filObj = new File("E:\\");

            String lines;
            String[][] fileConMultiArray = new String[20][6];
            
            Scanner fileScanObj = new Scanner(filObj);                 // Wink Wink :) ;)
        try { 
            while( fileScanObj.hasNextLine() ) {

                lines = fileScanObj.nextLine();                // Every line gets saved in the String from the obj;
                String[] splitLines = lines.split("\t+"); //"[\\\t\s \n\r\,]"  || "\\s+";

                for (int f = 0; f < 6; f++ ) {  
                    fileConMultiArray[f] = splitLines;
                }

                for (String[] a : fileConMultiArray) {
                    System.out.println(Arrays.toString(a));
                    //System.out.println(a);
                }
            }
            fileScanObj.close();
            
         //import ...FileNotFoundException;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.printf("There was an IOException error! In the file lines splitter section.");
        }
    }
}
