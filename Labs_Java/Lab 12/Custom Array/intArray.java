
// ====================================    Dynamic Array  ==========================================

// This is the code of self made dynamic array;
// Can't let user set the name of the var he will set the name of the obj;

// To make it dynamic put a if else condition in the add method;
// if the limit has been reached we call the increase length method;

public class intArray {
    
    private int length;
    int[] array;
    int eleSetInd = 0;

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
        
        while ( eleSetInd <= (array.length-1)) { 

            array[eleSetInd] = x;

            if (array.length == 1) {                                  
                array[(array.length - 1)] = x;
            }

            eleSetInd++;
        }
    }
}
