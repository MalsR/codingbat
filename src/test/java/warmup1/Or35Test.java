package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Or35Test {

    @Test
    public void returnsFalseIfGivenNumberIsNegative() {
        Or35 or35 = new Or35();

        assertFalse(or35.or35(-3));
    }

    @Test
    public void returnsTrueIfGivenNumberIsMultipleOf3() {
        Or35 or35 = new Or35();

        assertTrue(or35.or35(12));
    }

    @Test
    public void returnsTrueIfGivenNumberIsMultipleOf5() {
        Or35 or35 = new Or35();

        assertTrue(or35.or35(25));
    }

    @Test
    public void returnsFalseIfGivenNumberIsNotMultipleOf3Or5() {
        Or35 or35 = new Or35();

        assertFalse(or35.or35(16));
    }
}