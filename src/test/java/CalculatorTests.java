import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CalculatorTests{

    Calculator calculator;
    ArrayList<Integer> list;
    @Before
    public void setup(){
        calculator = new Calculator();
        list = new ArrayList<>();
    }

    @Test
    public void testCalcAdd_addingTwoPositiveNumbers(){
        list.add(3);
        list.add(5);

        assertEquals(8, calculator.add(list));
    }

    @Test
    public void testCalcAdd_addingMultiplePositiveNumbers(){
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(2);

        assertEquals(20, calculator.add(list));
    }

    @Test
    public void testCalcAdd_addingMultipleNumbersWithNegatives(){
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(-8);

        assertEquals(10, calculator.add(list));
    }

    @Test
    public void testCalcAdd_addingNegativeValues(){
        list.add(-3);
        list.add(-5);

        assertEquals(-8, calculator.add(list));
    }

    @Test
    public void testCalcSubstract_substractMultipleValues(){
        list.add(10);
        list.add(15);
        list.add(20);

        assertEquals(-45, calculator.subtract(list));
    }

    @Test
    public void testCalcSubstract_substractMultipleValuesWithNegatives(){
        list.add(10);
        list.add(15);
        list.add(-20);

        assertEquals(-5, calculator.subtract(list));
    }

    @Test
    public void testCalcSubstract_substractMultipleValuesWithZeros(){
        list.add(0);

        assertEquals(0, calculator.subtract(list));
    }

    @Test
    public void testCalcMultiply_multipleValues(){
        list.add(4);
        list.add(2);
        list.add(1);

        assertEquals(8, calculator.muliply(list));
    }

    @Test
    public void testCalcMultiply_withZero(){
        list.add(4);
        list.add(2);
        list.add(0);

        assertEquals(0, calculator.muliply(list));
    }

    @Test
    public void testCalcMultiply_withNegativeValues(){
        list.add(4);
        list.add(2);
        list.add(-2);

        assertEquals(-16, calculator.muliply(list));
    }

    @Test
    public void testCalcDivide_validPositiveValues(){
        assertEquals(5, calculator.divide(15,3));
    }
    @Test
    public void testCalcDivide_divisorIsZeroReturnsNegativeOne(){
        assertEquals(-1, calculator.divide(15,0));
    }
    @Test
    public void testCalcDivide_negativeValues(){
        assertEquals(5, calculator.divide(-15,-3));
    }


    @Test
    public void testCalcDivide_roundNumberWhenResultFloat(){
        assertEquals(7, calculator.divide(-15,-2));
    }

}
