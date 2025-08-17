package OOP.Inheritance;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main ( ) {  

        //Scanner scanObj = new Scanner();


        library myLib = new library( 300, 23);
        Shelf shelf1 = new Shelf(34500, 2344 ,45);

        shelf1.setGenre("Comic");
        shelf1.getgenre();
    }

    String numOfBooksPrint(Shelf shelf) {
        System.out.printf("This total numof Books :%d", shelf.totalBooks);
        return " " + shelf.totalBooks;
    }

}