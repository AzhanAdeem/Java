package OOP;

//import java.util.Scanner;

public class JavaOpp {
  public static void main(String[] args) {

    int numOfProducts = 0;
    String color = null;

    clothShop shopObj1 = new clothShop("One", 7, 3, numOfProducts, color);
    clothShop shopObj2 = new clothShop("Safari", 45, 23, numOfProducts, color);

    // Constructor does not exist. Still works.
    // Only one class can be public, and it can't be abstract.

    // ============================ Obj 1 attributes;
    shopObj1.brand = "Zara";

    System.out.println(shopObj1); // output obj address: Shop@372f7a8d
    System.out.println(shopObj1.brand);
    System.out.println(shopObj1.price);
    System.out.println(shopObj1.size);
    System.out.println(shopObj1.color + "\n");

    shopObj1.printRecipt();

    // ============================= obj 2 attributes;

    System.out.println(shopObj2);
    System.out.println(shopObj2.brand);
    System.out.println(shopObj2.price);
    System.out.println(shopObj2.size);
    System.out.println(shopObj2.color);
    System.out.println(shopObj2.brand = "Addidas" + "\n");

    // =============================== Method Overloading (method signature)

    int a, b, c;
    a = b = c = 23;
    fun1(a, b);
    fun1(a, b, c);

    // ========================== Printing Objects toString Method;

    System.out.println(shopObj1);

    // =============== Array of Obj ==========
    // ============ usefull to do a single operation on object of the same class;

    clothShop[] cloths = {

        new clothShop("Adida", 25000, 34),
        new clothShop("Zara", 25000, 34),
        new clothShop("Saya", 25000, 34) 
      };

    for (clothShop cloth : cloths) {

      System.out.printf("\nBrand: %s \t Price:%d \t Size: %d\n", cloth.brand, cloth.price, cloth.size);

    }
 
  // ============================= End Of Main
  
  }
  

  // ========================= Method overloading
  // ========================= Methods signature (method name and
  // parameters{order, number, sequence})

  static void fun1(int num, int sun) {
    System.out.printf("This can be called in a static method %d ", num);
  }

  static void fun1(int num, int sun, int c) {
    System.out.printf("This can be called in a static method %d", c);
  }

}