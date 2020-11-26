import java.util.ArrayList;

public class Calculator implements ICalculator {

    /**
     * Adds all numbers in the given array
     * @param numbers
     * @return Integer value of the sum
     */
    public int add(ArrayList<Integer> numbers) {
        int sum = numbers.stream().mapToInt(number -> number).sum();
        return sum;
    }

    /**
     * Subtracts all numbers in the given array
     * @param numbers
     * @return Integer value of substraction
     */
    public int subtract(ArrayList<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result -= number;
        }
        return result;
    }

    /**
     * Multiplies all numbers in the given array
     * @param numbers
     * @return Integer value of multiplication
     */
    public int muliply(ArrayList<Integer> numbers) {
        int result = 1;
        for(Integer number : numbers) {
            result = result * number;
        }
        return result;
    }

    /**
     * Divides the given dividend by the divisor
     * @param dividend
     * @param divisor
     * @return Integer value of division
     */
    public int divide(int dividend, int divisor) {
        if(divisor != 0)
            return dividend/divisor;
        else return -1;

    }
}
