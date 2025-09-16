package Lab10;
class CanvasVector extends Object implements Cloneable {

    float x, y;

    CanvasVector(float x, float y) {
        super();
        this.x = x;
        this.y = y;
    }

    // =============== vec mag = sum of sq of all components;

    double magOfVac() {
        double mag = Math.sqrt(((this.x) * (this.x)) + ((this.y) * (this.y)));
        return mag;
    }

    // ====    ====    ==== Dot Product of vector

    void botProVect(CanvasVector objVec) {
        float[][] matFrCross = new float[3][2];

        // This Mat has 3 list elements and each subList has 2 elements;
        // Or 3 rows and 2 cloumns

        char i = 'i';
        char j = 'j';

        matFrCross[0][0] = (char) i; 
        matFrCross[0][1] = (char) j;
        matFrCross[1][0] = this.x;
        matFrCross[1][1] = this.y;
        matFrCross[2][0] = objVec.x;
        matFrCross[2][1] = objVec.y;

    }

    void printMat(float[][] matFrCross) { 
            for (int x = 0; x <= matFrCross.length; x++) { // x = 0 1 2
                for (int y = 0; y <= matFrCross[x].length; y++) { // y = 0 1
                    System.out.println(matFrCross[x][y]);
                }
            }
        }

}
