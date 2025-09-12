import java.lang.Cloneable;

public class Int3 {

    // Attributes
    int j;

    // Constrctors

    Int3() {
        super();
    }

    Int3(int j) {
        super();
        this.j = j;
    }

    // ====== Copy Cons

    Int3(Int3 obj){
        this.copy(obj);
    }
    
    void copy(Int3 obj) {
        this.j = obj.j;
    }

    //======= toString() method to print the obj
    @Override
    public String toString() {
        return "Int.j ="+this.j;
    }
 
    // ========== Clone method ( Shallow )
    @Override
    public Object clone () throws CloneNotSupportedException{
        return super.clone();

    }
}
