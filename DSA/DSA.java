
import java.util.ArrayList;

public class DSA {
  public static void main(String[] args){

    // ======   Arrays Vs Array list

    int[] num = new int[] {1,2,3,4,5};
    System.out.println(num+": Address of num array"); // Address?
    System.out.printf("array \"num\" ele at 1:%d \n",num[1]);

    // ======   ArrayList Dynamic
    ArrayList<String> names = new ArrayList<>() {};

    names.add("name1");
    System.out.println(names);// list printed?

    names.add(0, "name5");
    System.out.printf("%s \n",names );

    names.remove(0); // delete
    System.out.printf("%s \n",names );
 
    names.get(3); //get element
    System.out.printf("%s \n",names );

    names.set(0, "name1"); // Middle
    System.out.printf("%s \n",names );

  }
}