public class Point {

    private int x;
    private int y;

    // If you add void it will become a regular constructor;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public String getXY() {
        return this.x + " " + this.y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String add(Point Point) {

        this.setXY(this.getX() + Point.x, this.getY() + Point.y);

        return getX() +"\t"+ getY();
    }

}