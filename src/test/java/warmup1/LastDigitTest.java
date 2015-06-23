package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class LastDigitTest {

    @Test
    public void returnsFalseIfEitherNumberIsNegative() {
        LastDigit lastDigit = new LastDigit();

        assertFalse(lastDigit.lastDigit(-1, 2));
        assertFalse(lastDigit.lastDigit(2, -2));
    }

    @Test
    public void returnsTrueIfBothNumbersHaveSameLastDigit() {
        LastDigit lastDigit = new LastDigit();

        assertTrue(lastDigit.lastDigit(57, 117));
    }

    @Test
    public void returnsFalseIfBothNumbersDoesNotHaveSameLastDigit() {
        LastDigit lastDigit = new LastDigit();

        assertFalse(lastDigit.lastDigit(23, 99));
    }
}