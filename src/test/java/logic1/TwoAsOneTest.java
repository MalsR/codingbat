package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoAsOneTest {

    @Test
    public void returnsTrueWhenSumOfTwoIntegersEqualsTheOther() {
        TwoAsOne twoAsOne = new TwoAsOne();

        assertTrue(twoAsOne.twoAsOne(5, 11, 6));
    }

    @Test
    public void returnsFalseWhenSumOfTwoIntegersDoesNotEqualTheOther() {
        TwoAsOne twoAsOne = new TwoAsOne();

        assertFalse(twoAsOne.twoAsOne(1, 2, 2));
    }

    @Test
    public void returnsTrueWhenSumOfTwoIntegersEqualsTheOtherWithNegativeNumber() {
        TwoAsOne twoAsOne = new TwoAsOne();

        assertTrue(twoAsOne.twoAsOne(-2, 3, 5));
    }
}