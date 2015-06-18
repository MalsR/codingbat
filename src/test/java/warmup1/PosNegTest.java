package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PosNegTest {

    @Test
    public void returnsTrueIfFirstArgumentIsPositiveSecondArgumentIsNegative() {
        PosNeg posNeg = new PosNeg();

        assertTrue(posNeg.posNeg(1, -1, false));
    }

    @Test
    public void returnsTrueIfFirstArgumentIsNegativeSecondArgumentIsPositive() {
        PosNeg posNeg = new PosNeg();

        assertTrue(posNeg.posNeg(-7, 3, false));
    }

    @Test
    public void returnsFalseIfFirstArgumentIsNegativeSecondArgumentIsPositiveAndNegativeIsTrue() {
        PosNeg posNeg = new PosNeg();

        assertFalse(posNeg.posNeg(-7, 3, true));
    }

    @Test
    public void returnsTrueIfBothNumbersAreNegativeAndLastArgumentIsTrue() {
        PosNeg posNeg = new PosNeg();

        assertTrue(posNeg.posNeg(-7, -3, true));
    }

    @Test
    public void returnsFalseIfBothNumbersAreNegativeAndLastArgumentIsFalse() {
        PosNeg posNeg = new PosNeg();

        assertFalse(posNeg.posNeg(-7, -3, false));
    }

    @Test
    public void returnsFalseIfBothNumbersArePositiveAndLastArgumentIsFalse() {
        PosNeg posNeg = new PosNeg();

        assertFalse(posNeg.posNeg(7, 3, false));
    }

    @Test
    public void returnsFalseIfBothNumbersArePositiveAndLastArgumentIsTrue() {
        PosNeg posNeg = new PosNeg();

        assertFalse(posNeg.posNeg(7, 3, true));
    }

}