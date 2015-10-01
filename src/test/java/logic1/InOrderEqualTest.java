package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class InOrderEqualTest {

    @Test
    public void returnsTrueWhenNumbersHaveStrictIncreasingOrder() {
        InOrderEqual inOrderEqual = new InOrderEqual();

        assertTrue(inOrderEqual.inOrderEqual(2, 5, 11, false));
        assertTrue(inOrderEqual.inOrderEqual(1, 2, 4, false));
    }

    @Test
    public void returnsFalseWhenNumbersHaveNoStrictIncreasingOrder() {
        InOrderEqual inOrderEqual = new InOrderEqual();

        assertFalse(inOrderEqual.inOrderEqual(5, 5, 2, false));
        assertFalse(inOrderEqual.inOrderEqual(5, 5, 7, false));
    }

    @Test
    public void returnsTrueWhenNumbersIncludingNegativeHaveStrictIncreasingOrder() {
        InOrderEqual inOrderEqual = new InOrderEqual();

        assertTrue(inOrderEqual.inOrderEqual(-5, 0, 10, false));
    }
}