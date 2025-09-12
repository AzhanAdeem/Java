
import java.util.ArrayList;

public class Shop {

  String brand = "Brand name",   color = "red";
  int    price =  23,            size  =  45  ,     numOfProducts = 0;
  
  static int numOfShops = -1;
  // ========================= Static is a keyword utility (useful) method and shared resources(var for all obj; same)
  
  // if the constructor is not present all otherects are same;''

  protected Shop(String a, int b, int c) {

    this.brand = a;
    this.price = b;
    this.size = c;
    this.color = "red";

    numOfShops++;
    System.out.printf("\nThe brand is: %s \tThe price is: %d \tThe size is: %d", a,b,c);


  }

// ==========================    Constructor overloading

  Shop(String a, int b, int c, int numOfProducts, String color) {

    this.brand = a;
    this.price = b;
    this.size = c;
    this.color = color;
    this.numOfProducts += 1;
    
    numOfShops++;

    System.out.printf("\nThe size is: %d \nThe brand is: %s \nThe price is: %d \nThe colour is: %s", c, a, b, color);

  }

  // ==============================     Copy constructors

  Shop (Shop other) {
    this.copy(other);
  }

  public void copy(Shop other) {

    // ======== If values are not private 

    //   this.brand = other.brand;
    //   this.color = other.color;
    //   this.price = other.price;
    //   this.size = other.size;
  
    // ======== If attributes are private

    this.setBrand(other.brand);
    this.setColor(other.color);
    this.setPrice(other.price);
    this.setSize(other.size);
    
    numOfShops++;
  }

  //============================= Printing objects through
  //=============================  Method Overriding;

  @Override  //@ annotation; Provide meta data to a compiler to alter how it is treated?
  public String toString() {
    return "\t" + this.color + "\t" + this.size + "\t" + this.price + "\t" + this.brand;
  }

  // Provides a sys to checkes and balace. What if you miss-spell it.


  //// ============================= What originally gets printed.
  // @Override
  // public String toString(){
  //   return getClass().getName() +"@"+ Integer.toHexString(hashCode());  // java.lang.Shop@123xyZ;
  // }

  // ============================ Setters

  void setBrand(String brand) {
    this.brand = brand;
  }

  void setPrice(int price) {
    this.price = price;
  }

  void setSize(int size) {
    this.size = size;
  }

  void setColor(String color) {
    this.color = color;
  }

  // ============================ Getters

  String getBrand( ) {
    return this.brand;
  }

  String getColor( ) {
    return this.color;
  }

  int getPrice( ) {
    return this.price;
  }

  int getSize( ) {
    return this.size;
  }

  // ============================ Other methods

  int printNumOfShops() {
    System.out.printf("The number of shops is: %d \n", numOfShops  );
    return numOfShops;
  }
  
  void printRecipt() {
    System.out.printf("The number of products bought: . \nThe color is :%d\n", color);
  }

  public int shoes(short g) {
    this.size = g;

    System.out.println(g);
    return g;
  }

}