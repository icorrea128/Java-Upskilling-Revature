package Day_4.Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionArray {
    public static void main(String[] args) {
        int[] marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements? ");
        int size = sc.nextInt();
        marks = new int[size];
        for(int c =0; c<marks.length;c++){
            System.out.println("Enter element: ");
            marks[c] = sc.nextInt();
        }
        System.out.println("Elements you entered ");
        for(int c =0;c < marks.length;c++){
            System.out.println(marks[c]);
        }
        Arrays.sort(marks);
        System.out.println("The max is " + marks[0]);
        System.out.println("The min is " + marks[marks.length -1]);


    }

}
