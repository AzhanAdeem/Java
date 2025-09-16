
// Int3 class that inherits class int2; Hence half of the code is not needed.

public class Int3 extends Int2 {

    // Attributes
    int j;

    // Constrctors

    // Int3() {
    //     super();
    // }

    Int3(int j) {
        super();
        this.j = j;
    }

    // ====== Copy Cons

    // Int3(Int3 obj){
    //     this.copy(obj);
    // }
    
    //Note: All cons failed after extending Int2. Untill i defined a non parameterised cons.

    // void copy(Int3 obj) {
    //     this.j = obj.j;
    // }

    //======= toString() method to print the obj
    @Override
    public String toString() {
        return "Int.j ="+this.j;
    }
 
    // ========== Clone method ( Shallow )

    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }
    
    // @Override 
    // public Object clone() throws CloneNotSupportedException {
    //     Int3 intClone = (Int3) super.clone();
    //     intClone.j = this.j;
    //     return intClone;
    // }


}