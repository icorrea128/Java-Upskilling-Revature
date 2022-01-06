package Day_1;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class CelciusToFaraeinheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsius ");
        double celcious = sc.nextDouble();

        double celciusToFarenheit = (celcious* (9/5) +32);

        System.out.println("The temperature in Fareinheit is " + celciusToFarenheit);

        System.out.println("Enter the Temperature in Fareinheit ");
        double fareinheit = sc.nextDouble();

        double fareinheitToCelicus = (fareinheit - 32) * (5/9);
        System.out.println("The temperature in Celicus is " + fareinheitToCelicus);
    }

}
