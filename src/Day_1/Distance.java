package Day_1;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Point A's X Cordinate ");
        int pointAXCordinate = sc.nextInt();
        System.out.println("Enter Point A's Y Cordinate");
        int pointAYCordinate = sc.nextInt();
        System.out.println("Enter Point B's X Cordinate");
        int pointBXCordinate = sc.nextInt();
        System.out.println("Enter Point B Y Cordinate");
        int pointBYCordinate = sc.nextInt();
        int differenceBetweenX1X2 = pointAXCordinate - pointBXCordinate;
        int differenceBetweenY1Y2 = pointAYCordinate - pointBYCordinate;
        double distance = Math.sqrt(Math.pow(differenceBetweenX1X2, 2) + Math.pow(differenceBetweenY1Y2, 2));
        System.out.println("Distance from Point A to Point B is " + distance);
    }
}
