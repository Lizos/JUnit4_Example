import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CalculatorMultDivTest {

    Calculator _instance;

    @Before
    public void setUp() {
        _instance = new Calculator(true); // * and /
    }

    @Test
    public void multiplication() {
        assertEquals("Regular multiplication should work", _instance.calculate_sum_mult(3, 8), 24);
    }

    @Test
    public void division() {
        assertEquals("Regular division should work", _instance.calculate_diff_div(20, 5), 4);
    }
}