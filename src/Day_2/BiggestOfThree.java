package Day_2;

public class BiggestOfThree {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 11;
        int number3 = 12;

        if( number1 >= number2 && number1 >= number3){
            System.out.println(number1 + " is the largest number.");
        }
        else if (number3 >= number1 && number2 >= number3){
            System.out.println(number2 + " is the largest number.");
        }
        else{
            System.out.println(number3 + " is the largest number.");
        }
    }
}
