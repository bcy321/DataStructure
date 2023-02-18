package ch08;

public class PointRunTest {
    public static void main(String[] args) {
        Point<Integer,Double> p1 = new Point<>(0,0.00);
        Point<Integer,Double> p2 = new Point<>(10,10.00);

        double rect = Point.makeRectangle(p1,p2);
        System.out.println(rect);

    }
}
