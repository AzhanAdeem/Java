
// ==============================================    JAVA CHEETSHEET FOR JAVA OOP

//import java.util.Scanner;
//impoer java.util.ArrayList;

import java.util.ArrayList;

public class JavaOpp {
  public static void main(String[] args) {

    Shop shopObj1 = new Shop("One", 7, 3);
    Shop shopObj2 = new Shop("Safari", 45, 23);

    // Constructor does not exist. Still works.
    // Only one class can be public, and it can't be abstract.

    // // ============================ Obj 1 attributes;
    // // ============================ Don't work any more, as I have made them
    // private.

    // shopObj1.brand = "Zara";

    // System.out.println(shopObj1); // output obj address: Shop@372f7a8d
    // System.out.println(shopObj1.brand);
    // System.out.println(shopObj1.price);
    // System.out.println(shopObj1.size);
    // System.out.println(shopObj1.color);

    // shopObj1.printRecipt();

    // // ============================= obj 2 attributes;

    // System.out.println(shopObj2.brand);
    // System.out.println(shopObj2.price);
    // System.out.println(shopObj2.size);
    // System.out.println(shopObj2.color);
    // System.out.println(shopObj2.brand = "Addidas");

    // ================================= Using getter and setters
    // ========================= Setters

    shopObj2.setBrand("Puma");
    shopObj2.setPrice(99);
    shopObj2.setSize(45);
    shopObj2.setColor("Blue");

    // ================================ Getters

    System.out.println(shopObj2.getBrand());
    System.out.println(shopObj2.getPrice());
    System.out.println(shopObj2.getSize());
    System.out.println(shopObj2.getColor());

    System.out.println(shopObj2);

    shopObj2.printRecipt();

    // ================================== Copy constructor (Go to cloth shop to see
    // how the copy cons works)

    Shop shopObj3 = new Shop(shopObj1);

    System.out.print(shopObj3);

    // ================================= Multi Var declaration

    int a, b, c;
    a = b = c = 23;
    fun1(a, b);


    // ================================  Array Of obj
    
    // Shop[] shopArray1 = new Shop[5];
    // shopArray1[0] = new Shop("Nike", 2300, 45);
    // shopArray1[1] = new Shop("Eminent", 1500, 45);
    // shopArray1[2] = new Shop("J.", 2000, 45);
    // shopArray1[3] = new Shop("Outfitters", 3000, 45);
    // shopArray1[4] = new Shop("One", 2000, 45);

    //Use for or while loop to print all the Obj using toString();
    // ====================== OR
    // =============== Using Array List appending objs

    // ArrayList<Shop> shopArray = new ArrayList<Shop>();

    // shopArray.add(new Shop("Nike", 1900, 45));
    // shopArray.add(new Shop("Eminent", 2000, 45));
    // shopArray.add(new Shop("Outfitters", 1099, 45));
    // shopArray.add(new Shop("J.", 2000, 45));

    // ================================ ::: End Of Main :::
  }

  // ================================ : Method overloading :
  // ========================= Methos signature (method name and parameters{order, number, sequence })
  // ================  Static methods are reserved for a class and loaded before the main method;

  //=================  Func over-loading
  static void fun1(int num, int sun) {
    System.out.printf("This can be called in a static method. %a %d %c");
  }

  static void fun1(int num, int sun, int c) {
    System.out.printf("This can be called in a static method. %a %b %c");
  }
}
