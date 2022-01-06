package Day_1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the long side of the rectangle");
        int longSideLength = sc.nextInt();
        System.out.println("Enter the length of the short side of the rectangle ");
        int shortSideLength = sc.nextInt();
        int area = longSideLength *shortSideLength;
        int perimeter = longSideLength*2 + shortSideLength*2;
        System.out.println("Area of the Rectangle is " +area);
        System.out.println("Perimeter of the Rectangle is " + perimeter);
    }
}
