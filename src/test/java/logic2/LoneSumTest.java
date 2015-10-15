package logic2;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoneSumTest {

    @Test
    public void returnsSumWhenNumbersAreAllDifferent() {
        LoneSum loneSum = new LoneSum();

        assertEquals(10, loneSum.loneSum(5, 3, 2));
    }

    @Test
    public void returnsUnequalNumberWhenTwoNumbersAreEqual() {
        LoneSum loneSum = new LoneSum();

        assertEquals(5, loneSum.loneSum(5, 3, 3));
        assertEquals(2, loneSum.loneSum(5, 2, 5));
        assertEquals(3, loneSum.loneSum(5, 5, 3));
    }

    @Test
    public void returnsZeroWhenAllNumbersAreEqual() {
        LoneSum loneSum = new LoneSum();

        assertEquals(0, loneSum.loneSum(3, 3, 3));
    }
}