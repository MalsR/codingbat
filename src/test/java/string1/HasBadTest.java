package string1;

import org.junit.Test;

import static org.junit.Assert.*;

public class HasBadTest {

    @Test
    public void returnsTrueWhenCharsBadStartsFromIndexZero() {
        HasBad hasBad = new HasBad();

        assertTrue(hasBad.hasBad("badxx"));
    }

    @Test
    public void returnsTrueWhenCharsBadStartsFromIndexOne() {
        HasBad hasBad = new HasBad();

        assertTrue(hasBad.hasBad("xbadxx"));
    }

    @Test
    public void returnsFalseWhenCharsBadStartsFromAfterOne() {
        HasBad hasBad = new HasBad();

        assertFalse(hasBad.hasBad("xxbadxx"));
    }

    @Test
    public void returnsFalseWhenStringIsEmpty() {
        HasBad hasBad = new HasBad();

        assertFalse(hasBad.hasBad(""));
    }
}