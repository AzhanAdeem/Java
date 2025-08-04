
public class Shop {

  String brand = "Brand name", color = "red";
  int price = 23, size = 45, numOfProducts = 0;


  // if the constructor is not present all objects are same;

  Shop(String a, int b, int c, int numOfProducts, String color) {

    this.brand = a;
    this.price = b;
    this.size = c;
    this.color = color;
    this.numOfProducts += 1;

    System.out.printf("\nThe size is: %d \nThe brand is: %s \nThe price is: %d \nThe colour is: %s", c, a, b, color);
  }

  void printRecipt() {
    System.out.printf("The number of products bought: %d. \nThe color is :%d\n", numOfProducts, color);
    System.out.printf("\tThank You for shopping here. ༼ つ ◕_◕ ༽つ");
  }

  public int shoes(short g) {
    this.size = g;  

    System.out.println(g);
    return g;

  }
}