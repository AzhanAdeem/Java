package OOP.Inheritance;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main ( ) {  

        //Scanner scanObj = new Scanner();

        library myLib = new library( 34500, 2344); //shelf cons will assign the values of library
        Shelf shelf1 = new Shelf(300, 2344 ,"Comedy");

        System.out.printf("The total number of Books available are: %d \n", myLib.totalBooks);

        shelf1.setGenre("Comic");
        shelf1.getGenre();
        System.out.printf("The total num of books are: %d",shelf1.getTotalBooks());
    }

}