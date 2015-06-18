package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NearHundredTest {

    @Test
    public void returnsTrueIfNumberIsWithinTenOfHundred() {
        NearHundred nearHundred = new NearHundred();

        assertTrue(nearHundred.nearHundred(95));
        assertTrue(nearHundred.nearHundred(90));
    }

    @Test
    public void returnsFalseIfNumberIsNotWithinTenOfHundred() {
        NearHundred nearHundred = new NearHundred();

        assertFalse(nearHundred.nearHundred(89));
    }

    @Test
    public void returnsTrueIfNumberIsWithinTenOf200() {
        NearHundred nearHundred = new NearHundred();

        assertTrue(nearHundred.nearHundred(195));
        assertTrue(nearHundred.nearHundred(190));
        assertTrue(nearHundred.nearHundred(102));
    }

    @Test
    public void returnsFalseIfNumberIsNotWithinTenOf200() {
        NearHundred nearHundred = new NearHundred();

        assertFalse(nearHundred.nearHundred(189));
        assertFalse(nearHundred.nearHundred(111));
    }


}