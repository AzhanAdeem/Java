
import java.lang.Cloneable;

//package Lab11;

public class Int2 extends Object implements Cloneable {
    
    // === Construc
    int i;
    Int2(){}

    Int2 (int i) {
        super();
        this.i = i;
    }

    // === other functions / Utility func
    void increment() {
        this.i++;
    }

    // === to String func
    @Override
    public String toString ( ) {
        return "int i = "+ this.i;
    } 
    
    //=== cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     Int2 clonedInt2 = (Int2) super.clone();
    //     //clonedInt2.i = (Int2) this.i.clone(); // Primitive Nope can't
    //     clonedInt2.i = this.i;   // Valid but clone does it by self;
    //     return clonedInt2;
    // }


}