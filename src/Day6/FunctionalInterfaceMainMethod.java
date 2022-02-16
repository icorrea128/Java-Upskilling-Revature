package Day6;

public class FunctionalInterfaceMainMethod {
    public static void main(String[] args) {
        CalculatorImplementation calculator = new CalculatorImplementation();
        calculator.add();
        calculator.subtraction();
        calculator.multiply();
        calculator.division();
//        System.out.println(calculator.subtract(13,0));
//        System.out.println(calculator.multiply(7,7));
//        System.out.println(calculator.divide(24,3));
    }
}
