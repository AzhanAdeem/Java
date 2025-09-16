package Lab10;
// =============== Standalone classes (REVISION)

class Point extends Object {

    float x;
    float y;
    static short numOfPoints;

    Point(float x,float y) {
        super();
        this.x = x;
        this.y = y;

        ++numOfPoints;
    }

    Point add(Point obj) {
        this.x += obj.x;
        this.y += obj.y;
        
        return this;
    }

}