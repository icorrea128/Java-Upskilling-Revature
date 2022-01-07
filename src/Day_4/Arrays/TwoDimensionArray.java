package Day_4.Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many arrays ? ");
        int m = sc.nextInt();
        int[][]arr = new int[m][];
        for(int c = 0;c<m; c++){
            System.out.println("How many elements in " + c + "array ?");
            int n = sc.nextInt();
            arr[c] = new int[n];
        }
        System.out.println("Enter elements below");
        for(int c = 0; c<arr.length; c++){
            for(int d = 0;d <arr[c].length;d++){
                arr[c][d] = sc.nextInt();

            }
        }

        for(int c=0;c<arr.length;c++){
            for(int d=0;d<arr[c].length;d++){
                long count = Arrays.stream(arr).count();
                System.out.print(arr[c][d]+ count + " ");
                //Could not figure out how to add elements across a 2D Array
                //Suggestions?
            }
            System.out.println();
        }




    }

}
