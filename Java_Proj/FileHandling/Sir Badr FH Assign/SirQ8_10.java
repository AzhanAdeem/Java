//package Sir Badr FH Asimnt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class SirQ8_10{
    public static void main(String[] args) {
        try {
            File filObj2 = new File("E:\\Programming\\Java_Proj\\FileHandling\\Sir Badr FH Asimnt\\sampleForQuizExam.txt"); 
            Scanner fileScanObj = new Scanner(filObj2);
            
            // For Question 9: Total of all items purchased
            double grandTotal = 0.0;
            String itemCode;
            double unitPrice;
            int    quantity;
            
            // For Question 10: We'll store quantities by item code
            HashMap<String, Integer> itemQuantities = new HashMap<String, Integer>(); // Not that well under stood;
            
            // Process each line
            while( fileScanObj.hasNextLine() ) {
                String line = fileScanObj.nextLine();
                String[] splitLines = line.split("\t+");
                
                // if(splitLines.length < 6) {
                //     continue; // Skip malformed lines
                // }
                
                // Parse the relevant fields
                itemCode  = splitLines[0];
                unitPrice = Double.parseDouble(splitLines[2]);
                quantity  = Integer.parseInt(splitLines[3]);
                
                // Calculate amount for this line (Question 8)
                double lineTotal = unitPrice * quantity;
                System.out.printf("Amount to pay for %s: $%.2f %n", splitLines[1], lineTotal);
                
                // Add to grand total (Question 9)
                grandTotal += lineTotal;
                
                // Update item quantities (Question 10)
                itemQuantities.put(itemCode, itemQuantities.getOrDefault(itemCode, 0) + quantity);
            }
            fileScanObj.close();
            
            // Print grand total (Question 9)
            System.out.printf("%nTotal of all items purchased: $%.2f%n", grandTotal);
            
            // Handle Question 10
            Scanner userInput = new Scanner(System.in);
            System.out.print("\nEnter an item code to get total quantity purchased: ");
            String searchCode = userInput.nextLine();
            
            if(itemQuantities.containsKey(searchCode)) {
                System.out.printf("Total quantity purchased for item %s: %d%n", 
                                searchCode, itemQuantities.get(searchCode));
            } else {
                System.out.println("Item code not found.");
            }
            
            userInput.close();
            
        } catch(FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } //catch(IOException e) {
        //     System.out.println("There was an IOException error!");
        //     e.printStackTrace();
        // }
    }
}