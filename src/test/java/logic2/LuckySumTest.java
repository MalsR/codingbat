package logic2;

import org.junit.Test;

import static org.junit.Assert.*;

public class LuckySumTest {

    @Test
    public void returnsSumWhenAnyNumberIsNot13() {
        LuckySum luckySum = new LuckySum();

        assertEquals(22, luckySum.luckySum(2, 11, 9));
    }

    @Test
    public void returnsZeroWhenFirstArgumentIs13() {
        LuckySum luckySum = new LuckySum();

        assertEquals(0, luckySum.luckySum(13, 2, 3));
    }

    @Test
    public void returnsFirstParamWhenSecondArgumentIs13() {
        LuckySum luckySum = new LuckySum();

        assertEquals(11, luckySum.luckySum(11, 13, 23));
    }

    @Test
    public void returnsSumOfFirstAndSecondParameterWhenThirdParamIs13() {
        LuckySum luckySum = new LuckySum();

        assertEquals(12, luckySum.luckySum(6, 6, 13));
    }
}