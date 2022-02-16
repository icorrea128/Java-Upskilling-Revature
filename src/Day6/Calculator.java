package Day6;

import java.math.BigInteger;

public interface Calculator<I extends Integer> {
    I add(Integer intOne, Integer intTwo);

    I subtract(Integer intOne, Integer intTwo);

    I multiply(Integer intOne, Integer intTwo);

    I divide(Integer intOne, Integer intTwo);
}
