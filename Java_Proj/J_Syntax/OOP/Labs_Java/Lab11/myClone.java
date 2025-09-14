
// import java.lang.*;
// import java.util.*;
// import java.io.*;

class myClone implements Cloneable {

    String name = "Asad";
    int age = 23;
    float height = 5.9f;

    // ==================== Constructor and copy constructor;
    
    myClone () {
        super();
    }
    
    myClone(String name, int age, float height) {

        super(); // for Object class;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    myClone(myClone other) {
    
        this.name = other.name;
        this.age = other.age;
        this.height = other.height;
    }

    // ==================== Java lang package cloning;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Call the cons of the class Object and instantiates the value.
        //return this.clone(); // Stack overflow error;
    }

    @Override
    public String toString() {
        return "\tName:" + this.name + "\tAge:" + this.age + "\tHeight:" + this.height;
    }

}