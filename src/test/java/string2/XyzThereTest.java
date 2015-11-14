package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class XyzThereTest {

    @Test
    public void returnsTrueWhenStringContainsXyz() {
        XyzThere xyzThere = new XyzThere();

        assertTrue("Expected to return true since string contains xyz", xyzThere.xyzThere("abcxyz"));
    }

    @Test
    public void returnsTrueWhenStringOnlyContainsXya() {
        XyzThere xyzThere = new XyzThere();

        assertTrue("", xyzThere.xyzThere("xyz"));
    }

    @Test
    public void returnsFalseWhenStringDoesNotContainXyz() {
        XyzThere xyzThere = new XyzThere();

        assertFalse("Expected to return false since string does not contain xyz", xyzThere.xyzThere("abcxy"));
    }

    @Test
    public void returnsFalseWhenXyzDirectlyAppearsAfterFullStop() {
        XyzThere xyzThere = new XyzThere();

        assertFalse("Expected to return false since xyz appears after full stop '.'", xyzThere.xyzThere("abc.xyz"));
    }

    @Test
    public void returnsTrueWhenXyzAppearsBeforeFullStop() {
        XyzThere xyzThere = new XyzThere();

        assertTrue("", xyzThere.xyzThere("abcxyz.abc"));
    }

    @Test
    public void returnsTrueWhenXyzAppearsAfterFullStop() {
        XyzThere xyzThere = new XyzThere();

        assertTrue(xyzThere.xyzThere("abc.xyzbbxyz"));
    }
}