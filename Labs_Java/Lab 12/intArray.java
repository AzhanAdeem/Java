
// ====================================    Dynamic Array  ==========================================
// This is the code of self made dynamic array;
//Can't let user set the name of the var ha will aet the name of the obj;


public class intArray {
    
    private int length;
    int[] array;
    int eleSetVar = 0;

    intArray(){}

    intArray(int length) {

        this.setLength(length);
        array = new int[this.length];
    }

    void setLength(int length) {
        this.length = length;
    }

    void setElement(int x){ 

        // while loop as while does not need the int to be initializedin it.
        // length starts from 1; index from = 0;
        
        while ( eleSetVar <= (array.length-1)) { 

            array[eleSetVar] = x;

            if (array.length == 1) {                                  
                array[(array.length - 1)] = x;
            }

            eleSetVar++;
        }
    }
}
