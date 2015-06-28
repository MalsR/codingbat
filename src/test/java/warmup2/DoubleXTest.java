package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleXTest {

    @Test
    public void returnsTrueIfFirstInstanceOfXIsFollowedByAnotherX() {
        DoubleX doubleX = new DoubleX();

        assertTrue(doubleX.doubleX("hexxllo"));
    }

    @Test
    public void returnsFalseIfNoXXPairsFound() {
        DoubleX doubleX = new DoubleX();

        assertFalse(doubleX.doubleX("axcxbx"));
    }

    @Test
    public void returnsTrueIfStringOnlyContainsXXPairs() {
        DoubleX doubleX = new DoubleX();

        assertTrue(doubleX.doubleX("xxxxxx"));
    }

    @Test
    public void returnsFalseIfFirstInstanceOfXIsNotFollowedByAnotherX() {
        DoubleX doubleX = new DoubleX();

        assertFalse(doubleX.doubleX("xaxx"));
    }

    @Test
    public void returnsFalseWhenStringIsEmpty() {
        DoubleX doubleX = new DoubleX();

        assertFalse(doubleX.doubleX(""));
    }

    @Test
    public void returnsFalseWhenStringDoesNotHaveAnyX() {
        DoubleX doubleX = new DoubleX();

        assertFalse(doubleX.doubleX("abc"));
    }
}