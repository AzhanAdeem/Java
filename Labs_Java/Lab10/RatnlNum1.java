package Lab10;
// what are the additional functions rational number;
// run in main;

import java.lang.Cloneable;

class RatnlNum1 extends Object implements Cloneable {

    float x;
    float y;

    RatnlNum1(float x, float y) {
        super();
        this.x = x;
        this.y = y;
    }

    // ============ Copy Cons

    RatnlNum1 (RatnlNum1 obj) {
        super();
        this.x = obj.x;
        this.y = obj.y;
    }

    // ============== Obj  Cloning 
    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //     RatnlNum1 obj = (RatnlNum1) super.clone();
    //     this.obj.x = x;
    //     this.obj.y = y;

    //     return super.clone();
    // }

    // =============== Addition 
    void addRatNum( RatnlNum1 obj2) {

        float hcfAns = hcf(this.y, obj2.y);
       
        // Make the Numerator and Deno equal
        this.x  *= hcfAns;
        this.y *= hcfAns;

        // Save old value:
        float replaceMentNumX = obj2.x ;
        float replaceMentNumY = obj2.y;

        replaceMentNumX *= hcfAns;
        replaceMentNumY *= hcfAns;

        //Add the fractions
        this.x += replaceMentNumX;
        this.y += replaceMentNumY;

    }

    // ================ for HCF/GCD
    // A biggest number that divides both the arguments;

    float hcf(float num1, float num2) {

        int x;
        float[] numThtDiv;
        if (num1 > num2) {
            numThtDiv = new float[(int)num1];
            for (x = 0; x <= num1; ++x) {
                int j = 0;
                if (num1 % x == 0.0 & num2 % x == 0.0) {
                    numThtDiv[j] = x;
                    j++;
                } 
            }
        } else {
            numThtDiv = new float[(int)num2];
            for (x = 0; x <= num2; ++x) {
                int j = 0;
                if (num1 % x == 0.0 & num2 % x == 0.0) {
                    numThtDiv[j] = x;
                    j++;
                } 
            }
        }

        float ans = numThtDiv.length;

        return ans;
    }
}