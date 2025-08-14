public class Point {

    private int x;
    private int y;

    public void Point(int x, int y) {

        this.x = x;
        this.y = y;

    }

    public void set (int x, int y) {

        this.x = x;
        this.y = y;

    }

    public int getXY () {
        return x + y;
    }
}