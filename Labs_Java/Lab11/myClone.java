
    import java.lang.Cloneable;
    import java.lang.CloneNotSupportedException;
// import java.util.*;
// import java.io.*;

class myClone extends Object implements Cloneable {

    String name = "Asad";
    int age = 23;
    float height = 5.9f;

    // ==================== Constructor's (Non-Parameterised, parameterised and copy constructor);
    
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

    // ==================== Java lang package cloning; (protected access by default)

    // ===== Shallow Cloning;
    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     return super.clone(); // Call the cons of the class Object and instantiates the value.
    //     //return this.clone(); // Stack overflow error;
    // }

    // ===== Deep Cloning; no still shallow because of String immutable
    @Override 
    public Object clone() throws CloneNotSupportedException {
        //super.clone();
        myClone cloned = (myClone) super.clone();
        cloned.name = this.name;

        //cloned.name = (String) this.name.clone();
        //The String doesn't have a clone() method (and does not implement Cloneable). 
        //Strings are immutable, so you can just assign the reference:

        return cloned;
    }

    @Override
    public String toString() {
        return "\tName:" + this.name + "\tAge:" + this.age + "\tHeight:" + this.height;
    }

}