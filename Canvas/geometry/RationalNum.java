
//import java.util.Scanner;

public class RationalNum {

    float numerator;
    float denominator;

    //Scanner scanObj = new Scanner(System.in);
    //numerator = scanObj.nextFloat();
    //denominator = scanObj.nextFloat(); 
    
    public RationalNum(float numerator, float denominator) {

        this.numerator = numerator;
        this.denominator = denominator;
        float reti = numerator/denominator ;

        String toString =  Double.toString(reti);  //.valueOf();

        for (int x = 1; x <= toString.length(); ++x) {
            toString.charAt(x);
        }
    }
}