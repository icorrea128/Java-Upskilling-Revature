package Day_2.RectangleClass;

import Day_1.Rectangle;

public class RectangleClass {
    private int shortSideLength;
    private int longsideLength;
    private static int sumofDegrees;

    public RectangleClass(int shortSideLength, int longsideLength) {
        this.shortSideLength = shortSideLength;
        this.longsideLength = longsideLength;
    }

    public int getShortSideLength() {
        return shortSideLength;
    }

    public void setShortSideLength(int shortSideLength) {
        this.shortSideLength = shortSideLength;
    }

    public int getLongsideLength() {
        return longsideLength;
    }

    public void setLongsideLength(int longsideLength) {
        this.longsideLength = longsideLength;
    }

    public int calculateArea() {
        int area = shortSideLength *longsideLength;
        return area;
    }

    public int calculatePerimeter() {
        int perimeter = (shortSideLength*2) + (longsideLength*2);
        return perimeter;
    }

    @Override
    public String toString() {
        return "RectangleClass{" +
                "shortSideLength=" + shortSideLength +
                ", longsideLength=" + longsideLength +
                '}';
    }
}
