package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumDoubleTest {

    private SumDouble sumDouble;

    @Before
    public void setUp() throws Exception {
        this.sumDouble = new SumDouble();
    }

    @Test
    public void returnsSumIfBothNumbersNotEqual() {
        assertEquals(4, sumDouble.sumDouble(1,3));
    }

    @Test
    public void returnsDoubleOfSumIfNumbersAreEqual() {
        assertEquals(8, sumDouble.sumDouble(2,2));
    }

    @Test
    public void returnsSumIfBothNumbersAreNotEqualWithNegativeNumber() {
        assertEquals(1, sumDouble.sumDouble(2, -1));
    }
}