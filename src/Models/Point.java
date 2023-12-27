package Models;
public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point point){
        double X = point.x - this.x;
        double Y = point.y - this.y;
        double Distance = Math.pow(X,2) + Math.pow(Y,2);
        return Math.sqrt(Distance);
    }
    @Override
    public String toString(){
        return "Points:" +
                "x =" + x +
                ", y =" + y;
    }
}