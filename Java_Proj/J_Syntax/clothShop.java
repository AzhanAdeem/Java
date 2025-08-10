
public class clothShop {

  String brand = "Brand name", color = "red";
  int price = 23, size = 45, numOfProducts = 0;
  static int numOfInstences; 
 // Ststic is a keyword utility (useful) method and shared resources(var for all obj; same)

  // if the constructor is not present all objects are same;
  clothShop(String a, int b, int c) {
    
    this.brand = a;
    this.price = b;
    this.size = c;
    numOfInstences++;

    System.out.printf("\nThe brand is: %s \nThe price is: %d \nThe size is: %d", a,b,c);
  }

  // ==========================            Constructor overloading

  clothShop(String a, int b, int c, int numOfProducts, String color) {

    this.brand = a;
    this.price = b;
    this.size = c;
    this.color = color;
    this.numOfProducts += 1;
    numOfInstences++;

    System.out.printf("\nThe size is: %d \nThe brand is: %s \nThe price is: %d \nThe colour is: %s", c, a, b, color);

  }

  void printRecipt( ) {

    System.out.printf("The number of products bought: %d. \nThe color is :%d\n", this.numOfProducts, this.color);
    System.out.printf("\tThank You for shopping here.");

  }

  public int shoes(short g) {
    this.size = g;
    System.out.println(g);

    return g;
  }
    // ============================= Printing objects

  @Override  //immitate
  public String toString() {

    return this.brand+"\t"+this.color+"\t"+this.price ;
  }
  
  // @Override
  // public String toString(){
  
  //   return getClass().getName() +"@"+ Integer.toHexString(hashCode()); 
  // }

  

}