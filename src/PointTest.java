public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(2.23232f, 5.24742f);
        System.out.println(point.toString());
        point.setY(1.454634f);
        point.setX(2.34353f);
        System.out.println(point.toString());
        point.setXY(1.3243f,2.535f);
        System.out.println(point.toString() + "\n");

        Point point1 = new Point();
        System.out.println(point1.toString());
        point.setY(1.454634f);
        point.setX(2.34353f);
        System.out.println(point.toString());
        point.setXY(1.43f,4.535f);
        System.out.println(point.toString());
    }
}
