
import java.lang.Cloneable;

//package Lab11;

public class Int2 extends Object implements Cloneable {
    
    // === Construc
    int i;
    Int2 (int i) {
        super();
        this.i = i;
    }

    // === other functions Private func
    void increment() {
        this.i++;
    }

    // === to String func
    @Override
    public String toString ( ) {
        return "int i = "+ this.i;
    } 
    
    // === cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
