package Day_1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the triangle");
        int radius = sc.nextInt();
        double area = Math.PI * Math.pow(radius,2);
        double circumference = Math.PI * (2*radius);
        System.out.println("Area of the Circle is " + area);
        System.out.println("Circumference of the Circle is " +circumference);
    }
}
