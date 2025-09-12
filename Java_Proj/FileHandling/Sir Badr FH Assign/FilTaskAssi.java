import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class FilTaskAssi{
        public static void main (String[] args) {

            // QUESTION 1:
            // Write steps that are required to open a text file to read data from the file.

            // QUESTION 2:
            // How to determine if the file is not opened?
           
            String filPath = new String("E:\\Programming\\Java_Proj\\FileHandling\\Sir Badr FH Asimnt\\File1.txt");
            //String filPath = "E:\\Programming\\Java_Proj\\FileHandling\\Sir ...";

            // A absolute path is used to ensure no error occurs when Java locates the file; As the root folder is also given.
            // Stored in a var for ease of use. Now we can change it directly by passing new values to the var;
            // Double back slash (\\) to prevent escape sequence.

            // File Handling means taking Input and Output from a file. 
            // This helps us taking input from external files in our code and saving our data in an file;
            // Java can read Reading: .docx (Word), .xlsx (Excel), .pptx (PPT) and .txt(Text File); xlsx to CXV;

            File filObj = new File(filPath);  //   IMP

            try {  // A try catch block to identify any Input Output Errors while handling the file;
                
                if(filObj.createNewFile()){  //Boolian value (T/F). Check if Java can or can not create the new file;
                    System.out.println("File Created successfully.");
                    System.out.println("File is located at:"+ filObj.getPath());

                    if(filObj.exists()){
                        System.out.println("File exists");
                        String pathOfFile = filObj.getPath(); // (String)filObj.getPath(); .getName()
                        //Metod to get the Path of created file; We Saved it in a String; Can use Type casting;
                        System.out.println(pathOfFile);
                    }

                } else {
                    System.out.println("File Not created.");
                }
                    
            } catch (IOException e) {    // If an error occurs catch the error;
                e.printStackTrace();   // e is a object created by class IOException;
            }

            // QUESTION 3:
            // How to read one line from the opened file?
            // Same as below just use string splitting, and add a loop that runs onely once; 
            // use if-else condition; (controle structures)

            // QUESTION 4:
            // How to keep on reading one line from the opened file and print each line. When all line are read, 
            // prints the message "END OF THE FILE HAS REACHED"

            // QUESTION 5:
            // How to close the file if it was opened other wise print the message "File was not opened".

            // QUESTION 6:
            // Suppose the line that you read from the file contains TAB delimited data; how to convert that line into fields.

            // QUESTION 7:
            // Write a loop that prints all the fields extracted from the line.
            
            File filObj2 = new File("E:\\Programming\\Java_Proj\\FileHandling\\Sir Badr FH Asimnt\\sampleForQuizExam.txt");

            try{
                if(filObj2.exists()){

                    System.out.println("File exists.");
                    Scanner fileScanObj = new Scanner(filObj2); // A Scanner Obj to read the content of the file;

                    while( fileScanObj.hasNextLine() ) {   // Boolian value (T/F) if True loop runs;
                        System.out.println(fileScanObj.nextLine()); //Take next line from file and print it;
                    } 

                    if ( fileScanObj.hasNextLine() ) {
                        System.out.println("The file has not ended."); //Can also leave this empty;
                    } else {
                        System.out.println("\n======================================  END OF THE FILE HAS REACHED  ==========================");
                    }
                    fileScanObj.close(); // To prevent any faults while opening new files;
                    
                    //================================ To split the Fields of the file INCOMPLETE! ========================

                    String lines;
                    String[][] fileConMultiArray = new String[20][6];
                    
                    fileScanObj = new Scanner(filObj2);                 // Wink Wink :) ;)

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
                }
                //import ...FileNotFoundException;
            } catch(IOException e) {
                e.printStackTrace();
                System.out.printf("There was an IOException error! In the file lines splitter section.");
            }

            // ===================================      Ok, So this happened in a single dimentional array;

            // ======================================  END OF THE FILE HAS REACHED  ==========================

            // ?ItemCode        Product        Unit Price        Qty        Date        Rep IDD        Product D        5        22        6/17/2019        E011D        Product D        5        24 
            //        6/23/2019        E011C        Product C        8        9        6/26/2019        E011C        Product C        8        6        6/29/2019        E011D        Product D       
            //  5        7        7/2/2019        E011D        Product D        5        15        7/4/2019        E011B        Product B        15        19        7/8/2019        E011A        Product A   
            //       10        23        7/20/2019        E011A        Product A        10        10        7/22/2019        E011A        Product A        10        13        7/23/2019       
            // E011B        Product B        15        22        8/1/2019        E011B        Product B        15        12        8/7/2019        E011C        Product C        8        10        8/9/2019       
            // E011B        Product B        15        18        8/15/2019        E011C        Product C        8        13        8/21/2019        E011A        Product A        10   
            //      20        8/22/2019        E011B        Product B        15        17        8/27/2019        E011A        Product A        10        23        6/1/2019        E012B        Product B       
            //       15        19        6/5/2019        E012C        Product C        8        23        6/8/2019        E012B        Product B        15        24        6/16/2019        E012C        Product C    
            //           8        17        6/19/2019        E012A        Product A        10        17        6/25/2019        E012B        Product B        15        7        6/28/2019        E012B        Product B 
            // 15        13        7/13/2019        E012C        Product C        8        7        7/26/2019        E012A        Product A        10      
            //   21        7/28/2019        E012A        Product A        10        14        8/12/2019        E012D        Product D        5        12        8/19/2019        E012A        Product 
            // A        10        7        8/28/2019        E012C        Product C        8        20        6/2/2019        E013B        Product B        15        8        6/4/2019        E013C   
            // Product C        8        20        6/10/2019        E013D        Product D        5        18        6/11/2019        E013B        Product B        15        23        6/20/2019        
            // E013C        Product C        8        15        7/1/2019        E013D        Product D        5        22        7/5/2019        E013C        Product C        8        21    
            //     7/7/2019        E013B        Product B        15        7        7/16/2019        E013B        Product B        15        19        7/17/2019        E013B        Product B        
            // 15        24        7/31/2019        E013B        Product B        15        15        8/10/2019        E013C        Product C        8        15        8/13/2019        E013C        
            // Product C        8        8        8/16/2019        E013A        Product A        10        11        8/24/2019        E013B        Product B        15        23        6/7/2019      
            //   E014C        Product C        8        24        6/13/2019        E014A        Product A        10        22        6/14/2019        E014B        Product B        15        18      
            //   6/22/2019        E014A        Product A        10        19        7/10/2019        E014D        Product D        5        15        7/11/2019        E014D        Product D        5        8 
            //       7/14/2019        E014D        Product D        5        6        7/19/2019        
            //   E014A        Product A        10        9        7/25/2019        E014A        Product A        10        18        7/29/2019        E014C        Product C        8        25        
            //8/3/2019        E014D        Product D        5        11        8/4/2019        E014B        Product B        15        10        8/6/2019        E014A        Product A        10        
            //7        8/18/2019        E014D        Product D        5        12        8/25/2019        E014
            //===============================================            Without "\n"         ==========================================

            // QUESTION 8:
            // Suppose that each splitted line contains following Six  fields:
            //     ItemCode    ItemDescription    UnitPrice        Quantity         Date        SalesPersonI
            // Write code that prints the amount that the buyer has to pay for the item described in the line.

            // QUESTION 9:
            // Write a loop to read each line from the file and print the total of all the items purchased.

            // QUESTION 10:
            // Write code that asks the user for an itemCode and prints the total of the quantity of that item purchased by any of the customer.
        }
}