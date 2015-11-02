package logic2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenlySpacedTest {

    @Test
    public void returnsTrueIfNumbersAreEvenlySpaced() {
        EvenlySpaced evenlySpaced = new EvenlySpaced();

        assertTrue(evenlySpaced.evenlySpaced(2, 8, 5));
    }

    @Test
    public void returnsFalseWhenNumbersAreNotEvenlySpaced() {
        EvenlySpaced evenlySpaced = new EvenlySpaced();

        assertFalse(evenlySpaced.evenlySpaced(2, 13, 5));
    }
}