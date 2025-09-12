
import java.lang.Cloneable;

//package Lab11;

public class Int2 extends Object implements Cloneable {
    
    int i;
    Int2 (int i) {
        super();
        this.i = i;
    }

    void increment() {
        this.i++;
    }

    @Override
    public String toString ( ) {
        return "int i = "+ this.i;
    } 

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
