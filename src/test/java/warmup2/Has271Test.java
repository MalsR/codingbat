package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Has271Test {

    @Test
    public void returnsTrueIfArrayContains271Pattern() {
        Has271 has271 = new Has271();

        assertTrue(has271.has271(new int[]{1, 2, 7, 1}));
    }

    @Test
    public void returnsFalseIfArrayDoesContains271PatternWithMinus() {
        Has271 has271 = new Has271();

        assertTrue(has271.has271(new int[]{2, 7, -1}));
    }

    @Test
    public void returnsFalseIfArrayDoesNotContains271Pattern() {
        Has271 has271 = new Has271();

        assertFalse(has271.has271(new int[]{1, 2, 6, 1}));
    }
}