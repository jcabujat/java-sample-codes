public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point p1) {
        double a = Math.pow((p1.getX() - this.x),2);
        double b = Math.pow((p1.getY() - this.y),2);
        double distanceLength = Math.sqrt(a + b);
        return distanceLength;
    }

    public double distance () {
        Point p2 = new Point();
        p2.setX(0);
        p2.setY(0);
        double distanceLength = distance(p2);
        return distanceLength;
    }

    public double distance (int x, int y) {
        Point p2 = new Point();
        p2.setX(x);
        p2.setY(y);
        double distanceLength = distance(p2);
        return distanceLength;
    }

}
