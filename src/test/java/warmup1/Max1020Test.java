package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Max1020Test {

    @Test
    public void returnLargerValueIfFirstArgumentIsLargerAndInTenTwentyRangeInclusive() {
        Max1020 max1020 = new Max1020();

        assertEquals(18, max1020.max1020(18, 12));
    }

    @Test
    public void returnsLargerValueIfSecondArgumentIsLargerAnInTenTwentyRangeInclusive() {
        Max1020 max1020 = new Max1020();

        assertEquals(20, max1020.max1020(19, 20));
    }

    @Test
    public void returnsZeroIfNumbersAreNotInRange() {
        Max1020 max1020 = new Max1020();

        assertEquals(0, max1020.max1020(2, 9));
    }

    @Test
    public void returnsLargerValueWhenFirstArgumentIsInRangeAndSecondIsNot() {
        Max1020 max1020 = new Max1020();

        assertEquals(19, max1020.max1020(19, 22));
    }

}