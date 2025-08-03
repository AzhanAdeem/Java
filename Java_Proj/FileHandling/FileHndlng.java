import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class FileHndlng {
  public static void main(String[] args) {
    // ========================================== File Handling  =======================================================

    File fileObj = new File("File1.txt");
    String line = ""; // NO error ╰(*°▽°*)╯;
    System.out.println(line);

    try {

      if (fileObj.createNewFile()) {
        System.out.println("File created");
        System.out.println(fileObj.getAbsolutePath());
        System.out.println(fileObj.getParent());

        if (fileObj.exists()) {
          System.out.println("File Exists. But where is it?????");
          System.out.println("File is located at:" + fileObj.getAbsolutePath());
        }

        FileWriter fileWriterObj = new FileWriter(fileObj);
        fileWriterObj.write("The first line of the file.");
        fileWriterObj.close();

      } else {
        System.out.println("An error occured. Can't create a file.");
      }

    } catch (IOException e) {
      System.out.println("There was an error.");
      e.printStackTrace();
    }

    if (fileObj.canRead()) {
      System.out.println("File can be Read.(●'◡'●)");
    }

    // ========================================= File Writing  ================================================

    try {
      if (fileObj.exists()) {
        FileWriter fileWriterObj = new FileWriter(fileObj);
        fileWriterObj.write(
            "The first line of the file. Have to write a few more lines to fill this file. Backslash: \" \\ n \"  to help me to shift to a new line."
                + "\n And we have shifted");

        fileWriterObj.close();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    // ================================================= Reading a File =================================================

    String[] splitedLine = new String[9];

    try {
      Scanner fileReaderObj = new Scanner(fileObj);

      if (fileObj.canRead()) {
        System.out.println("File can be read:");
        System.out.println("File Name:" + fileObj.getName());
        System.out.println("File Child Folders:" + fileObj.list()); // List of all the files in the folder.
        System.out.println("File Size (.length())" + fileObj.length() + " Bytes"); // prints the total amount of bits
                                                                                   // size of the file

        while (fileReaderObj.hasNextLine()) {
          String lines = fileReaderObj.nextLine();
          System.out.println(lines);
          splitedLine = lines.split("\\s+");
          System.out.println(splitedLine); // gives Obj reference not the string can't print arrays directly;
          System.out.print(Arrays.toString(splitedLine));

        }
        fileReaderObj.close();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}