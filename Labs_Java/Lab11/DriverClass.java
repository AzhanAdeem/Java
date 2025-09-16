
import java.util.*;

public class DriverClass {

    public static void main(String[] args) {

        // ======= For Understanding how cloning works.

        // myClone myObj1 = new myClone();

        // try {
        //     // myClone myObj1 = new myClone();

        //     myClone myObj2 = (myClone) myObj1.clone(); // Type casted as java will create the object of class: Object;

        //     // ============= To print the objects
        //     System.out.println(myObj2);

        //     // ============= To Print the attributes of the objects
        //     System.out.println(myObj1.toString());
        //     System.out.println(myObj2.toString());

        //     // =============== To print the address of the classes
        //     System.out.println(myObj1.getClass().getName() + "@" + myObj1.hashCode());
        //     System.out.println(myObj2.hashCode());

        // } catch (CloneNotSupportedException e) {

        //     System.out.println("Could not clone because of CloneNotSupportedException");
        //     e.printStackTrace();
        // }

        // try {

        //     Int3 intNum = new Int3(5);
        //     Int3 intNumCopy = (Int3) intNum.clone();

        //     // Attribute chnged.
        //     intNumCopy.j = 3;

        //     System.out.println(intNum);
        //     System.out.println(intNumCopy);

        //     System.out.println(intNum.hashCode());
        //     System.out.println(intNumCopy.hashCode());

        // } catch (CloneNotSupportedException e) {
        //     e.printStackTrace();
        // }

        // ============================== Book's Code Exercise

        try {

            ArrayList<Int2> v = new ArrayList<Int2>();
            // ArrayList<> v = new ArrayList<>();

            Int2 x = new Int2(0);
            Int2 x2 = (Int2) x.clone();
            x2.increment();

            System.out.println("x =" + x + "x2 =" + x2);

            Int3 x3 = new Int3(7);
            x3 = (Int3) x3.clone();
            for (int i = 1; i < 10; i++) {
                v.add(new Int2(i));
            }

            System.out.println("v =" + v);

            ArrayList<Int2> v2 = (ArrayList<Int2>) v.clone();

            for (int j = 0; j < v.size(); j++) {
                v2.set(j, (Int2) (v2.get(j)).clone());
            }

            // Incrementing v2's elements using private method increment and defined method
            // itterator;
            for (Iterator<Int2> e = v2.iterator(); e.hasNext();)
                ((Int2) e.next()).increment();

            // error: class, interface, enum, or record expected
            // for(Int2 arrVal: v2) {
            //     arrVal.increment();
            // }

            System.out.println("v =" + v+"\t");
            System.out.println(" ");
            System.out.println("v2 =" + v2+"\t");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }

    }
}
