package Day6;

public class FunctionalInterfaceMainMethod {
    public static void main(String[] args) {
        CalculatorImplementation calculator = new CalculatorImplementation();
        System.out.println(calculator.add(42,8));
        System.out.println(calculator.subtract(13,0));
        System.out.println(calculator.multiply(7,7));
        System.out.println(calculator.divide(24,3));
    }
}
