package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class In3050Test {

    @Test
    public void returnsTrueIfBothArgumentsIsIn30And40RangeInclusive() {
        In3050 in3050 = new In3050();

        assertTrue(in3050.in3050(30, 39));
    }

    @Test
    public void returnsTrueIfBothArgumentsIsIn40And50RangeInclusive() {
        In3050 in3050 = new In3050();

        assertTrue(in3050.in3050(40, 50));
    }

    @Test
    public void returnsFalseIfBothArgumentsNotInRange() {
        In3050 in3050 = new In3050();

        assertFalse(in3050.in3050(39, 50));
        assertFalse(in3050.in3050(29, 39));
    }
}