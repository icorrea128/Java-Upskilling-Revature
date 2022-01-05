package Day_2;

public class Calculator {
    int number1;
    int number2;
    int add(){
        int result = number1 + number2;
        return result;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        if(number1 < 10){
            this.number1 = 10;
            return;
        }
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        if(number2 < 90){
            this.number2 = 90;
        }
        this.number2 = number2;
    }

    public static String brand;
}

class CalculatorMainMethod {
    public static void main(String[] args) {
        Calculator.brand = "Texas Instruments";
        Calculator calc1 = new Calculator();
        calc1.setNumber1(10);
        calc1.setNumber2(80);
//        calc1.number1 = 10;
//        calc1.number2 = 5;
        int s1 = calc1.add();

        Calculator calc2 = new Calculator();
        calc2.setNumber1(15);
        calc2.setNumber2(80);
//        calc2.number1 = 7;
//        calc2.number2 = 5;
        int s2 = calc2.add();
        System.out.println("Sum of " + calc1.getNumber1() + " and " + calc1.getNumber2() + " is "  + s1 + " brand of calculator is " + Calculator.brand);
        System.out.println("Sum of " + calc2.getNumber1() + " and " + calc2.getNumber2() + " is "  + s2 + " brand of calculator is " + Calculator.brand);
    }
}
