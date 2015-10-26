package logic2;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoTeenSumTest {

    @Test
    public void returnsSumWhenAgesAreNotInTeenAgeRange() {
        NoTeenSum noTeenSum = new NoTeenSum();

        assertEquals(12, noTeenSum.noTeenSum(6, 4, 2));
    }

    @Test
    public void returnsZeroWhenAgesAreInTeenAgeRange() {
        NoTeenSum noTeenSum = new NoTeenSum();

        assertEquals(0, noTeenSum.noTeenSum(13, 14, 19));
    }

    @Test
    public void returnsSumWhenAgesAreInTeenAgeRangeAndAgeIsOnlyFifteenAndSixteen() {
        NoTeenSum noTeenSum = new NoTeenSum();

        assertEquals(46, noTeenSum.noTeenSum(15, 15, 16));
    }

    @Test
    public void returnsSumWhenAgesAreInMixedRange() {
        NoTeenSum noTeenSum = new NoTeenSum();

        assertEquals(20, noTeenSum.noTeenSum(13, 9, 11));
    }
}