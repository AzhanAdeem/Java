//import java.util.Scanner;

public class JavaOpp{
  public static void main(String[] args) {

    Shop shopObj1 = new Shop("One", 7, 3); 
    Shop shopObj2 = new Shop("Safari", 45, 23);
    
    // Constructor does not exist. Still works. 
    // Only one class can be public, and it can't be abstract.

    // ============================    Obj 1 attributes;
    shopObj1.brand = "Zara";
  
    System.out.println(shopObj1);    // output obj address: Shop@372f7a8d
    System.out.println(shopObj1.brand);
    System.out.println(shopObj1.price);
    System.out.println(shopObj1.size);
    System.out.println(shopObj1.color);

    shopObj1.printRecipt();

    // =============================  obj 2 attributes;
    System.out.println(shopObj2.brand);
    System.out.println(shopObj2.price);
    System.out.println(shopObj2.size);
    System.out.println(shopObj2.color);
    System.out.println(shopObj2.brand = "Addidas");

    
   int a, b , c; 
    a =  b = c = 23;
    fun1(a,b);

  }
  // ===================================   method overloading 
  // ========================= Methos signature  (method name and parameters{order, number, sequence })
  
  static void fun1(int num, int sun){
    System.out.printf("This can be called in a static method");

  }

  static void fun1(int num, int sun, int c){
    System.out.printf("This can be called in a static method");

  }
}
