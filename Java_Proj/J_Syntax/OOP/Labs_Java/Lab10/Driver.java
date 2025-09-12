package Lab10;
public class Driver {
    public static void main(String[] args) {

        // =========== obj instantiation for Point

        Point p1 = new Point(23.87f, 45.0f);
        System.out.println(p1);

        // ============ for Rational Num
        float x = 23.45f;
        float y = 12.45f;

        RatnlNum1 ratObj1 = new RatnlNum1(x, y);
        RatnlNum1 ratObj2 = new RatnlNum1(23.56f, 34.56f);

        System.out.println( ratObj1.hcf(ratObj1.y, ratObj2.y));

        ratObj1.addRatNum(ratObj2);
        System.out.println("Devident/Numerator:"+ratObj1.x+"\t"+"Divisor/Denominator:"+ratObj1.y );

    }
}
