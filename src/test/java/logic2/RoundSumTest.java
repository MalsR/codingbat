package logic2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoundSumTest {

    @Test
    public void returnSumOfRoundedUpValuesWhenAllRightmostDigitsAreFiveOrMore() {
        RoundSum roundSum = new RoundSum();

        assertEquals(90, roundSum.roundSum(15, 26, 39));
    }

    @Test
    public void returnsSumOfRoundedDownValuesWhenallRightmostDigitsAreLessThanFive() {
        RoundSum roundSum = new RoundSum();

        assertEquals(30, roundSum.roundSum(11, 24, 4));
    }
}