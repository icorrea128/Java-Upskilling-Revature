package Day6;

public class CalculatorImplementation implements Calculator {

    @Override
    public Integer add(Integer intOne, Integer intTwo){
        return intOne + intTwo;
    }

    @Override
    public Integer subtract(Integer intOne, Integer intTwo){
        return intOne - intTwo;
    }

    @Override
    public Integer multiply(Integer intOne, Integer intTwo){
        return intOne * intTwo;
    }

    @Override
    public Integer divide(Integer intOne, Integer intTwo){
        return intOne / intTwo;
    }
}
