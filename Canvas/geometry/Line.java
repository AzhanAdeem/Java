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

    public void setXY(int x, int y){

        if (int){  
            //===========  AutoBoxing
            Double tempAutoBoxX = Double.valueOf(x);
            Double tempAutoBoxY = Double.valueOf(y);

            //======== UnBoxing;
            this.x = tempAutoBoxX;
            this.y = tempAutoBoxY;
        }
    }

}
