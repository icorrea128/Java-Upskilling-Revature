package Day_2;

public class Calculator {
    int number1;
    int number2;
    int add(){
        int result = number1 + number2;
        return result;
    }
}

class CalculatorMainMethod {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.number1 = 10;
        calc1.number2 = 5;
        int s1 = calc1.add();

        Calculator calc2 = new Calculator();
        calc2.number1 = 7;
        calc2.number2 = 5;
        int s2 = calc2.add();
        System.out.println(s1);
        System.out.println(s2);
    }
}
