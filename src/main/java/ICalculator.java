import java.util.ArrayList;

public interface ICalculator {

    /**
     * Adds all numbers in the given array
     * @param numbers
     * @return
     */
    public int add(ArrayList<Integer> numbers);

    /**
     * Subtracts all numbers in the given array
     * @param numbers
     * @return
     */
    public int subtract(ArrayList<Integer> numbers);

    /**
     * Multiplies all numbers in the given array
     * @param numbers
     * @return
     */
    public int muliply(ArrayList<Integer> numbers);

    /**
     * Divides the given dividend by the divisor
     * @param dividend
     * @param divisor
     * @return
     */
    public int divide(int dividend, int divisor);
}
