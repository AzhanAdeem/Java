
public class PrimitiveArray {
    public static void main() {

        double[][] subInd = new double[10][2];
        double[][] vector = {{34.5},{45.6},{34.6}};

        try {
            int i = 1;

        subInd[i][i] = vector[i].get(i); // This will give you an array [];
        System.out.printf("Dimention = %d", subInd.length + 1);

        if (subInd.length == 1) {
        System.out.print("2 Dimaentional");
        } else if (subInd.length == 2) {
        System.out.print("3 Dimaentional");
        } else {
        System.out.println("Index out of bound error.");
        }

        System.out.println("Dimention = %d" + subInd.length + 1);

        } catch (Exception e) {

        throw new IndexOutOfBoundsException();
        // System.out.println("Re-run the code and use a smaller index.");

        }
    }
}