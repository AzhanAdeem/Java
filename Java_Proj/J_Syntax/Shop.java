
public class Shop {

  String brand = "Brand name";
  int price = 23, size = 45;
  String color = "red";

  // if the constructor is not present all objects are same;

  Shop(String a, int b, int c) {

    this.brand = a;
    this.price = b;
    this.size = c;
    this.color = "red";

    System.out.printf("\nThe size is: %d \nThe brand is: %s \nThe price is: %d\n", c, a, b);

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