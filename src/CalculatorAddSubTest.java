import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorAddSubTest {

    Calculator _instance;

    @Before
    public void setUp() {
        _instance = new Calculator(false); // + and -
    }

    @Test
    public void addition() {
        assertEquals("Regular addition should work", _instance.calculate_sum_mult(3, 8), 11);

    }

    @Test
    public void addition_2() {
        assertEquals("Regular addition should work", _instance.calculate_sum_mult(44, 38), 82);
    }


    @Test
    public void subtraction() {
        assertEquals("Regular subtraction should work", _instance.calculate_diff_div(42, 2), 40);
    }

    @Test
    public void subtractionWrong() {
        assertNotEquals("Regular subtraction should work", _instance.calculate_diff_div(42, 2), 32);
    }

}