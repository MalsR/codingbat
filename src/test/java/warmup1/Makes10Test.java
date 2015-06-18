package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Makes10Test {

    @Test
    public void returnsFalseIfNeitherNumberIsEqualToTen() {
        Makes10 makes10 = new Makes10();

        assertFalse(makes10.makes10(2, 9));
    }

    @Test
    public void returnsTrueIfEitherNumberIsEqualToTen() {
        Makes10 makes10 = new Makes10();

        assertTrue(makes10.makes10(10, 9));
    }

    @Test
    public void returnsTrueIfSumOfBothNumbersIsEqualToTen() {
        Makes10 makes10 = new Makes10();

        assertTrue(makes10.makes10(4, 6));
        assertTrue(makes10.makes10(10, 0));
    }

    @Test
    public void returnsFalseIsSumOfBothNumbersIsGreaterThanTen() {
        Makes10 makes10 = new Makes10();

        assertFalse(makes10.makes10(8, 9));
    }

    @Test
    public void returnsFalseIsSumOfBothNumbersIsLessThanTen() {
        Makes10 makes10 = new Makes10();

        assertFalse(makes10.makes10(2, 5));
    }
}