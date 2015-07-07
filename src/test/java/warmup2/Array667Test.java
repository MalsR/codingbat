package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Array667Test {

    @Test
    public void returnsCorrectNumberOfSixesPairs() {
        Array667 array667 = new Array667();

        assertEquals(2, array667.array667(new int[]{1,2,6,6,3,6,6}));
    }

    @Test
    public void returnsZeroWhenNoSixPairsExists() {
        Array667 array667 = new Array667();

        assertEquals(0, array667.array667(new int[]{1,2,6,3,6,8}));
    }

    @Test
    public void returnsCorrectNumberOfSixSevenPairs() {
        Array667 array667 = new Array667();

        assertEquals(2, array667.array667(new int[]{1,2,6,7,3,6,7,6}));
    }
}