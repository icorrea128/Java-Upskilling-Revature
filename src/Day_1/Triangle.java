package Day_1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Triangles Height:");
        int height = sc.nextInt();
        System.out.println("Enter the Triangles Base:");
        int base = sc.nextInt();
        int area = (height*base)/2;
        System.out.println("The area of the triangle is " + area);
        System.out.println("Enter length of side 1:");
        int side1length = sc.nextInt();
        System.out.println("Enter the length of side 2: ");
        int side2length = sc.nextInt();
        System.out.println("Enter the length of side 3: ");
        int side3length = sc.nextInt();
        int perimeter = side1length + side2length + side3length;
        System.out.println("The perimeter of the triangle is " + perimeter );
    }
}
