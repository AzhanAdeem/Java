
import java.lang.*;
import java.util.*;
import java.io.*;

class myClone implements Cloneable {

    String name = "Asad";
    int age = 23;
    float height = 5.9f;

    // ==================== Constructor and copy constructor;

    myClone() {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    void myClone(myClone other) {

        this.name = other.name;
        this.age = other.age;
        this.height = other.height;
    }

    // ==================== Java lang package cloning;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Call the cons of the class obj and instantiates the value.
    }

    @Override
    public String toString() {
        return "\tName:" + this.name + "\tAge:" + this.age + "\tHeight:" + this.height;
    }

}

// ================= Driver Class;

public class CloningEx {
    public static void main(String[] args) {

        try {
            myClone myObj1 = new myClone();

            myClone myObj2 = (myClone) myObj1.clone(); // Type casted as java will create the object of class Object;

            // ============= To Print the attributes of the obh
            System.out.println(myObj1.toString());
            System.out.println(myObj2.toString());
            
            // =============== To print the address of the classes
            System.out.println(myObj1.getClass().getName()+"@"+myObj1.hashCode()); 
            System.out.println(myObj2.hashCode());

        } catch (CloneNotSupportedException e) {

            System.out.println("Could not clone because of CloneNotSupportedException");
            e.printStackTrace();
        }

    }
}