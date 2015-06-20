package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class In1020Test {

    @Test
    public void returnsTrueWhenFirstNumberIsWithinTenTwentyInclusive() {
        In1020 in1020 = new In1020();

        assertTrue(in1020.in1020(10, 21));
    }

    @Test
    public void returnsTrueWhenSecondNumberIsWithinTenTwentyInclusive() {
        In1020 in1020 = new In1020();

        assertTrue(in1020.in1020(20, 35));
    }

    @Test
    public void returnsFalseWhenFirstAndSecondNumberIsNotWithinTenTwenty() {
        In1020 in1020 = new In1020();

        assertFalse(in1020.in1020(23, 25));
    }
}