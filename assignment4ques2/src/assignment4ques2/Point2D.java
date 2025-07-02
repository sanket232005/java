package assignment4ques2;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isEqual(Point2D anotherPoint) {
        return this.x == anotherPoint.x && this.y == anotherPoint.y;
    }

    public double calculateDistance(Point2D anotherPoint) {
        double dx = this.x - anotherPoint.x;
        double dy = this.y - anotherPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

  
    public String toString() {
        return getDetails();
    }
}