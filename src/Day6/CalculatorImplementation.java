package Day6;

public class CalculatorImplementation {


    @FunctionalInterface
    interface MathOperation {
        int operation(int number1, int number2);
    }

    public int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public void add(){
        MathOperation additionLambda = (number1,number2) -> number1 + number2;
        System.out.println("49 + 1 = " + operate(49 , 1, additionLambda));
    }

    public void subtraction(){
        MathOperation subtractionLambda = (number1,number2) -> number1 - number2;
        System.out.println("13 - 1 = " + operate(13 , 1, subtractionLambda));
    }

    public void multiply(){
        MathOperation multiplyLambda = (number1,number2) -> number1 * number2;
        System.out.println("7 * 7 = " + operate(7 , 7, multiplyLambda));
    }

    public void division(){
        MathOperation divisionLambda = (number1,number2) -> number1 / number2;
        System.out.println("24 + 3 = " + operate(24 , 3, divisionLambda));
    }


}
