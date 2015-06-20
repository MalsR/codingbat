package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IcyHotTest {

    @Test
    public void returnsTrueIfOneTempIsLessThanZeroAndOtherGreaterThanHundred() {
        IcyHot icyHot = new IcyHot();

        assertTrue(icyHot.icyHot(-1, 101));
        assertTrue(icyHot.icyHot(120, -101));
    }

    @Test
    public void returnsFalseIfOneTemIsOverZeroAndOtherIsGreaterThanHundred() {
        IcyHot icyHot = new IcyHot();

        assertFalse(icyHot.icyHot(20, 120));
    }

    @Test
    public void returnsFalseIfOneTempIsGreaterThanHundredIsOtherIsOverZero() {
        IcyHot icyHot = new IcyHot();

        assertFalse(icyHot.icyHot(102, 33));
    }

    @Test
    public void returnsFalseIfBotherTempsAreZero() {
        IcyHot icyHot = new IcyHot();

        assertFalse(icyHot.icyHot(0, 0));
    }

    @Test
    public void returnsFalseIfBotherTempsAreLessThanZero() {
        IcyHot icyHot = new IcyHot();

        assertFalse(icyHot.icyHot(-1, -5));
    }

}