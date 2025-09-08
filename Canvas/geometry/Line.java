//import java.util.Point;

public class Line {

    private double x;
    private double y;

    static int numOfLines = 0;

    public Line() {
    }

    public Line(double x, double y) {
        this.setXY(x, y);
    }

    public Line(Point other) {
        this.copy(other);
    }

    void copy(Point other) {
        this.setXY(other.getX(), other.getY());
    }

    public void setXY(double x, double y){

        //setXY will cause a error when class point uses it;
        this.x = x;
        this.y = y;

        // //=============================== Checking primitive Data Types
        // //Create a new class and check it using selection statements but have to use try catch as o will generate error.
        // //Smart but lenthy;

        // void printType(Point xy){ 


        //     if (int obj){ // only true when type matches 
        //         System.out.println("int");
        //          Double tempX = obj;
        //          Double tempY = obj;     // Change this;
        //     } else if (double x){
        //         System.out.println("int");
        //}

        // }
        
        // // ==========================  Converting DataTypes

        //if ( x instanceof Number && y instanceof Number){  // only for wrapper classes
        // Integer x2 = Double.valueof(x); // Integer.valueOf(x);
        // Integer y2 = Integer.valueof(y);        

        // if ( x2.getClass().getName() == "java.lang.int" && y2.getClass().getName() == "java.lang.int"){  //Only for wrapper class
            
        //     //===========  AutoBoxing
        //     Double tempAutoBoxX = Double.valueOf(x);
        //     Double tempAutoBoxY = Double.valueOf(y);

        //     //======== UnBoxing;
        //     this.setXY(tempAutoBoxX, tempAutoBoxY);// = tempAutoBoxX;
        //     this.y = tempAutoBoxY;

        // }
    }

}
