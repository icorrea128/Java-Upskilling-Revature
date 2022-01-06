package Day_3.Polygon;

public class PolygonMainMethod {
    public static void main(String[] args) {
        Polygon rectangle = new Rectangle(5,2);
        double recArea = rectangle.getArea();
        Polygon triangle = new Triangle(5,2);
        double triArea = triangle.getArea();

        System.out.println("Area of the Rectangle is " + recArea);
        System.out.println("Area of the Triangle is " + triArea);
    }
}
