package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Last2Test {

    @Test
    public void returnsOneWhenStringSubString2HasOneInstance() {
        Last2 last2 = new Last2();

        assertEquals(1, last2.last2("hixxhi"));
        assertEquals(1, last2.last2("xaxxaxaxx"));
    }

    @Test
    public void returnsTwoWhenStringSubString2HasTwoInstances() {
        Last2 last2 = new Last2();

        assertEquals(2, last2.last2("axxxaaxx"));
    }

    @Test
    public void returnsZeroWhenStringIsBlank() {
        Last2 last2 = new Last2();

        assertEquals(0, last2.last2(""));
    }

    @Test
    public void returnsZeroWhenStringLengthIsOnlyOne() {
        Last2 last2 = new Last2();

        assertEquals(0, last2.last2("x"));
    }
}