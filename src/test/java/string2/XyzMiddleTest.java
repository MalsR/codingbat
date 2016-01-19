package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class XyzMiddleTest {

    @Test
    public void returnsTrueWhenXYZIsInMiddleOfEvenLengthString_AndFromXYZRightHandSideHas4Chars() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertTrue(xyzMiddle.xyzMiddle("abcxyzabcd"));
    }

    @Test
    public void returnsTrueWhenXYZIsInMiddleOfEvenLengthString_AndFromXYZLeftHandSideHas4Chars() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertTrue(xyzMiddle.xyzMiddle("abcdxyzabc"));
    }

    @Test
    public void returnsTrueWhenXYZIsInMiddleOfEvenLengthString() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertTrue(xyzMiddle.xyzMiddle("xyzxyzxyz"));
    }

    @Test
    public void returnsTrueWhenXYZIsInMiddleOfEvenLengthStringIgnoringCase() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertTrue(xyzMiddle.xyzMiddle("abcdXyZabc"));
    }

    @Test
    public void returnsFalseWhenEvenLengthStringDoesNotHaveXYZ() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertFalse(xyzMiddle.xyzMiddle("byextzhai"));
    }

    @Test
    public void returnsFalseWhenXYZNotInMiddleOfEvenLengthString() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertFalse(xyzMiddle.xyzMiddle("byexyzhello"));
    }

    @Test
    public void returnsTrueWhenXYZInMiddleOfOddLengthString() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertTrue(xyzMiddle.xyzMiddle("byexyzbye"));
    }

    @Test
    public void returnsTrueWhenXYZInMiddleOfOddLengthStringIgnoringCase() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertTrue(xyzMiddle.xyzMiddle("byexYzbye"));
    }

    @Test
    public void returnsFalseWhenXYZNotInMiddleOfOddLengthString() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertFalse(xyzMiddle.xyzMiddle("byexyzb"));
    }

    @Test
    public void returnsFalseWhenStringIsEmpty() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertFalse(xyzMiddle.xyzMiddle(""));
    }

    @Test
    public void returnsFalseWhenStringLengthIsLessOne() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertFalse(xyzMiddle.xyzMiddle("x"));
    }

    @Test
    public void returnsFalseWhenStringLengthIsLessThanTwo() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertFalse(xyzMiddle.xyzMiddle("xy"));
    }

    @Test
    public void returnsTrueWhenStringContainsOnlyXYZ() {
        XyzMiddle xyzMiddle = new XyzMiddle();

        assertTrue(xyzMiddle.xyzMiddle("xyz"));
    }
}