package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumLimitTest {

    @Test
    public void returnsSumIfFirstParamHasSameNumberOfDigitsAsSum() {
        SumLimit sumLimit = new SumLimit();

        assertEquals(99, sumLimit.sumLimit(98, 1));
    }

    @Test
    public void returnsFirstParamIfSumDoesNotHaveSameNumOfDigitsAsFirstParam() {
        SumLimit sumLimit = new SumLimit();

        assertEquals(99, sumLimit.sumLimit(99, 2));
    }
}