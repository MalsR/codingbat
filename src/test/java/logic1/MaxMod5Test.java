package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMod5Test {

    @Test
    public void returnsMaxNumber() {
        MaxMod5 maxMod5 = new MaxMod5();

        assertEquals(5, maxMod5.maxMod5(5, 2));
    }

    @Test
    public void returnsLowestNumberWhenRemainderDividedByFiveIsTheSame() {
        MaxMod5 maxMod5 = new MaxMod5();

        assertEquals(7, maxMod5.maxMod5(7, 12));
    }
}