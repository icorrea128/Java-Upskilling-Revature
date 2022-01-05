package Day_2;

import java.util.Scanner;

public class DisplayNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value n : ");
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++)
        {
            if(i%2 ==0){
                System.out.println(i + " is even");
            }else{
                System.out.println(i + " is odd");
            }
        }
    }
}
