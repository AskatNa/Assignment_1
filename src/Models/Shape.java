package Models;
import java.util.ArrayList;
public class Shape {

    private ArrayList<Point> array;
    public Shape(){
        array = new ArrayList<Point>();
    }
    public void addPoint(Point point){
        array.add(point);
    }

    public double calculatePerimeter(){
        double Perimeter = 0;

        for(int i = 0; i < 9; i++) Perimeter += array.get(i).distanceTo(array.get(i + 1));
        Perimeter += array.get(0).distanceTo(array.get(9));
        return Perimeter;
    }
    public double getAverageSide(){
        return calculatePerimeter() / 10;
    }
    public double getLongestSide(){
        double maxLength = 0;
        double current;
        for(int i = 0; i < 9; i++){
            current = array.get(i).distanceTo(array.get(i+1));
            maxLength = Math.max(maxLength, current);
        }
        return maxLength;
    }
}
