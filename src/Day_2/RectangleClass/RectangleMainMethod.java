package Day_2.RectangleClass;

import Day_1.Rectangle;

public class RectangleMainMethod {
    public static void main(String[] args) {
        RectangleClass rectangleClass = new RectangleClass(10,5);
        rectangleClass.setLongsideLength(10);
        rectangleClass.setShortSideLength(5);
        int area = rectangleClass.calculateArea();
        int perimeter = rectangleClass.calculatePerimeter();
        System.out.println("Area of the Rectangle is " + area);
        System.out.println("Perimeter of the Rectangle is " + perimeter);
    }
}
